package com.codegym.file;

import com.codegym.entity.Order;
import com.codegym.entity.OrderDetail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class OrderFile {
    private static final String FILE_NAME = "/Users/phamlong/CODEGYM/module-2/CaseStudy/C0724/src/com/codegym/file/txt/order_file.txt";

    public static void saveToFile(List<Order> orderList) {
        if (!orderList.isEmpty()) {
            try (FileWriter fileWriter = new FileWriter(FILE_NAME)) {
                for (Order order : orderList) {

                    fileWriter.write(order.getIdOrder() + "-");
                    fileWriter.write(order.getCustomerName() + "-");
                    fileWriter.write(order.getCustomerPhone() + "-");
                    fileWriter.write(order.getCustomerEmail() + "-");


                    for (OrderDetail detail : order.getOrderDetails()) {
                        fileWriter.write(detail.getProductId() + "-");
                        fileWriter.write(detail.getPrice() + "-");
                        fileWriter.write(detail.getQuantity() + "-");
                    }
                    fileWriter.write("|\n");
                }

                fileWriter.flush();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<Order> readFromFile() {
        List<Order> orderList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] orderData = line.split("-");


                String idOrder = orderData[0];
                String customerName = orderData[1];
                String customerPhone = orderData[2];
                String customerEmail = orderData[3];

                Order order = new Order(customerName, customerPhone, customerEmail);
                order.setIdOrder(idOrder);


                for (int i = 4; i < orderData.length; i += 3) {
                    if (orderData[i].equals("|")) {
                        break;
                    }
                    String productId = orderData[i];
                    double price = Double.parseDouble(orderData[i + 1]);
                    int quantity = Integer.parseInt(orderData[i + 2]);

                    OrderDetail orderDetail = new OrderDetail();
                    orderDetail.setProductId(productId);
                    orderDetail.setPrice(price);
                    orderDetail.setQuantity(quantity);

                    order.getOrderDetails().add(orderDetail);
                }
                orderList.add(order);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return orderList;
    }
}




