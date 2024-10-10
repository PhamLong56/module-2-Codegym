package com.codegym.entity;

import java.util.Date;

public class Order {
    private int id;
    private Date orderDate;
    private Customer customerName;
    private Employee employeeName;
    private boolean checkOrderDone;

    public Order() {
    }

    public Order(int id, Date orderDate, Customer customerName, Employee employeeName, boolean checkOrderDone) {
        this.id = id;
        this.orderDate = orderDate;
        this.customerName = customerName;
        this.employeeName = employeeName;
        this.checkOrderDone = checkOrderDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomerName() {
        return customerName;
    }

    public void setCustomerName(Customer customerName) {
        this.customerName = customerName;
    }

    public Employee getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(Employee employeeName) {
        this.employeeName = employeeName;
    }

    public boolean isCheckOrderDone() {
        return checkOrderDone;
    }

    public void setCheckOrderDone(boolean checkOrderDone) {
        this.checkOrderDone = checkOrderDone;
    }
}
