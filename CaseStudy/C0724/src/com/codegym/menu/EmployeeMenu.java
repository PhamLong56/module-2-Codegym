package com.codegym.menu;

import java.util.Scanner;

public class EmployeeMenu {
    public static void displayMenuEmployee() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("==============NHÂN VIÊN================");
            System.out.println("1. ban hang");
            System.out.println("2. hien thi");
            System.out.println("3. Thoát");
            System.out.println("Vui lòng chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    break;
                case 2:

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
