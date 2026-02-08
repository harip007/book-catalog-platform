package com.bookstore.catalog.api.exception;

public class ProductNotFoundException extends RuntimeException {

    // 1. Keep this for the /{code} lookup
    public ProductNotFoundException(String code) {
        super("Product with code " + code + " not found");
    }

    // 2. Add this generic constructor to stop the "mixing"
    private ProductNotFoundException(String message, boolean isCustom) {
        super(message);
    }

    // 3. Update this to use the new generic constructor
    public static ProductNotFoundException forSearch(String query) {
        return new ProductNotFoundException("No products found matching search criteria: " + query, true);
    }
}