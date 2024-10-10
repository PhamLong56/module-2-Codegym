package com.codegym.file;

import com.codegym.model.CompanyPhone;
import com.codegym.model.ForeignPhone;
import com.codegym.model.MobilePhone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MobileData {
    private static final String FILE_NAME = "src/com/codegym/file/product.csv";

    public static void saveToFile(List<MobilePhone> phoneList) {
        if (!phoneList.isEmpty()) {
            try (FileWriter fileWriter = new FileWriter(FILE_NAME)) {
                for (MobilePhone phone : phoneList) {
                    fileWriter.write(phone.getId() + ",");
                    fileWriter.write(phone.getName() + ",");
                    fileWriter.write(phone.getPrice() + ",");
                    fileWriter.write(phone.getQuantity() + ",");
                    fileWriter.write(phone.getManufacturer() + ",");

                    if (phone instanceof CompanyPhone) {
                        CompanyPhone companyPhone = (CompanyPhone) phone;
                        fileWriter.write("1,");
                        fileWriter.write(companyPhone.getWarrantyPeriod() + ",");
                        fileWriter.write(companyPhone.getWarrantyScope() + ",");
                    } else if (phone instanceof ForeignPhone) {
                        ForeignPhone foreignPhone = (ForeignPhone) phone;
                        fileWriter.write("2,");
                        fileWriter.write(foreignPhone.getImportedCountry() + ",");
                        fileWriter.write(foreignPhone.getCondition() + ",");
                    }
                    fileWriter.write("|\n");
                }
                fileWriter.flush();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<MobilePhone> readFromFile() {
        List<MobilePhone> phoneList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] phoneData = line.split(",");

                String id = phoneData[0];
                String name = phoneData[1];
                double price = Double.parseDouble(phoneData[2]);
                int quantity = Integer.parseInt(phoneData[3]);
                String manufacturer = phoneData[4];

                MobilePhone phone;
                if (phoneData[5].equals("1")) {
                    int warrantyPeriod = Integer.parseInt(phoneData[6]);
                    String warrantyScope = phoneData[7];
                    phone = new CompanyPhone(id, name, price, quantity, manufacturer, warrantyPeriod, warrantyScope);
                } else {
                    String importedCountry = phoneData[6];
                    String condition = phoneData[7];
                    phone = new ForeignPhone(id, name, price, quantity, manufacturer, importedCountry, condition);
                }
                phoneList.add(phone);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return phoneList;
    }
}
