package com.codegym.menu;

import com.codegym.entity.OrderDetail;
import com.codegym.management.OrderManagement;
import com.codegym.management.ProductManagement;

import java.util.Scanner;

public class EmployeeMenu {
    public static void displayMenuEmployee() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("==============NHÂN VIÊN================");
            System.out.println("1. Hiển thị Menu");
            System.out.println("2. Tạo đơn đặt hàng");
            System.out.println("3. Hiển thị đơn đặt hàng");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ProductManagement.showProduct();
                    break;
                case 2:
                    OrderManagement.createOrder();
                    break;
                    case 3:
                        OrderManagement.showOrder();
                        break;
                case 0:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
