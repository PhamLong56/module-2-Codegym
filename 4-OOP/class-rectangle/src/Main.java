import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("The rectangle is " + rectangle.display());
        System.out.println("The Area is " + rectangle.getArea());
        System.out.println("The Perimeter is " + rectangle.getPerimeter());
    }
}
