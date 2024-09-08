import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        /*if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }*/

        if(year % 4 ==0){
            if(year % 100 ==0){
                if(year % 400 ==0){
                    System.out.printf("%d Leap Year",year);
                } else {
                    System.out.printf("%d Not Leap Year", year);
                }
            }else {
                System.out.printf("%d Leap Year",year);
            }
        } else {
            System.out.printf("%d Not Leap Year",year);
        }
        scanner.close();
    }
}
