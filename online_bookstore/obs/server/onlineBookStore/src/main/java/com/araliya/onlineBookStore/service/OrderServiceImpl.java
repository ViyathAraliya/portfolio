package com.araliya.onlineBookStore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.araliya.onlineBookStore.dto.OrderDto;
import com.araliya.onlineBookStore.entity.Book;
import com.araliya.onlineBookStore.entity.Order;
import com.araliya.onlineBookStore.entity.OrderDetail;
import com.araliya.onlineBookStore.entity.OrderDetailId;
import com.araliya.onlineBookStore.repository.OrderDetailRepository;
import com.araliya.onlineBookStore.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public OrderDto saveOrder(OrderDto orderDto) {
        Order order = new Order();
        Order savedOrder = orderRepository.save(order);

        List<Book> books = orderDto.getBooks();
        List<Book> savedBooks = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            OrderDetailId orderDetailId = new OrderDetailId();
            orderDetailId.setOrder(order);
            orderDetailId.setBook(books.get(i));
            OrderDetail orderDetail = new OrderDetail(orderDetailId);
            OrderDetail savedOrderDetail = orderDetailRepository.save(orderDetail);
            books.add(savedOrderDetail.getId().getBook());
        }
        return new OrderDto(savedOrder.getId(), books, null);

    }

}
