package com.batcronologia.batcronologiaback.services;

import com.batcronologia.batcronologiaback.entities.BookChrono;
import com.batcronologia.batcronologiaback.repositories.BookChronoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class BookChronoService {

    private final BookChronoRepository bookChronoRepository;

    public BookChronoService(BookChronoRepository bookChronoRepository) {
        this.bookChronoRepository = bookChronoRepository;
    }

    public BookChrono saveBookChrono(BookChrono bookChrono){
        return this.bookChronoRepository.save(bookChrono);
    }

    public Page<BookChrono> listBookChrono(Pageable pageable){
        return this.bookChronoRepository.findAll(pageable);
    }

    public BookChrono findByBookChrono(Long id){
        Optional<BookChrono> bookChronoOptional = this.bookChronoRepository.findById(id);
        return bookChronoOptional.orElseThrow(() -> new EntityNotFoundException("BookChrono not found"));
    }

    public BookChrono updateBookChrono(BookChrono bookChrono, Long id){
        BookChrono bookChronoFound = this.findByBookChrono(id);
        bookChrono.setId(id);
        return this.bookChronoRepository.save(bookChrono);
    }

    public void removeBookChrono(Long id){
        BookChrono bookChronoFound = this.findByBookChrono(id);
        this.bookChronoRepository.delete(bookChronoFound);
    }
}
