package com.example.demo.reposiratory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Author;

public interface AuthorRepository extends JpaRepository<Author,Long> {

}
