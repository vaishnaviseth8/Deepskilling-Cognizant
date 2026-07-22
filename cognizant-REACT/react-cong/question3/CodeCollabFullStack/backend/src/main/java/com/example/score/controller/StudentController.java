package com.example.score.controller;

import com.example.score.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Steeve", "DNV Public School", 284, 3);
    }
}
