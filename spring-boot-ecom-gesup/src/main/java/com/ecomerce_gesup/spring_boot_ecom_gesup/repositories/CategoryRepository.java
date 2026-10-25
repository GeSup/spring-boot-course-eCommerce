package com.ecomerce_gesup.spring_boot_ecom_gesup.repositories;

import com.ecomerce_gesup.spring_boot_ecom_gesup.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByCategoryName(String categoryName);
}
