package com.araliya.onlineBookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;

import com.araliya.onlineBookStore.entity.Book;
import com.araliya.onlineBookStore.entity.Order;
import com.araliya.onlineBookStore.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService   {
@Autowired
private BookRepository bookRepository;

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }
    public List<Book> loadBooks(){
        return bookRepository.findAll();
    }
   

}
