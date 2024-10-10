package com.codegym.management;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private List<Product> products = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Nhap ma san pham: ");
        String id = scanner.nextLine();

        System.out.println("Nhap ten san pham: ");
        String name = scanner.nextLine();

        System.out.println("Nhap loai san pham: ");
        String type = scanner.nextLine();

        System.out.println("Nhap gia san pham: ");
        double price = scanner.nextDouble();

        System.out.println("Nhap so luong san pham: ");
        int quantity = scanner.nextInt();

        scanner.nextLine();
        Product product = new Product(id, name, type, price, quantity);
        System.out.println("Them thanh cong");
    }
}
