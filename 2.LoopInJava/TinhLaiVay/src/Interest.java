import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money =1;
        int month = 1;
        double interestRate =1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter investment amount : ");
        money = scan.nextDouble();
        System.out.print("Enter number of months : ");
        month = scan.nextInt();
        System.out.println("Enter annual interest rate in percentage : ");
        interestRate = scan.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money*(interestRate/100)/12*month;
        }
        System.out.println("Total interest : "+totalInterest);
    }

}
