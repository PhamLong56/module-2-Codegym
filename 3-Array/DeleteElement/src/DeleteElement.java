import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,6,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be deleted");
        int X = sc.nextInt();
        int index = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == X) {
                index= i;
            }
        }
        for (int i = index; i < array.length-1 ; i++) {
            array[i] = array[i+1];

        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+ " ");
//        }

        for(int i: array) {
            System.out.print(i + " ");
        }
    }
}
