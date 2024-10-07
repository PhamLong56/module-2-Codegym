package com.codegym.file;

import com.codegym.entity.Account;
import com.codegym.entity.Employee;
import com.codegym.entity.Product;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFile {
    public static void saveToFile(List<Employee> employeeList) {
        if (!employeeList.isEmpty()) {
            try{
                String fileName = "/Users/phamlong/CODEGYM/module-2/CaseStudy/C0724/src/com/codegym/file/txt/employee_account.txt";
                FileWriter fileWriter = new FileWriter(fileName);
                for (Employee account : employeeList) {
                    fileWriter.write(account.getUsername()+ "-");
                    fileWriter.write(account.getPassword()+"|\n");
                }
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static List<Employee> readFromFile() {
        int count = 0;
        StringBuilder username = new StringBuilder();
        StringBuilder password = new StringBuilder();

        List<Employee> accountList = new ArrayList<>();

        try {
            String fileName = "/Users/phamlong/CODEGYM/module-2/CaseStudy/C0724/src/com/codegym/file/txt/employee_account.txt";
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
                    username.append((char) character);
                }
                else if (count == 1 && (char)character != '-'&&(char)character != '|'){
                    password.append((char) character);
                }


                if ((char)character == '|'){
//                    System.out.println("Đã tải account nhan vien");
//                    System.out.println("User: " + username);
//                    System.out.println("Pass: " + password);

                    accountList.add(new Employee(username.toString(), password.toString()));
                    count = 0;
                    username = new StringBuilder();
                    password = new StringBuilder();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accountList;
    }
}
