package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Author;
import com.example.demo.reposiratory.AuthorRepository;

public class AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    // Method to find all authors
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    // Method to find an author by ID
    public Author findAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    // Method to create a new author
    public void createAuthor(Author author) {
        authorRepository.save(author);
    }

    // Method to update an existing author
    public Author updateAuthor(Long id, Author updatedAuthor) {
        Optional<Author> existingAuthorOpt = authorRepository.findById(id);
        if (existingAuthorOpt.isPresent()) {
            Author existingAuthor = existingAuthorOpt.get();
            existingAuthor.setName(updatedAuthor.getName());
            // Update other fields as necessary
            authorRepository.save(existingAuthor);
            return existingAuthor; // Return updated author
        }
        return null; // Author not found
    }

    // Method to delete an author by ID
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
