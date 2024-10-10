package com.codegym.entity;

public class Customer {
    private String id;
    private String name;
    private String phone;
    private String email;
    private int loyaltyPoints;

    public Customer() {
    }

    public Customer(String id, String name, String phone, String email, int loyaltyPoints) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.loyaltyPoints = loyaltyPoints;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }


}
