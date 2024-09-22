//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        System.out.println("Circle is: "+circle.getArea());
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(10);
        cylinder.setRadius(5);
        cylinder.setColor("pink");
        System.out.println("Cylinder is: "+cylinder.getVolume());
        System.out.println(cylinder);

    }
}