public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The Area: "+ circle1.radius +" is "+circle1.getArea());
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The Area: "+ circle2.radius +" is "+circle2.getArea());
    }
}
