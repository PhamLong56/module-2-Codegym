package com.codegym.menu;

import com.codegym.entity.Employee;
import com.codegym.management.AdminManagement;
import com.codegym.management.EmployeeManagement;

import java.util.Scanner;

public class LoginMenu {
    public static void displayLoginMenu() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("==============Đăng Nhập================");
            System.out.println("1. Đăng nhập cho Manager");
            System.out.println("2. Đăng nhập cho nhân viên bán hàng");
            System.out.println("3. Thoát");
            System.out.println("Vui lòng chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (AdminManagement.verifyLogin()) {
                        AdminMenu.displayMenuAdmin();
                    }
                    break;
                case  2:
                    Employee employee = EmployeeManagement.verifyLogin();
                    if (employee != null) {
                        EmployeeMenu.displayMenuEmployee();
                    }
                    break;
                case 3:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
