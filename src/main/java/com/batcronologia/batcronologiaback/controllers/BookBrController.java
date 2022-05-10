package com.batcronologia.batcronologiaback.controllers;

import com.batcronologia.batcronologiaback.dto.bookbr.BookBrMapper;
import com.batcronologia.batcronologiaback.dto.bookbr.GetBookBrDTO;
import com.batcronologia.batcronologiaback.dto.bookbr.SaveBookBrDTO;
import com.batcronologia.batcronologiaback.entities.BookBr;
import com.batcronologia.batcronologiaback.services.BookBrService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/bookBrs")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookBrController {

    private final BookBrService bookBrService;

    public BookBrController(BookBrService bookBrService) {
        this.bookBrService = bookBrService;
    }

    @GetMapping
    public ResponseEntity<Page<GetBookBrDTO>> findAllBookBrs(@PageableDefault Pageable pageable){
        return ResponseEntity.ok(
                this.bookBrService.listBookBr(pageable)
                        .map(BookBrMapper::fromEntity)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<GetBookBrDTO> findBookBr(@PathVariable Long id){
        BookBr bookBr = this.bookBrService.findByBookBr(id);
        return ResponseEntity.ok(BookBrMapper.fromEntity(bookBr));
    }

    @PostMapping
    public ResponseEntity<GetBookBrDTO>  saveBookBr(@RequestBody SaveBookBrDTO dto){
        BookBr bookBr = this.bookBrService.saveBookBr(BookBrMapper.fromDTO(dto));
        return ResponseEntity.ok(BookBrMapper.fromEntity(bookBr));
    }

    @PutMapping("{id}")
    public ResponseEntity<GetBookBrDTO> updateBookBr(@RequestBody SaveBookBrDTO dto, @PathVariable Long id){
        try{
            BookBr bookBr = bookBrService.updateBookBr(BookBrMapper.fromDTO(dto), id);
            return ResponseEntity.ok(BookBrMapper.fromEntity(bookBr));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<GetBookBrDTO> removeBookBr(@PathVariable Long id){
        try{
            this.bookBrService.removeBookBr(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }
}
