package com.example.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.HarishRagavendarAuthor;
import com.example.q1.model.HarishRagavendarBook;
import com.example.q1.service.HarishRagavendarAuthorService;
import com.example.q1.service.HarishRagavendarBookService;

@RestController
public class HarishRagavendarAuthorController {
    @Autowired
    private HarishRagavendarAuthorService authorService;
@Autowired
private HarishRagavendarBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<HarishRagavendarAuthor> createAuthor(@RequestBody HarishRagavendarAuthor author) {
        HarishRagavendarAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<HarishRagavendarBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody HarishRagavendarBook book) {
        HarishRagavendarBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<HarishRagavendarAuthor> getAuthorById(@PathVariable Long authorId) {
        HarishRagavendarAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<HarishRagavendarAuthor>> getAllAuthors() {
        List<HarishRagavendarAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<HarishRagavendarAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody HarishRagavendarAuthor author) {
        HarishRagavendarAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
