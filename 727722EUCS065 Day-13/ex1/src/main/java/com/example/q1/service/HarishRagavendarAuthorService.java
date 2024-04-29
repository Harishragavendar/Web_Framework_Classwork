package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.HarishRagavendarAuthor;
import com.example.q1.repository.HarishRagavendarAuthorRepository;

@Service
public class HarishRagavendarAuthorService {
    @Autowired
    private HarishRagavendarAuthorRepository authorRepository;

    public HarishRagavendarAuthor saveAuthor(HarishRagavendarAuthor author) {
        return authorRepository.save(author);
    }

    public HarishRagavendarAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<HarishRagavendarAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public HarishRagavendarAuthor updateAuthor(Long id, HarishRagavendarAuthor author) {
        HarishRagavendarAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
