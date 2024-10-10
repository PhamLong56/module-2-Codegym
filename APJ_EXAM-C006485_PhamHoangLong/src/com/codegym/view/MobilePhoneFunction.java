package com.codegym.view;

import com.codegym.management.MobileManagement;
import com.codegym.model.MobilePhone;

import java.util.Scanner;

public class MobilePhoneFunction {
    private Scanner scanner = new Scanner(System.in);
    private MobileManagement mobilePhone = new MobileManagement();


    public void displayMenu() {
        int choice;
        do {
            System.out.println("\n===== Hệ thống quản lý điện thoại di động =====");
            System.out.println("1. Thêm mới điện thoại");
            System.out.println("2. Xóa điện thoại");
            System.out.println("3. Xem danh sách điện thoại");
            System.out.println("4. Tìm kiếm điện thoại");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    mobilePhone.addNewMobile();
                    break;
                case 2:
                    mobilePhone.deleteMobile();
                    break;
                case 3:
                    mobilePhone.showAllMobile();
                    break;
                case 4:
                    mobilePhone.searchMobile();
                    break;
                case 0:
                    System.out.println("Chương trình đnag thoát . . .");
                    break;
                default:
                    System.out.println("! ! ! Vui lòng chọn lại ! ! !");
            }
        } while (choice != 0);
    }
}