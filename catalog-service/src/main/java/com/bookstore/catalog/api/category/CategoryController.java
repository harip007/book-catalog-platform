package com.bookstore.catalog.api.category;

// These imports are the "Bridge" that resolves your IDE errors
import com.bookstore.catalog.api.dto.CategoryRequest;
import com.bookstore.catalog.api.dto.CategoryResponse;
import com.bookstore.catalog.domain.category.CategoryService; 
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponse createCategory(@Valid @RequestBody CategoryRequest request) {
        return categoryService.createCategory(request);
    }
}