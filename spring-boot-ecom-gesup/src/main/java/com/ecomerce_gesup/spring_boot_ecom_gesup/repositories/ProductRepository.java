package com.ecomerce_gesup.spring_boot_ecom_gesup.repositories;

import com.ecomerce_gesup.spring_boot_ecom_gesup.model.Category;
import com.ecomerce_gesup.spring_boot_ecom_gesup.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryOrderByPriceAsc(Category category, Pageable pageable);

    Page<Product> findByProductNameContainsIgnoreCase(String keyword, Pageable pageable);

    Optional<Product> findFirstByCategoryAndProductNameLikeIgnoreCase(Category category, String productName);
}
