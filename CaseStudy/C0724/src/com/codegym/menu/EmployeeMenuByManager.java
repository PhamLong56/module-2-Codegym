package com.codegym.menu;

import com.codegym.management.AdminManagement;
import com.codegym.management.EmployeeManagement;

import java.util.Scanner;

public class EmployeeMenuByManager {
    public static void displayMenuAdmin() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("==============QUẢN LÝ NHÂN VIÊN================");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xem danh sách nhân viên");
            System.out.println("3. Thoát");
            System.out.println("Vui lòng chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    AdminManagement.addEmployeeAccount();
                    break;
                case 2:
                    AdminManagement.showEmployeeAccount();
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
