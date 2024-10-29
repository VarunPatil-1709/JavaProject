package com.example.demo.service;
import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import com.example.demo.reposiratory.CategoryRepository;


public class CategoryService {
    private CategoryRepository categoryRepository;

    // Constructor to initialize the repository
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // Method to find all categories
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    // Method to find a category by ID
    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    // Method to create a new category
    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
