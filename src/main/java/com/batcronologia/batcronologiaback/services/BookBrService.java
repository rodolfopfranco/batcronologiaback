package com.batcronologia.batcronologiaback.services;

import com.batcronologia.batcronologiaback.entities.BookBr;
import com.batcronologia.batcronologiaback.repositories.BookBrRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class BookBrService {
    private final BookBrRepository bookBrRepository;

    public BookBrService(BookBrRepository bookBrRepository) {
        this.bookBrRepository = bookBrRepository;
    }

    public BookBr saveBookBr(BookBr bookBr){
        return this.bookBrRepository.save(bookBr);
    }

    public Page<BookBr> listBookBr(Pageable pageable){
        return this.bookBrRepository.findAll(pageable);
    }

    public BookBr findByBookBr(Long id){
        Optional<BookBr> bookBrOptional = this.bookBrRepository.findById(id);
        return bookBrOptional.orElseThrow(() -> new EntityNotFoundException("BookBr not found"));
    }

    public BookBr updateBookBr(BookBr bookBr, Long id){
        BookBr bookBrFound = this.findByBookBr(id);
        bookBr.setId(id);
        return this.bookBrRepository.save(bookBr);
    }

    public void removeBookBr(Long id){
        BookBr bookBrFound = this.findByBookBr(id);
        this.bookBrRepository.delete(bookBrFound);
    }
}
