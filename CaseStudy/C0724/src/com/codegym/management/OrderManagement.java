package com.codegym.management;


import com.codegym.entity.Order;
import com.codegym.entity.Product;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderManagement {
    public void createOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đặt hàng");

        try {
            System.out.println("Nhập mã đặt hàng");
            int idOrder = scanner.nextInt();

            System.out.println("Nhập tên khách hàng");
            String nameCustomer = scanner.nextLine();

            System.out.println("Nhập số điện thoại khách hàng");
            String phoneCustomer = scanner.nextLine();

            System.out.println("Nhập số email mail khách hàng");
            String emailCustomer = scanner.nextLine();

            Order oder = new Order(idOrder, nameCustomer, phoneCustomer, emailCustomer);

            int productFunction = -1;

            do {
                scanner = new Scanner(System.in);
                System.out.println("nha ma sp");
                int productId = scanner.nextInt();
                System.out.println("nhap so luong");
                int quantity = scanner.nextInt();

                Product product = null;

                for (Product p : oder.getProductList()) {
                    if (p.getId().equals(productId)){
                        product = p;
                        break;
                    }

                }
                if(product == null) {
                    System.out.println("Mã sản phẩm không tồn tại");
                }

            } while (productFunction == -1);

        } catch (InputMismatchException ei) {
            System.out.println("Bạn đã nhập sai giá trị vui lòng nhập lại");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}