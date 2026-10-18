package com.ecomerce_gesup.spring_boot_ecom_gesup.service;

import com.ecomerce_gesup.spring_boot_ecom_gesup.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);

    String deleteCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}
