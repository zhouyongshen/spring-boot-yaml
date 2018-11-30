package com.github.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    Student student;
    @GetMapping("/test")
    public Student getStudent() {
        return student;
    }
}
