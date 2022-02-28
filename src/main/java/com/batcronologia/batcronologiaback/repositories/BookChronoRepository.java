package com.batcronologia.batcronologiaback.repositories;

import com.batcronologia.batcronologiaback.entities.BookChrono;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookChronoRepository extends JpaRepository<BookChrono, Long> {
    Page<BookChrono> findAll(Pageable pageable);
}
