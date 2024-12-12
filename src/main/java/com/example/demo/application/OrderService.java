package com.example.demo.application;


import com.example.demo.application.dto.CreateOrderRequest;
import com.example.demo.application.dto.OrderDto;
import com.example.demo.application.dto.UpdateOrderStatusRequest;

public interface OrderService {
    OrderDto createOrder(CreateOrderRequest request);
    OrderDto getOrderById(Long id);

    OrderDto updateOrderStatus(UpdateOrderStatusRequest request);
}
