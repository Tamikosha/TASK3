package com.example.demo.application.impl;

import com.example.demo.application.OrderService;
import com.example.demo.application.dto.CreateOrderRequest;
import com.example.demo.application.dto.OrderDto;
import com.example.demo.application.dto.UpdateOrderStatusRequest;
import com.example.demo.domain.Order;
import com.example.demo.exception.OrderNotFoundException;
import com.example.demo.infrastructure.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderDto createOrder(CreateOrderRequest request) {
        Order order = new Order(request.getCustomerName(), request.getTotalAmount());
        Order savedOrder = orderRepository.save(order);
        return new OrderDto(savedOrder.getId(), savedOrder.getCustomerName(),
                savedOrder.getTotalAmount(), savedOrder.getStatus().name());
    }

    @Override
    public OrderDto getOrderById(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with ID: " + id));
        return new OrderDto(order.getId(), order.getCustomerName(),
                order.getTotalAmount(), order.getStatus().name());
    }

    @Override
    public OrderDto updateOrderStatus(UpdateOrderStatusRequest request) {
        Order order = orderRepository.findById(request.getOrderId())
                .orElseThrow(() -> new OrderNotFoundException("Order not found with ID: " + request.getOrderId()));

        order.setStatus(request.getNewStatus());
        Order updatedOrder = orderRepository.save(order);

        return new OrderDto(updatedOrder.getId(), updatedOrder.getCustomerName(),
                updatedOrder.getTotalAmount(), updatedOrder.getStatus().name());
    }
}
