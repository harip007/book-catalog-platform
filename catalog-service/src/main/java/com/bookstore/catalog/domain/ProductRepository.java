package com.bookstore.catalog.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByCode(String code);
    boolean existsByCode(String code);
    // Add this for the name search
    List<Product> findByNameContainingIgnoreCase(String name);
}