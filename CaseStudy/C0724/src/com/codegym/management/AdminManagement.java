package com.codegym.management;

import com.codegym.entity.Admin;
import com.codegym.entity.Employee;
import com.codegym.file.EmployeeFile;

import java.util.InputMismatchException;
import java.util.List;
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
    public static void updateEmployeeAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tài khoản nhân viên cần cập nhật: ");
        String username = scanner.nextLine();

        List<Employee> employees = EmployeeManagement.getEmployees();
        Employee employeeToUpdate = null;

        // Tìm tài khoản nhân viên
        for (Employee employee : employees) {
            if (employee.getUsername().equals(username)) {
                employeeToUpdate = employee;
                break;
            }
        }

        if (employeeToUpdate != null) {
            // Thực hiện cập nhật thông tin
            System.out.println("Nhập tên tài khoản mới (hoặc nhấn Enter để bỏ qua): ");
            String newUsername = scanner.nextLine();
            if (!newUsername.isEmpty()) {
                employeeToUpdate.setUsername(newUsername);
            }

            System.out.println("Nhập mật khẩu mới (hoặc nhấn Enter để bỏ qua): ");
            String newPassword = scanner.nextLine();
            if (!newPassword.isEmpty()) {
                employeeToUpdate.setPassword(newPassword);
            }

            // Lưu thông tin cập nhật vào file
            EmployeeFile.saveToFile(employees);
            System.out.println("Cập nhật tài khoản nhân viên thành công.");
        } else {
            System.out.println("Không tìm thấy tài khoản nhân viên với tên tài khoản đã nhập.");
        }
    }


    public static void deleteEmployeeAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tài khoản nhân viên cần xóa: ");
        String username = scanner.nextLine();

        List<Employee> employees = EmployeeManagement.getEmployees();
        Employee employeeToDelete = null;


        for (Employee employee : employees) {
            if (employee.getUsername().equals(username)) {
                employeeToDelete = employee;
                break;
            }
        }

        if (employeeToDelete != null) {
            employees.remove(employeeToDelete);
            EmployeeFile.saveToFile(employees);
            System.out.println("Xóa tài khoản nhân viên thành công.");
        } else {
            System.out.println("Không tìm thấy tài khoản nhân viên với tên tài khoản đã nhập.");
        }
    }
}
