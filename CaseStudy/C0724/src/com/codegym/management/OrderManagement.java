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
        ProductManagement.showProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== THÔNG TIN ĐƠN HÀNG =====");
        try {
            System.out.println("Nhập tên khách hàng: ");
            String nameCustomer = scanner.nextLine();
            System.out.println("Nhập số điện thoại khách hàng: ");
            String phoneCustomer = scanner.nextLine();
            System.out.println("Nhập số email của khách hàng: ");
            String emailCustomer = scanner.nextLine();
            Order order = new Order(nameCustomer, phoneCustomer, emailCustomer);
            String productId;
            while (true) {
                scanner = new Scanner(System.in);
                System.out.println("========= TẠO MÓN =========");
                System.out.println("Nhập mã sản phẩm để chọn hoặc nhấn Enter để kết thúc: ");
                productId = scanner.nextLine();
                if (productId == null || productId.isEmpty()) {
                    break;
                }
                System.out.println("Nhập số lượng cần mua: ");
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
//                    orderDetail.setOrderId(order.getIdOrder());
                    orderDetail.setOrderDetailId(order.getOrderDetails().size() + 1);
                    order.getOrderDetails().add(orderDetail);
                }
            }
            System.out.println("Bạn đã chọn xong. Cám ơn! ");
            orders.add(order);
            OrderFile.saveToFile(orders);


        } catch (InputMismatchException ei) {
            System.out.println("Bạn đã nhập sai giá trị vui lòng nhập lại");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        OrderManagement.showOrder();

    }

    public static void showOrder() {
        System.out.println("--------------ĐƠN HÀNG-------------");

        for (Order order : OrderManagement.getOrders()) {


            String customerInfo = String.format("Mã đơn hàng: %s, Tên khách hàng: %s, Số điện thoại: %s, Email: %s",
                    order.getIdOrder(),
                    order.getCustomerName(),
                    order.getCustomerPhone(),
                    order.getCustomerEmail()
            );
            System.out.println(customerInfo);
            System.out.println("---------------------------------------------------------");
            System.out.printf("%-5s%-20s%-15s%-10s%-10s\n", "STT", "Tên Sản Phẩm", "Mã SP", "Số Lượng", "Giá");
            System.out.println("---------------------------------------------------------");

            int i = 1;
            double totalOrderPrice = 0;

            for (OrderDetail od : order.getOrderDetails()) {
                if (od.getProductId() != null) {
                    System.out.println("---------------------------------------------------------");
                    Product product = findProductById(od.getProductId());
                    if (product != null) {
                        double itemPrice = od.getPrice() * od.getQuantity();
                        totalOrderPrice += itemPrice;
                        System.out.printf("%-5s%-20s%-15s%-10d%-10.2f \n",
                                i, product.getName(), product.getId(), od.getQuantity(), od.getPrice());
                        i++;
                    } else {
                        System.out.println("Mã sản phẩm " + od.getProductId() + " không tồn tại trong hệ thống.");
                    }
                } else {
                    System.out.println("Sản phẩm không tồn tại!");
                }
            }
            System.out.println("---------------------------------------------------------");
            System.out.printf("Tổng tiền của đơn: %.2f\n", totalOrderPrice);
            System.out.println();
        }
    }

    public static void updateOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã đơn hàng cần sửa: ");
        String idOrder = scanner.nextLine();

        Order order = findOrderById(idOrder);
        if (order == null) {
            System.out.println("Không tìm thấy đơn hàng với mã: " + idOrder);
            return;
        }
        showOrderDetails(order);
        while (true) {
            System.out.println("========= CHỈNH SỬA ĐƠN HÀNG =========");
            System.out.println("Nhập mã sản phẩm để thêm hoặc sửa, hoặc nhấn Enter để kết thúc: ");
            String productId = scanner.nextLine();
            if (productId.isEmpty()) {
                System.out.println("Bạn đã hoàn tất chỉnh sửa. Cám ơn!");
                break;
            }
            System.out.println("Nhập số lượng cần sửa: ");
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
                existingDetail.setQuantity(quantity);
            } else {
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setProductId(productId);
                orderDetail.setPrice(product.getPrice());
                orderDetail.setQuantity(quantity);
                orderDetail.setOrderDetailId(order.getOrderDetails().size() + 1);
                order.getOrderDetails().add(orderDetail);
            }
        }
        OrderFile.saveToFile(orders);
    }

    public static void deleteOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã đơn hàng cần xóa: ");
        String idOrder = scanner.nextLine();

        Order order = findOrderById(idOrder);
        if (order == null) {
            System.out.println("Không tìm thấy đơn hàng với mã: " + idOrder);
            return;
        }
        orders.remove(order);
        System.out.println("Đơn hàng với mã " + idOrder + " đã được xóa.");
        OrderFile.saveToFile(orders);
    }

    private static Product findProductById(String productId) {
        for (Product product : ProductManagement.getProducts()) {
            if (product.getId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    private static Order findOrderById(String idOrder) {
        for (Order order : orders) {
            if (order.getIdOrder().equals(idOrder)) {
                return order;
            }
        }
        return null;
    }

    private static void showOrderDetails(Order order) {
        System.out.printf("Mã đơn hàng: %s, Tên khách hàng: %s, Số điện thoại: %s, Email: %s\n",
                order.getIdOrder(), order.getCustomerName(), order.getCustomerPhone(), order.getCustomerEmail());
        System.out.printf("%-5s%-20s%-15s%-10s%-10s\n", "STT", "Tên Sản Phẩm", "Mã SP", "Số Lượng", "Giá");
        System.out.println("----------------------------------------------------");

        int i = 1;
        for (OrderDetail od : order.getOrderDetails()) {
            if (od.getProductId() != null) {
                Product product = findProductById(od.getProductId());
                if (product != null) {
                    System.out.printf("%-5s%-20s%-15s%-10d%-10.2f \n",
                            i, product.getName(), product.getId(), od.getQuantity(), od.getPrice());
                    i++;
                }
            }
        }
        System.out.println("----------------------------------------------------");

    }
}