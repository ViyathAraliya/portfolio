package com.araliya.onlineBookStore.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="orda") 
public class Order {
    @Id
    @Column(name="id")
    private Long id;

    @Transient
    @OneToMany(mappedBy = "orderDtail",targetEntity = OrderDetail.class)
    private List<OrderDetail> orderDetails;

}
