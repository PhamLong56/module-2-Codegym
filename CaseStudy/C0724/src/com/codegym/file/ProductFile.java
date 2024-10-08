package com.codegym.file;

import com.codegym.entity.Product;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.codegym.entity.Product.updateCounters;

public class ProductFile {
    public static void saveToFile(List<Product> productList) {
        if (!productList.isEmpty()) {
            try{
                String fileName = "/Users/phamlong/CODEGYM/module-2/CaseStudy/C0724/src/com/codegym/file/txt/productlist.txt";
                FileWriter fileWriter = new FileWriter(fileName);
                for (Product product : productList) {
                    fileWriter.write(product.getId()+ "-");
                    fileWriter.write(product.getName()+ "-");
                    fileWriter.write(product.getPrice()+ "-");
                    fileWriter.write(product.getDescription()+ "-");
                    fileWriter.write(product.getType()+"|\n");
                }
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
    public static List<Product> readFromFile() {
        int count = 0;
        StringBuilder id = new StringBuilder();
        StringBuilder name = new StringBuilder();
        StringBuilder price = new StringBuilder();
        StringBuilder description = new StringBuilder();
        StringBuilder type = new StringBuilder();

        List<Product> productList = new ArrayList<>();


        try {
            String fileName = "/Users/phamlong/CODEGYM/module-2/CaseStudy/C0724/src/com/codegym/file/txt/productlist.txt";
            FileReader fileReader = new FileReader(fileName);

            while (true){
                int character = fileReader.read();
//                System.out.print((char) character);
                if (character == -1){
                    break;
                }
                if ((char)character == '-'){
                    count++;

                }
                if (count == 0 && (char)character != '-' && (char)character != '\n'){
                    id.append((char) character);
                }
                else if (count == 1 && (char)character != '-'){
                    name.append((char) character);
                }
                else if (count == 2 && (char)character != '-'){
                    price.append((char) character);
                }
                else if (count == 3 && (char)character != '-'){
                    description.append((char) character);
                }
                else if (count == 4 && (char)character != '-'&&(char)character != '|'){
                    type.append((char) character);
                }


                if ((char)character == '|'){
//                    System.out.println("Đã tải menu");
//                    System.out.println("ID: " + id);
//                    System.out.println("Name: " + name);
//                    System.out.println("Price: " + price);
//                    System.out.println("Description: " + description);
//                    System.out.println("Type: " + type);


                    productList.add(new Product(id.toString(), name.toString(), Double.parseDouble(price.toString()), description.toString(), type.toString()));
                    count = 0;
                    updateCounters(productList);
                    id = new StringBuilder();
                    name = new StringBuilder();
                    price = new StringBuilder();
                    description = new StringBuilder();
                    type = new StringBuilder();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
}


