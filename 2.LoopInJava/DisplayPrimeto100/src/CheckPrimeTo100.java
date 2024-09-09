import java.util.Scanner;

public class CheckPrimeTo100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to start: ");
        int N = scanner.nextInt();
        System.out.println("Enter a number to end: ");
        int E = scanner.nextInt();
        int count = 0;
        if(N%2==0) N++;
        while (N <= E) {
            if (isPrime(N)) {
                System.out.println("Prime number: " + N);
                count++;
            }
            N++;
        }
    }
    private static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}