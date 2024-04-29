package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.HarishRagavendarAuthor;
import com.example.q1.model.HarishRagavendarBook;
import com.example.q1.repository.HarishRagavendarAuthorRepository;
import com.example.q1.repository.HarishRagavendarBookRepository;

@Service
public class HarishRagavendarBookService {
    @Autowired
    private HarishRagavendarBookRepository bookRepository;
@Autowired
private HarishRagavendarAuthorRepository authorRepository;
    public HarishRagavendarBook saveBook(Long authorId, HarishRagavendarBook book) {
        HarishRagavendarAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public HarishRagavendarBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

