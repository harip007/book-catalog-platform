package com.bookstore.catalog.api.dto;

public record CategoryResponse(
    Long id,
    String name,
    String description
) {}