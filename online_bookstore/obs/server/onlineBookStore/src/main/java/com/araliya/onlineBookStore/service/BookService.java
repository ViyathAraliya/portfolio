package com.araliya.onlineBookStore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.araliya.onlineBookStore.entity.Book;

@Service
public interface BookService {
    Book saveBook(Book book);
    List<Book> loadBooks();
}
