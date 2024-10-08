package com.codegym.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderCounter = 0;
    private String idOrder;
    private String customerName;
    private String customerPhone;
    private String customerEmail;
    private List<OrderDetail> orderDetails = new ArrayList<>();


    public Order(String customerName, String customerPhone, String customerEmail) {
        this.idOrder = generateOrderId();
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
    }

    private String generateOrderId() {
        orderCounter++;
        return String.format("DH%03d", orderCounter);
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Đơn hàng-" + idOrder +
                "Tên-" + customerName + '\'' +
                "Phone-" + customerPhone + '\'' +
                ", Email='" + customerEmail + '\'' +
                ", Danh sách đặt hàng=" + orderDetails +
                '}';
    }
}
