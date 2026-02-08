package com.bookstore.catalog.api.product;

import com.bookstore.catalog.api.dto.ProductDTO;
import com.bookstore.catalog.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDTO toDTO(Product product) {
        return new ProductDTO(
                product.getCode(),
                product.getName(),
                product.getDescription(),
                product.getImageUrl(),
                product.getPrice()
        );
    }
}