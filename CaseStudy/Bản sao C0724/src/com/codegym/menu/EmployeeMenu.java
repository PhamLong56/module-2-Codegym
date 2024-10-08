package com.codegym.menu;

import com.codegym.entity.OrderDetail;
import com.codegym.management.OrderManagement;
import com.codegym.management.ProductManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeMenu {
    public static void displayMenuEmployee() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("============== CHỨC NĂNG CỦA NHÂN VIÊN================");
            System.out.println("1. Hiển thị Menu");
            System.out.println("2. Tạo đơn đặt hàng");
            System.out.println("3. Hiển thị đơn đặt hàng");
            System.out.println("4. Chỉnh sửa đơn đặt hàng");
            System.out.println("5. Xóa đơn đặt hàng");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println("=======================================================");
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Chọn: ");
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
                    case 4:
                        OrderManagement.updateOrder();
                        break;
                    case 5:
                        OrderManagement.deleteOrder();
                        break;
                    case 0:
                        isExit = true;
                        break;
                    default:
                        System.out.println("Vui lòng chọn lại !!!");
                }

            } catch (InputMismatchException ei) {
                System.out.println("Bạn đã nhập sai giá trị, xin nhập lại !!!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
