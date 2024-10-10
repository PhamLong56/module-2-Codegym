package com.codegym.view;

import com.codegym.manage.PatientManage;
import com.codegym.utities.Patient;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PatientManage patientManage = new PatientManage();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Quản lý bệnh án ---");
            System.out.println("1. Thêm bệnh nhân");
            System.out.println("2. Thêm bệnh án cho bệnh nhân");
            System.out.println("3. Tìm kiếm bệnh nhân theo mã số");
            System.out.println("4. Xuất danh sách bệnh án của bệnh nhân");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    patientManage.addPatient();
                    break;
                case 2:
                    patientManage.addRecordList();
                    break;
                case 3:

                    break;
                case 4:
                    patientManage.displayRecord();
                    break;
                    case 0:
                        System.out.println("Thoat chuong trinh");
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }while (choice!=0);
        scanner.close();

    }
}
