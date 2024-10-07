package com.codegym.menu;

import com.codegym.entity.Product;
import com.codegym.management.ProductManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductMenu {
    public static void displayProductMenu() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("\n1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Cập nhật sản phẩm");
            System.out.println("5. Tìm sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn một lựa chọn: ");
            try {
                Scanner scanner = new Scanner(System.in);

                int choice = scanner.nextInt();
                scanner.nextLine();

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
                        isExit = true;
                        break;
                    default:
                        break;
                }

            } catch (InputMismatchException ei) {
                System.out.println("Bạn đã nhập sai giá trị, xin nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

