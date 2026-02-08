package com.bookstore.catalog.api.product;

import com.bookstore.catalog.api.dto.ProductDTO;
import com.bookstore.catalog.api.exception.ProductNotFoundException;
import com.bookstore.catalog.domain.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    // 1. Standardize to camelCase (lowercase first letter)
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    // 2. Fix the constructor assignments
    public ProductController(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @GetMapping
    public List<ProductDTO> getProducts() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toDTO)
                .toList();
    }

    @GetMapping("/{code}")
    public ProductDTO getProductByCode(@PathVariable String code) {
        return productRepository.findByCode(code)
                .map(productMapper::toDTO)
                .orElseThrow(() -> new ProductNotFoundException(code));
    }

    @GetMapping("/search")
    public List<ProductDTO> searchProducts(@RequestParam String name) {
       List<ProductDTO> products = productRepository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(productMapper::toDTO)
                .toList();

        if (products.isEmpty()){
            throw ProductNotFoundException.forSearch(name);
        }
        return products;
    }
}