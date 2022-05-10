package com.batcronologia.batcronologiaback.services;

import com.batcronologia.batcronologiaback.entities.ComicsCharacter;
import com.batcronologia.batcronologiaback.repositories.ComicsCharacterRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ComicsCharacterService {

    private final ComicsCharacterRepository comicsCharacterRepository;

    public ComicsCharacterService(ComicsCharacterRepository comicsCharacterRepository) {
        this.comicsCharacterRepository = comicsCharacterRepository;
    }

    public ComicsCharacter saveComicsCharacter(ComicsCharacter comicsCharacter){
        return this.comicsCharacterRepository.save(comicsCharacter);
    }

    public Page<ComicsCharacter> listComicsCharacter(Pageable pageable){
        return this.comicsCharacterRepository.findAll(pageable);
    }

    public Page<ComicsCharacter> listComicsCharacterByIssue(Pageable pageable, Long idBookChrono){
        return this.comicsCharacterRepository.findByAppearances_id(idBookChrono, pageable);
    }

    public ComicsCharacter findbyComicsCharacter(Long id){
        Optional<ComicsCharacter> characterOptional = this.comicsCharacterRepository.findById(id);
        return characterOptional.orElseThrow(() -> new EntityNotFoundException("Character not found"));
    }

    public ComicsCharacter updateComicsCharacter(ComicsCharacter comicsCharacter, Long id){
        ComicsCharacter comicsCharacterFound = this.findbyComicsCharacter(id);
        comicsCharacter.setId(id);
        return this.comicsCharacterRepository.save(comicsCharacter);
    }

    public void removeComicsCharacter(Long id){
        ComicsCharacter comicsCharacterFound = this.findbyComicsCharacter(id);
        this.comicsCharacterRepository.delete(comicsCharacterFound);
    }
}
