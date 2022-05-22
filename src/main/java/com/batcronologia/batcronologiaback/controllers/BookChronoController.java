package com.batcronologia.batcronologiaback.controllers;

import com.batcronologia.batcronologiaback.dto.bookchrono.BookChronoMapper;
import com.batcronologia.batcronologiaback.dto.bookchrono.GetBookChronoDTO;
import com.batcronologia.batcronologiaback.dto.bookchrono.SaveBookChronoDTO;
import com.batcronologia.batcronologiaback.entities.BookChrono;
import com.batcronologia.batcronologiaback.services.BookChronoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/bookChronos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookChronoController {

    private final BookChronoService bookChronoService;

    public BookChronoController(BookChronoService bookChronoService) {
        this.bookChronoService = bookChronoService;
    }

    @GetMapping
    public ResponseEntity<Page<GetBookChronoDTO>> findAllBookChronos(@PageableDefault(value = Integer.MAX_VALUE) Pageable pageable){
        return ResponseEntity.ok(
                this.bookChronoService.listBookChrono(pageable)
                        .map(BookChronoMapper::fromEntity)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<GetBookChronoDTO> findBookChrono(@PathVariable Long id){
        BookChrono bookChrono = this.bookChronoService.findByBookChrono(id);
        return ResponseEntity.ok(BookChronoMapper.fromEntity(bookChrono));
    }

    @PostMapping
    public ResponseEntity<GetBookChronoDTO>  saveBookChrono(@RequestBody SaveBookChronoDTO dto){
        BookChrono bookChrono = this.bookChronoService.saveBookChrono(BookChronoMapper.fromDTO(dto));
        return ResponseEntity.ok(BookChronoMapper.fromEntity(bookChrono));
    }

    @PutMapping("{id}")
    public ResponseEntity<GetBookChronoDTO> updateBookChrono(@RequestBody SaveBookChronoDTO dto, @PathVariable Long id){
        try{
            BookChrono bookChrono = bookChronoService.updateBookChrono(BookChronoMapper.fromDTO(dto), id);
            return ResponseEntity.ok(BookChronoMapper.fromEntity(bookChrono));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<GetBookChronoDTO> removeBookChrono(@PathVariable Long id){
        try{
            this.bookChronoService.removeBookChrono(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

}
