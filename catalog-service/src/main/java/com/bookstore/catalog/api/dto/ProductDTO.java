package com.bookstore.catalog.api.dto;

import java.math.BigDecimal;

public record ProductDTO(
        String code,
        String name,
        String description,
        String imageUrl,
        BigDecimal price
) {}