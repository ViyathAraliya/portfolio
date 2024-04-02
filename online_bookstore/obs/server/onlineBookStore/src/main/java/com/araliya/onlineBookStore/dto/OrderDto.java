 package com.araliya.onlineBookStore.dto;


 import java.util.List;
 import com.araliya.onlineBookStore.entity.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 
 @Getter
 @Setter
 @AllArgsConstructor
 @NoArgsConstructor

 public class OrderDto {
     private Long id;
     private List<Book> books;
     private String statusMsg;
    
 }