package com.ilkiv.controller;

import com.ilkiv.model.Category;
import com.ilkiv.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @CrossOrigin("http://localhost:4200")
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ResponseEntity<List<Category>> getAll(){
        return ResponseEntity.ok(categoryService.getAll());
    }

    @CrossOrigin("http://localhost:4200")
    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public ResponseEntity<Category> getById(@PathVariable Long id){
        return categoryService.getById(id)
                .map(ResponseEntity::ok)
                .orElseGet(ResponseEntity.notFound()::build);
    }
}
