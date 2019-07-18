package com.ilkiv.service.scheduler;

import com.ilkiv.dao.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class DefaultScheduler {

    @Autowired
    private CategoryRepository categoryRepository;

    @Scheduled(initialDelay = 3000, fixedDelay = 5000)
    public void printAllCategories(){
        System.out.println("====================");
        categoryRepository.findAll().stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
