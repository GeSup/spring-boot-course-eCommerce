package com.ecomerce_gesup.spring_boot_ecom_gesup.service;

import com.ecomerce_gesup.spring_boot_ecom_gesup.payload.CategoryDTO;
import com.ecomerce_gesup.spring_boot_ecom_gesup.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
