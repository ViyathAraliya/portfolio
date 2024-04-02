package com.araliya.onlineBookStore.service;

import org.springframework.stereotype.Service;

import com.araliya.onlineBookStore.dto.OrderDto;

@Service
public interface OrderService {
    
    OrderDto saveOrder(OrderDto orderDto);
}