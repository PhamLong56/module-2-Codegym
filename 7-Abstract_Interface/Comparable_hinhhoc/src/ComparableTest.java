import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2]= new ComparableCircle("indigo", false, 3.6);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After sort: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

    }
}
