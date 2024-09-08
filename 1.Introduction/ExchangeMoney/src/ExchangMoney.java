import java.util.Scanner;

public class ExchangMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you would like to exchange.");
        double amount = scanner.nextDouble();
        System.out.println("Enter the rate you would like to exchange.");
        double rate = scanner.nextDouble();
        double money = amount*rate;
        System.out.println("Currency USD to VND = "+ money);
        }
    }

