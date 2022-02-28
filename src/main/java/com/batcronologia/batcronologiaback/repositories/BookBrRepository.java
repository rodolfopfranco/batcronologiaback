package com.batcronologia.batcronologiaback.repositories;

import com.batcronologia.batcronologiaback.entities.BookBr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBrRepository extends JpaRepository<BookBr, Long> {
    Page<BookBr> findAll(Pageable pageable);
}
