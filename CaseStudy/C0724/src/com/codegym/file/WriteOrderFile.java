//package com.codegym.file;
//
//import com.codegym.entity.Order;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//
//public class WriteOrderFile {
//    public static void writeFile(String path, String data) {
//        try{
//            File file = new File(path);
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
//            bufferedWriter.write(data);
//            bufferedWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public static void writeOrdersFile(String path, List<Order> orders) {
//        StringBuilder data = new StringBuilder();
//        for (Order order : orders) {
//            data.append(order.getInfo());
//        }
//        writeFile(path, data.toString());
//    }
//}
