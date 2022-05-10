package com.batcronologia.batcronologiaback.controllers;

import com.batcronologia.batcronologiaback.dto.comicsCharacter.ComicsCharacterMapper;
import com.batcronologia.batcronologiaback.dto.comicsCharacter.GetComicsCharacterDTO;
import com.batcronologia.batcronologiaback.dto.comicsCharacter.SaveComicsCharacterDTO;
import com.batcronologia.batcronologiaback.entities.ComicsCharacter;
import com.batcronologia.batcronologiaback.services.ComicsCharacterService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/comicsCharacter")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ComicsCharacterController {
    private final ComicsCharacterService comicsCharacterService;

    public ComicsCharacterController(ComicsCharacterService comicsCharacterService) {
        this.comicsCharacterService = comicsCharacterService;
    }

    @GetMapping
    public ResponseEntity<Page<GetComicsCharacterDTO>> findAllComicsCharacters(@PageableDefault Pageable pageable){
        return ResponseEntity.ok(
                this.comicsCharacterService.listComicsCharacter(pageable)
                        .map(ComicsCharacterMapper::fromEntity)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<GetComicsCharacterDTO> findComicsCharacter(@PathVariable Long id){
        ComicsCharacter comicsCharacter = this.comicsCharacterService.findbyComicsCharacter(id);
        return ResponseEntity.ok(ComicsCharacterMapper.fromEntity(comicsCharacter));
    }

    @PostMapping
    public ResponseEntity<GetComicsCharacterDTO>  saveComicsCharacter(@RequestBody SaveComicsCharacterDTO dto){
        ComicsCharacter comicsCharacter = this.comicsCharacterService.saveComicsCharacter(ComicsCharacterMapper.fromDTO(dto));
        return ResponseEntity.ok(ComicsCharacterMapper.fromEntity(comicsCharacter));
    }

    @PutMapping("{id}")
    public ResponseEntity<GetComicsCharacterDTO> updateComicsCharacter(@RequestBody SaveComicsCharacterDTO dto, @PathVariable Long id){
        try{
            ComicsCharacter comicsCharacter = comicsCharacterService.updateComicsCharacter(ComicsCharacterMapper.fromDTO(dto), id);
            return ResponseEntity.ok(ComicsCharacterMapper.fromEntity(comicsCharacter));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<GetComicsCharacterDTO> removeComicsCharacter(@PathVariable Long id){
        try{
            this.comicsCharacterService.removeComicsCharacter(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

}
