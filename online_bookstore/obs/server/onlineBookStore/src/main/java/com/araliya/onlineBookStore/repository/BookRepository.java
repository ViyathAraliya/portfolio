package com.araliya.onlineBookStore.repository;

import org.springframework.stereotype.Repository;

import com.araliya.onlineBookStore.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
} 