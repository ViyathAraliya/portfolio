package com.araliya.onlineBookStore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Book {

    @Id
    @Column(name ="id")
    private long id;

    @Column(name="QtyOnHane")
    private Integer qtyOnHand;    
}
