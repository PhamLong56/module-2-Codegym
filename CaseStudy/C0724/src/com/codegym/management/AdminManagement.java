package com.codegym.management;

import com.codegym.entity.Admin;
import com.codegym.entity.Employee;
import com.codegym.file.EmployeeFile;

import java.util.InputMismatchException;
import java.util.Scanner;


public class AdminManagement {
    public static boolean verifyLogin() {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tài khoản người dùng: ");
        String username = scanner.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = scanner.nextLine();
        if(admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
            System.out.println("Chúc mừng bạn đã đăng nhập thành công!");
            return true;
        }
        System.out.println("Tài khoản hoặc mật khẩu không đúng! Vui lòng nhập lại!");
        return false;
    }
    public static void addEmployeeAccount() {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("=== Tạo Tài Khoản Cho Nhân Viên ===");
            System.out.print("Tên tài khoản: ");
            String username = scanner.nextLine();
            System.out.print("Mật khẩu: ");
            String password = scanner.nextLine();
            EmployeeManagement.getEmployees().add(new Employee(username, password));
            EmployeeFile.saveToFile(EmployeeManagement.getEmployees());
        }catch (InputMismatchException ei) {
            System.out.println("Bạn đã nhập sai giá trị, xin nhập lại");
        }

    }

    public static void showEmployeeAccount() {
        for (Employee employee : EmployeeManagement.getEmployees()) {
            System.out.println(employee.toString());

        }
    }
}
