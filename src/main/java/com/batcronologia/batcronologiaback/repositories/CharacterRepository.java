package com.batcronologia.batcronologiaback.repositories;

import com.batcronologia.batcronologiaback.entities.Character;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
    Page<Character> findAll(Pageable pageable);
}
