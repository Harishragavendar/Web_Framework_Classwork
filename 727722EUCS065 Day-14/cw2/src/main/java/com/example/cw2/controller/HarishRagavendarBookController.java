package com.example.cw2.controller;

import com.example.cw2.model.HarishRagavendarBook;
import com.example.cw2.service.HarishRagavendarBookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class HarishRagavendarBookController {
    private final HarishRagavendarBookService bookService;

    public HarishRagavendarBookController(HarishRagavendarBookService BookService) {
        this.bookService = BookService;
    }

    @PostMapping
    public ResponseEntity<HarishRagavendarBook> createBook(@RequestBody HarishRagavendarBook Book) {
        HarishRagavendarBook createdBook = bookService.createBook(Book);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }

    @GetMapping
    public ResponseEntity<List<HarishRagavendarBook>> getAllBooks() {
        List<HarishRagavendarBook> Books = bookService.getAllBooks();
        return ResponseEntity.ok(Books);
    }
    @PutMapping("/{bookId}")
    public HarishRagavendarBook updateBookById(@PathVariable Long bookId,@RequestBody HarishRagavendarBook book){
        HarishRagavendarBook b = bookService.updateBookById(bookId, book);
        return b;
    }
    @GetMapping("/{bookId}")
    public HarishRagavendarBook getBookById(@PathVariable Long bookId) {
        HarishRagavendarBook book = bookService.getBookById(bookId);
        return book;
    }
}
