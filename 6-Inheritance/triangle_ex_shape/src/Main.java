import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the side2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the side3: ");
        double side3 = scanner.nextDouble();
        triangle.setColor("Pink");
        triangle.getArea();
        System.out.println(triangle);
    }
}