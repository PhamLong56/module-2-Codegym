import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your money: ");
        double money = scanner.nextDouble();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        double interest = month * money * (rate/100)/12;
        System.out.printf("Your interest money %.1f = %.1f * %d * %.2f/year",interest,money,month,rate);
    }
}
