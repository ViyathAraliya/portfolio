package com.araliya.onlineBookStore.entity;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class OrderDetail {
    
    @EmbeddedId
    private OrderDetailId Id;

    

    
}
