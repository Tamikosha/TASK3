package com.example.demo.infrastructure.repository;

import com.example.demo.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
