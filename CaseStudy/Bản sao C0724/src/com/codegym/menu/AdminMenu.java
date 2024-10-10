package com.codegym.menu;

import com.codegym.file.EmployeeFile;
import com.codegym.file.ProductFile;
import com.codegym.management.AdminManagement;
import com.codegym.management.EmployeeManagement;
import com.codegym.management.OrderManagement;
import com.codegym.management.ProductManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminMenu {
    public static void displayMenuAdmin() {

        boolean isExit = false;
        while (!isExit) {
            System.out.println("============== CHỨC NĂNG CỦA QUẢN LÝ ================");
            System.out.println("1. Quản lý nhân viên");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Xem các đơn hàng");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng chọn chức năng");
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Chọn: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        EmployeeMenuByManager.displayMenuAdmin();
                        break;
                    case 2:
                        ProductMenu.displayProductMenu();
                        break;
                    case 3:
                        OrderManagement.showOrder();
                        break;
                    case 0:
                        isExit = true;
                        break;
                    default:
                        System.out.println("Vui lòng nhập lại!!!");
                        break;
                }
            } catch (InputMismatchException ei) {
                System.out.println("Bạn đã nhập sai giá trị, xin nhập lại!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
