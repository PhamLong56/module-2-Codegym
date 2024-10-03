package com.codegym.menu;

import com.codegym.entity.Product;
import com.codegym.management.ProductManagement;

import java.util.Scanner;

public class ProductMenu {
    public static void displayProductMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Cập nhật sản phẩm");
            System.out.println("5. Tìm sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn một lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear buffer

            switch (choice) {
                case 1:
                    ProductManagement.addProduct();
                    break;
                case 2:
                    ProductManagement.showProduct();
                    break;
                case 3:
                    ProductManagement.deleteProduct();
                    break;
                case 4:
                    ProductManagement.updateProduct();
                    break;
                case 5:
                    ProductManagement.searchProduct();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}

