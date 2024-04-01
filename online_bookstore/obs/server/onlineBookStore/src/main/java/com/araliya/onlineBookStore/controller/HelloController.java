package com.araliya.onlineBookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.araliya.onlineBookStore.entity.Book;
import com.araliya.onlineBookStore.service.BookService;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {
  @Autowired
  BookService bookService;

 

  @GetMapping("/loadBooks")
public ResponseEntity<List<Book>> getAll(){
  List<Book> books=bookService.loadBooks();
  if(books!=null){
    return ResponseEntity.status(202).body(books);
  }
  return ResponseEntity.status(404).body(null);
}
}
