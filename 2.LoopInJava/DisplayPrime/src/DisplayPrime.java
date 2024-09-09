import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int counter = 0;
        System.out.println("Enter a number to start: ");
        int N = scanner.nextInt();
        if(N%2==0){
            N++;
        }
        while(counter < number) {
            if(isPrime(N)){
                System.out.println("Prime number: " + N);
                counter++;
            }
            N++;
        }
        scanner.close();
    }
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
