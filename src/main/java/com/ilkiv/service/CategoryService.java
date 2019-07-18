package com.ilkiv.service;

import com.ilkiv.model.Category;
import org.springframework.http.ResponseEntity;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> getAll();

    Optional<Category> getById(Long id);
}
