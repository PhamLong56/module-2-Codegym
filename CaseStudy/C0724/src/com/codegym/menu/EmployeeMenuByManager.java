package com.codegym.menu;

import com.codegym.management.AdminManagement;
import com.codegym.management.EmployeeManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeMenuByManager {
    public static void displayMenuAdmin() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("================ QUẢN LÝ NHÂN VIÊN =================");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xem danh sách nhân viên");
            System.out.println("3. Thoát");
            System.out.println("Vui lòng chọn chức năng:");
            System.out.println("====================================================");
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Chọn: ");
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
                        System.out.println("Vui lòng chọn lại !!!");
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
