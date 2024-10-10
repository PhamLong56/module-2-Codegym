package com.codegym.management;

import com.codegym.entity.Product;
import com.codegym.file.ProductFile;

import java.text.NumberFormat;
import java.util.*;

public class ProductManagement {
    private static List<Product> products = new ArrayList<Product>();

    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(List<Product> products) {
        ProductManagement.products = products;
    }

    public static void addProduct() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập thông tin sản phẩm");
            System.out.println("1. Thức uống: ");
            System.out.println("2. Thức ăn: ");
            System.out.print("Chọn: ");
            int choiceType = scanner.nextInt();
            scanner.nextLine();
            String type = "";
            if (choiceType == 1) {
                type = "D";
            } else if (choiceType == 2) {
                type = "F";
            } else {
                System.out.println("Lựa chọn không hợp lệ!!");
            }
            System.out.print("Nhập tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.print("Nhập mô tả: ");
            String description = scanner.nextLine();
            System.out.print("Nhập giá: ");
            Double price = scanner.nextDouble();

            String newId = new Product(type, name, description, price).getId();
            for (Product product : products) {
                if (product.getId().equals(newId)) {
                    System.out.println("Mã sản phẩm đã tồn tại, không thể thêm.");
                    return;
                }
            }
            products.add(new Product(type, name, description, price));
            System.out.println("Đã thêm thành công!!!!");
            ProductFile.saveToFile(products);

        } catch (InputMismatchException ei) {
            System.out.println("Bạn đã nhập sai giá trị, xin nhập lại");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void loadProducts() {
        products = ProductFile.readFromFile();
        Product.updateCounters(products);
    }

    public static void showProduct() {
        System.out.println("--------------------------MENU------------------------------");
        System.out.printf("%-10s%-30s%-10s%-10s\n", "ID", "Tên Sản Phẩm", "Giá", "Mô Tả");
        System.out.println("------------------------------------------------------------");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        for (Product product : products) {
            System.out.printf("%-10s%-30s%-10s%-10s\n", product.getId(), product.getName(), formatter.format(product.getPrice()), product.getDescription());
        }
        System.out.println("--------------------------END------------------------------");
        System.out.println("------------------------------------------------------------");
    }

    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String idToDelete = scanner.nextLine();
        for (Product product : products) {
            if (product.getId().equals(idToDelete)) {
                products.remove(product);
                ProductFile.saveToFile(products);
                System.out.println("Xóa sản phẩm thành công!!!");
            } else {
                System.out.println("Không tìm thấy sản phẩm với mã sản phẩm: " + idToDelete);
            }
        }

    }

    public static void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        String idToUpdate = scanner.nextLine();
        boolean found = false;

        for (Product product : products) {
            if (product.getId().equals(idToUpdate)) {
                System.out.println("Thông tin sản phẩm hiện tại:");
                System.out.printf("Tên: %s\n", product.getName());
                System.out.printf("Mô tả: %s\n", product.getDescription());
                System.out.printf("Giá: %.2f\n", product.getPrice());

                System.out.print("Nhập tên mới: ");
                String newName = scanner.nextLine();
                System.out.print("Nhập mô tả mới: ");
                String newDescription = scanner.nextLine();
                System.out.print("Nhập giá mới: ");
                Double newPrice = scanner.nextDouble();

                product.setName(newName);
                product.setDescription(newDescription);
                product.setPrice(newPrice);
                System.out.println("Đã cập nhật thành công");
                ProductFile.saveToFile(products);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mã sản phẩm: " + idToUpdate + " không có trong dánh menu");
        }

    }

    public static void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên hoặc một phần tên sản phẩm cần tìm: ");
        String name = scanner.nextLine().toLowerCase();

        boolean found = false;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                if (!found) {
                    System.out.println("--------------------KẾT QUẢ TÌM KIẾM-----------------------");
                    System.out.printf("%-10s%-20s%-10s%-10s\n", "ID", "Tên Sản Phẩm", "Giá", "Mô Tả");
                    System.out.println("-----------------------------------------------------------");
                    found = true;
                }
                System.out.printf("%-10s%-20s%-10s%-10s\n", product.getId(), product.getName(), formatter.format(product.getPrice()), product.getDescription());

            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm với từ khóa: " + name);
        }

        System.out.println("--------------------------END------------------------------");
    }
}
