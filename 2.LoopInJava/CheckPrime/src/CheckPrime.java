import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if(number <2){
            isPrime = false;
        }else{
            int i=2;
            boolean check = true;
            while(i<number){
                if(number %i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println("Prime");
            }else
                System.out.println("Not a prime number");
        }

    }
}
