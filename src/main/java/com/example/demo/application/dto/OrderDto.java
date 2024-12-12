package com.example.demo.application.dto;

public class OrderDto {
    private Long id;
    private String customerName;
    private Double totalAmount;
    private String status;

    public OrderDto(Long id, String customerName, Double totalAmount, String status) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
