package com.codegym.entity;

import java.util.Date;

public class Invoice {
    private String id;
    private Order order;
    private double amount;
    private Date date;

    public Invoice() {
    }

    public Invoice(String id, Order order, double amount, Date date) {
        this.id = id;
        this.order = order;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
