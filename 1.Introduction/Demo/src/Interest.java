import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter years interest: ");
        double years = sc.nextDouble();
        double interest = 0;

        for (int i = 0; i < years ; i++) {
            interest = amount * 6/100;
            amount= interest+amount;
            System.out.println("total= "+ amount);
        }
    }
}
