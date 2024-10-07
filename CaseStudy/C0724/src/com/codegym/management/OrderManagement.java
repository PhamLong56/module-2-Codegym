package com.codegym.management;


import com.codegym.entity.Order;
import com.codegym.entity.OrderDetail;
import com.codegym.entity.Product;
import com.codegym.file.OrderFile;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OrderManagement {
    private static List<Order> orders = new ArrayList<>();

    public static List<Order> getOrders() {
        return orders;
    }
    public static void createOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đặt hàng");
        try {
            System.out.println("Nhập mã đặt hàng");
            int idOrder = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập tên khách hàng");
            String nameCustomer = scanner.nextLine();
            System.out.println("Nhập số điện thoại khách hàng");
            String phoneCustomer = scanner.nextLine();
            System.out.println("Nhập số email mail khách hàng");
            String emailCustomer = scanner.nextLine();
            Order order = new Order(idOrder, nameCustomer, phoneCustomer, emailCustomer);
            String productId;
            while (true) {
                scanner = new Scanner(System.in);
                System.out.println("Nhập mã sản phẩm");
                productId = scanner.nextLine();
                if (productId == null || productId.isEmpty()) {
                    break;
                }
                System.out.println("Nhập số lượng cần mua");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                Product product = findProductById(productId);
                if (product == null) {
                    System.out.println("Sản phẩm không tồn tại");
                    continue;
                }

                OrderDetail existingDetail = null;
                for (OrderDetail orderDetail : order.getOrderDetails()) {
                    if (orderDetail.getProductId().equals(productId)) {
                        existingDetail = orderDetail;
                        break;
                    }
                }
                if (existingDetail != null) {
                    existingDetail.setQuantity(existingDetail.getQuantity() + quantity);

                } else {
                    OrderDetail orderDetail = new OrderDetail();
                    orderDetail.setProductId(productId);
                    orderDetail.setPrice(product.getPrice());
                    orderDetail.setQuantity(quantity);
                    orderDetail.setOrderId(order.getIdOrder());
                    orderDetail.setOrderDetailId(order.getOrderDetails().size()+1);
                    order.getOrderDetails().add(orderDetail);
                }
            }
            orders.add(order);
            OrderFile.saveToFile(orders);

        } catch (InputMismatchException ei) {
            System.out.println("Bạn đã nhập sai giá trị vui lòng nhập lại");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void showOrder() {
        System.out.println("--------------ĐƠN HÀNG-------------");

        for (Order order : OrderManagement.getOrders()) {



            String customerInfo = String.format("ID đơn: %s, Tên khách hàng: %s, Số điện thoại: %s, Email: %s",
                    order.getIdOrder(),
                    order.getCustomerName(),
                    order.getCustomerPhone(),
                    order.getCustomerEmail()
            );
            System.out.println(customerInfo);
            System.out.printf("%-5s%-20s%-10s%-10s\n", "STT", "Tên Sản Phẩm", "Giá", "Số Lượng");
            System.out.println("----------------------------------------------------");

            int i = 1;
            double totalOrderPrice = 0;

            for (OrderDetail od : order.getOrderDetails()) {
                if (od.getProductId() != null) {
                    System.out.println("----------------------------------------------------");
                    Product product = findProductById(od.getProductId());
                    if (product != null) {
                        double itemPrice = od.getPrice() * od.getQuantity();
                        totalOrderPrice += itemPrice;
                        System.out.printf("%-5s%-20s%-10.2f%-10d\n",
                                i, product.getName(), od.getPrice(), od.getQuantity());
                        i++;
                    } else {
                        System.out.println("Sản phẩm với ID " + od.getProductId() + " không tồn tại trong hệ thống.");
                    }
                } else {
                    System.out.println("Sản phẩm không tồn tại!");
                }
            }
            System.out.println("----------------------------------------------------");
            System.out.printf("Tổng tiền của đơn: %.2f\n", totalOrderPrice);
            System.out.println();
        }
    }
    private static Product findProductById(String productId) {
        for (Product product : ProductManagement.getProducts()) {
            if (product.getId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

}