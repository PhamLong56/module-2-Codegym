package com.codegym.model;

public class Product {
    private String id;
    private String name;
    private String type;
    private double price;
    private int quantity;

    public Product(String id, String name, String type, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void showProduct() {
        System.out.println("Mã sản phẩm: "+id+ ", Tên: "+name+", Loại: "+type+", Giá: "+price+", Số lượng: "+quantity);
    }
    public double totalValue() {
        return price * quantity;
    }
}
