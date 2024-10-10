import java.util.Scanner;

public class demooooo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
            if(isSquareNUmber(i)){
                System.out.println("SquareNumber= "+i);
            }
        }
        System.out.println("sum= " + sum);
    }
    static boolean isSquareNUmber(double x) {
        double sqrt = Math.sqrt(x);
        return sqrt -(Math.floor( sqrt)) == 0;
    }
}