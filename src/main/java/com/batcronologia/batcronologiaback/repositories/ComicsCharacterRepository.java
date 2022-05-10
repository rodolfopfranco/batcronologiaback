package com.batcronologia.batcronologiaback.repositories;

import com.batcronologia.batcronologiaback.entities.ComicsCharacter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicsCharacterRepository extends JpaRepository<ComicsCharacter, Long> {
    Page<ComicsCharacter> findAll(Pageable pageable);
    Page<ComicsCharacter> findByAppearances_id(Long bookchronoId, Pageable pageable);
}
