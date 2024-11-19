package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}
