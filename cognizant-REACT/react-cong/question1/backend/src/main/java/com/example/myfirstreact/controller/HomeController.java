package com.example.myfirstreact.controller;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class HomeController{
 @GetMapping("/api/message")
 public String message(){
  return "Welcome to the first session of React";
 }
}