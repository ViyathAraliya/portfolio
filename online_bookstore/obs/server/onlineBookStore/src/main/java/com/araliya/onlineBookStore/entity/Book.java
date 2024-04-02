package com.araliya.onlineBookStore.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="author")
    private String author;

    @Column(name="price")
    private Integer price;
    
    @Column(name="qty")
    private Integer qty;

    @Transient
    @OneToMany(mappedBy = "orderDetail",targetEntity = OrderDetail.class)
    private List<OrderDetail> orderDetails;
}
