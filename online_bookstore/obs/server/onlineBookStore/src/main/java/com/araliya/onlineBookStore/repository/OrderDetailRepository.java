package com.araliya.onlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.araliya.onlineBookStore.entity.OrderDetail;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long>  {}
