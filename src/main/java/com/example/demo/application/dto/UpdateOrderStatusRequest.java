package com.example.demo.application.dto;

import com.example.demo.domain.OrderStatus;

public class UpdateOrderStatusRequest {
    private Long orderId;
    private OrderStatus newStatus;

    public UpdateOrderStatusRequest() {
    }

    public UpdateOrderStatusRequest(Long orderId, OrderStatus newStatus) {
        this.orderId = orderId;
        this.newStatus = newStatus;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(OrderStatus newStatus) {
        this.newStatus = newStatus;
    }
}
