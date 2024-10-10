package input;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("--------------Menu--------------");
            System.out.println("1: Create a new user: ");
            System.out.println("0: Exit!!!");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createUser();
                    break;
                    case 2:
                        showListUser();
                        break;
            }
        }while (choice != 0);


    }
    public static void createUser() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------Create User ---------------");
            System.out.println("Enter the name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the email: ");
            String email = scanner.nextLine();

            User user = new User(name, email);

            File myFile = new File("data.txt");
            FileWriter writer = new FileWriter(myFile, true);

            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            String data = user.getName() + " " + user.getEmail();
            // su dung append them du lieu vao file du lieu cu
            bufferedWriter.append(data);
            bufferedWriter.newLine();
            bufferedWriter.close();

    }
    public static void showListUser() throws IOException {

        try{
            File myFile = new File("data.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            List<User> listusers = new ArrayList<User>();

            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");// chuyen chuoi thanh mang
                String name = data[0];
                String email = data[1];

                User newUser = new User(name, email);
                listusers.add(newUser);
            }
            for (User user : listusers) {
                System.out.println(user);
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
