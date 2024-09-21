import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println("Enter c");
        int c = scanner.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if (delta>0){
            System.out.println("The equation has a 2 roots: "+ equation.getRoot1()+ " and "+ equation.getRoot2());

        } else if (delta==0) {
            System.out.println("The equation has 1 root: "+ equation.getRoot1());

        }else {
            System.out.println("The equation has no roots");
        }


    }
}
