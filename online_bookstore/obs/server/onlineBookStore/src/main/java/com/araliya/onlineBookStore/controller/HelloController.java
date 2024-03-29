package com.araliya.onlineBookStore.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.araliya.onlineBookStore.entity.Book;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {

    @GetMapping("/books")
    public Book getOne(){
      return new Book(4,4);
    }
   
    
}
