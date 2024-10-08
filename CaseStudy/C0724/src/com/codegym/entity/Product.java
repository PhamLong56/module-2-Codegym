package com.codegym.entity;

import java.util.List;

public class Product {

    private static int idDrinkCounter = 1;
    private static int idFoodCounter = 1;

    private String id;
    private String name;
    private Double price;
    private String description;
    private String type;

    public Product() {
    }

    public Product( String name, String description,Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public Product(String type,String name, String description, Double price) {
        this.type = type;
        this.id = generateId(type);
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product(String id, String name, Double price, String description, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = type;
    }

    private String generateId(String type) {
        if(type.equals("D")){
            return "D" + String.format("%03d", idDrinkCounter++);
        }else if(type.equals("F")){
            return "F" + String.format("%03d", idFoodCounter++);
        }else {
            throw new IllegalArgumentException("Xẩy ra lỗi, vui lòng chọn lại");
        }
    }
    public static void updateCounters(List<Product> productList) {
        int maxDrinkId = 0;
        int maxFoodId = 0;

        for (Product product : productList) {
            String id = product.getId();
            if (id.startsWith("D")) {
                int numericPart = Integer.parseInt(id.substring(1));
                if (numericPart > maxDrinkId) {
                    maxDrinkId = numericPart;
                }
            } else if (id.startsWith("F")) {
                int numericPart = Integer.parseInt(id.substring(1));
                if (numericPart > maxFoodId) {
                    maxFoodId = numericPart;
                }
            }
        }

        Product.setIdDrinkCounter(maxDrinkId + 1);
        Product.setIdFoodCounter(maxFoodId + 1);
    }

    public static int getIdDrinkCounter() {
        return idDrinkCounter;
    }

    public static void setIdDrinkCounter(int idDrinkCounter) {
        Product.idDrinkCounter = idDrinkCounter;
    }

    public static int getIdFoodCounter() {
        return idFoodCounter;
    }

    public static void setIdFoodCounter(int idFoodCounter) {
        Product.idFoodCounter = idFoodCounter;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
