package com.bookstore.catalog;

import com.bookstore.catalog.domain.Product;
import com.bookstore.catalog.domain.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.math.BigDecimal;

@SpringBootApplication
public class CatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductRepository repository) {
        return args -> {
            // 1. Create a test product
        if(!repository.existsByCode("P101"))
        {
            Product product = new Product();
            product.setCode("P101");
            product.setName("The Clean Coder");
            product.setDescription("A Code of Conduct for Professional Programmers");
            product.setPrice(new BigDecimal("29.99"));

            repository.save(product);
            System.out.println("✅ Domain Test Successful: Product saved to Database!");
        }
        else
        {
            System.out.println("ℹ️ Product P101 already exists. Skipping insert.");
        }
        };

    }
}