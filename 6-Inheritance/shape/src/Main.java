
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
        Shape shape2 = new Shape("black", false);
        System.out.println(shape2);

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(4);
        System.out.println(circle);
        circle = new Circle("pink",true,2);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(4,5);
        System.out.println(rectangle);
        rectangle = new Rectangle("red",false,2,3);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square("pink",true,2);
        System.out.println(square);


    }
}