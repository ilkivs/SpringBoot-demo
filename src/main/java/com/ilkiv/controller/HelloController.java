package com.ilkiv.controller;

import com.ilkiv.model.GreetingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<GreetingResponse> greet(){
        return ResponseEntity.ok(new GreetingResponse("Hello from Spring Boot!"));
    }
}
