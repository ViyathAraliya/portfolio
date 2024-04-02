package com.araliya.onlineBookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.araliya.onlineBookStore.dto.OrderDto;
import com.araliya.onlineBookStore.entity.Book;
import com.araliya.onlineBookStore.service.BookService;
import com.araliya.onlineBookStore.service.OrderService;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {
  @Autowired
  private BookService bookService;

  @Autowired
  private OrderService orderService;

  @GetMapping("/loadBooks")
  public ResponseEntity<List<Book>> getAll() {
    List<Book> books = bookService.loadBooks();
    if (books != null) {
      return ResponseEntity.status(202).body(books);
    }
    return ResponseEntity.status(404).body(null);
  }

  @PostMapping("/order")
  public ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDto orderDto) {

    try {
      OrderDto savOrder = orderService.saveOrder(orderDto);
      return ResponseEntity.status(202).body(orderDto);

    } catch (Exception e) {
      OrderDto orderDto2 = new OrderDto();
      orderDto2.setStatusMsg(e.getMessage());
      return ResponseEntity.status(202).body(orderDto2);
    }
  }
}