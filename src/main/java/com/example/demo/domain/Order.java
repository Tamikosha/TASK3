package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private Double totalAmount;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public Order() {
        this.status = OrderStatus.NEW;
    }

    public Order(String customerName, Double totalAmount) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = OrderStatus.NEW;
    }
}
