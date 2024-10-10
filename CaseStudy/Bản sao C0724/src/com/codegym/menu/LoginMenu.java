package com.codegym.menu;

import com.codegym.entity.Employee;
import com.codegym.entity.Order;
import com.codegym.file.EmployeeFile;
import com.codegym.file.OrderFile;
import com.codegym.file.ProductFile;
import com.codegym.management.AdminManagement;
import com.codegym.management.EmployeeManagement;
import com.codegym.management.OrderManagement;
import com.codegym.management.ProductManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginMenu {
    public static void displayLoginMenu() {
        ProductManagement.setProducts(ProductFile.readFromFile());
        EmployeeManagement.setEmployees(EmployeeFile.readFromFile());
        OrderManagement.setOrders(OrderFile.readFromFile());
        boolean isExit = false;
        while (!isExit) {
            System.out.println("============== VUI LÒNG CHỌN CHỨC NĂNG ================");
            System.out.println("1. Đăng nhập cho Quản lý");
            System.out.println("2. Đăng nhập cho Nhân viên");
            System.out.println("3. Thoát");
            System.out.println("=======================================================");

            try {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Chọn: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        if (AdminManagement.verifyLogin()) {
                            AdminMenu.displayMenuAdmin();
                        }
                        break;
                    case 2:
                        Employee employee = EmployeeManagement.verifyLogin();
                        if (employee != null) {
                            EmployeeMenu.displayMenuEmployee();
                        }
                        break;
                    case 3:
                        isExit = true;
                        break;
                    default:
                        System.out.println("Vui lòng chọn lại !!!");

                }
            } catch (InputMismatchException ei) {
                System.out.println("Bạn đã nhập sai giá trị, xin nhập lại!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
