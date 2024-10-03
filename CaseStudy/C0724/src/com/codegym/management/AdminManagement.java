package com.codegym.management;

import com.codegym.entity.Admin;
import com.codegym.entity.Employee;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a username ");
        String username = scanner.nextLine();
        System.out.println("Enter a password");
        String password = scanner.nextLine();
        EmployeeManagement.getEmployees().add(new Employee(username, password));
    }

    public static void showEmployeeAccount() {
        for (Employee employee : EmployeeManagement.getEmployees()) {
            System.out.println(employee.toString());

        }
    }
}
