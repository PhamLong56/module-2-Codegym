package com.codegym.management;

import com.codegym.entity.Admin;
import com.codegym.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
    private static List<Employee> employees = new ArrayList<>();

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(List<Employee> employees) {
        EmployeeManagement.employees = employees;
    }

    public static Employee verifyLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tài khoản người dùng: ");
        String username = scanner.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.getUsername().equals(username) && employee.getPassword().equals(password)) {
                System.out.println( "Tài khoản của "+employee.getUsername()+ " đã đăng nhập thành công");
                return employee;
            }

        }
        System.out.println("Tài khoản hoặc mật khẩu không đúng! Vui lòng nhập lại!");
        return null;

    }
}
