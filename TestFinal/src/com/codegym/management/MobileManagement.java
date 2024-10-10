package com.codegym.management;

import com.codegym.file.MobileData;
import com.codegym.model.CompanyPhone;
import com.codegym.model.ForeignPhone;
import com.codegym.model.MobilePhone;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MobileManagement {
    private List<MobilePhone> phoneList = new ArrayList<MobilePhone>();
    private Scanner scanner = new Scanner(System.in);
    private int autoId = 1;

    public MobileManagement() {
        try {
            phoneList = MobileData.readFromFile();
            autoId = phoneList.size() + 1;
        } catch (Exception e) {
            System.out.println("Lỗi khi đọc dữ liệu từ tệp: " + e.getMessage());
        }
    }

    private String idList() {
        return String.format("%03d", autoId);
    }


    public void addNewMobile() {
        try {
            System.out.println("Chọn loại điện thoại: 1. Chính hãng, 2. Xách tay");
            int type = scanner.nextInt();
            scanner.nextLine();

            String id = idList();

            System.out.print("Nhập tên điện thoại: ");
            String name = scanner.nextLine();
            System.out.print("Nhập giá bán: ");
            double price = scanner.nextDouble();
            System.out.print("Nhập số lượng: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập nhà sản xuất: ");
            String manufacturer = scanner.nextLine();

            if (type == 1) {
                System.out.print("Nhập thời gian bảo hành (tháng): ");
                int warrantyPeriod = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập phạm vi bảo hành (trong nước/quốc tế): ");
                String warrantyScope = scanner.nextLine();
                phoneList.add(new CompanyPhone(id, name, price, quantity, manufacturer, warrantyPeriod, warrantyScope));
            } else if (type == 2) {
                System.out.print("Nhập quốc gia xách tay: ");
                String importedCountry = scanner.nextLine();
                System.out.print("Nhập trạng thái (mới/cũ): ");
                String condition = scanner.nextLine();
                phoneList.add(new ForeignPhone(id, name, price, quantity, manufacturer, importedCountry, condition));
            } else {
                System.out.println("Chọn không hợp lệ!!!");
            }
            System.out.println("Điện thoại đã được thêm mới");
            MobileData.saveToFile(phoneList);
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm điện thoại: " + e.getMessage());
        }
    }

    public void deleteMobile() {
        try {
            System.out.print("Nhập mã sản phẩm cần xóa: ");
            String idToDelete = scanner.nextLine();
            for (MobilePhone mobilePhone : phoneList) {
                if (idToDelete.equals(mobilePhone.getId())) {
                    phoneList.remove(mobilePhone);
                    System.out.println("Xóa sản phẩm thành công!!!");
                } else {
                    System.out.println("Không tìm thấy sản phẩm với mã sản phẩm: " + idToDelete);
                }
            }
            MobileData.saveToFile(phoneList);
        } catch (Exception e) {
            System.out.println("Lỗi khi xóa sản phẩm: " + e.getMessage());
        }

    }

    public void showAllMobile() {
        if (phoneList.isEmpty()) {
            System.out.println("Danh sách điện thoại trống.");
        } else {
            System.out.println("Danh sách điện thoại:");
            for (MobilePhone phone : phoneList) {
                System.out.println("- Id điện thoại: " + phone.getId());
                System.out.println("  Tên điện thoại: " + phone.getName());
                System.out.println("  Giá bán: " + phone.getPrice());
                System.out.println("  Số lượng: " + phone.getQuantity());
                System.out.println("  Nhà sản xuất: " + phone.getManufacturer());
                if (phone instanceof CompanyPhone) {
                    CompanyPhone companyPhone = (CompanyPhone) phone;
                    System.out.println("  Thời gian bảo hành: " + companyPhone.getWarrantyPeriod() + " tháng");
                    System.out.println("  Phạm vi bảo hành: " + companyPhone.getWarrantyScope());
                } else if (phone instanceof ForeignPhone) {
                    ForeignPhone foreignPhone = (ForeignPhone) phone;
                    System.out.println("  Quốc gia xách tay: " + foreignPhone.getImportedCountry());
                    System.out.println("  Trạng thái: " + foreignPhone.getCondition());
                }

                System.out.println();
            }
        }
    }

    public void searchMobile() {
        System.out.print("Nhập tên điện thoại cần tìm: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (MobilePhone phone : phoneList) {
            if (phone.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("- Id điện thoại: " + phone.getId());
                System.out.println("  Tên điện thoại: " + phone.getName());
                System.out.println("  Giá bán: " + phone.getPrice());
                System.out.println("  Số lượng: " + phone.getQuantity());
                System.out.println("  Nhà sản xuất: " + phone.getManufacturer());
                if (phone instanceof CompanyPhone) {
                    CompanyPhone companyPhone = (CompanyPhone) phone;
                    System.out.println("  Thời gian bảo hành: " + companyPhone.getWarrantyPeriod() + " tháng");
                    System.out.println("  Phạm vi bảo hành: " + companyPhone.getWarrantyScope());
                } else if (phone instanceof ForeignPhone) {
                    ForeignPhone foreignPhone = (ForeignPhone) phone;
                    System.out.println("  Quốc gia xách tay: " + foreignPhone.getImportedCountry());
                    System.out.println("  Trạng thái: " + foreignPhone.getCondition());
                }
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy điện thoại với tên: " + name);
        }
    }

}
