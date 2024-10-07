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
        System.out.println("Enter a username ");
        String username = scanner.nextLine();
        System.out.println("Enter a password");
        String password = scanner.nextLine();
        if(admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
            System.out.println("You have successfully logged in");
            return true;
        }
        System.out.println("Invalid username or password");
        return false;
    }
    public static void addEmployeeAccount() {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a username ");
            String username = scanner.nextLine();
            System.out.println("Enter a password");
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
