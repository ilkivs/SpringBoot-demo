package com.ilkiv.dao;

import com.ilkiv.model.Category;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Override
    @EntityGraph("Category.products")
    List<Category> findAll();
}
