package com.example.cw2.service;

import com.example.cw2.model.HarishRagavendarBook;
import com.example.cw2.repository.HarishRagavendarBookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HarishRagavendarBookService {
    private final HarishRagavendarBookRepo bookRepo;

    public HarishRagavendarBookService(HarishRagavendarBookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public HarishRagavendarBook createBook(HarishRagavendarBook Book) {
        return bookRepo.save(Book);
    }
    public List<HarishRagavendarBook> getAllBooks() {
        return bookRepo.findAll();
    }
    public HarishRagavendarBook getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public HarishRagavendarBook updateBookById(Long id,HarishRagavendarBook book){
        HarishRagavendarBook b = bookRepo.findById(id).orElse(null);
        if(b!=null){
            b.setAuthor(book.getAuthor());
            b.setAvailableCopies(book.getAvailableCopies());
            b.setTitle(book.getTitle());
            b.setTotalCopies(book.getTotalCopies());
            bookRepo.save(b);
        }
        return b;
    }
}
