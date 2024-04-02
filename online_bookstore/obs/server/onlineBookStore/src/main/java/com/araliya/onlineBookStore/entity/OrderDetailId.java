package com.araliya.onlineBookStore.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Embeddable
public class OrderDetailId implements Serializable{


    @ManyToOne
    @JoinColumn(name="orda")
    private Order order;

    @ManyToOne
    @JoinColumn(name="book")
    private Book book;

    
    
}
