package array;

import static array.ReverseArray.reverseArray;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArray(array);
        System.out.println("Array after reverse is: ");
        for(int i : array){
            System.out.print(i + " ");
        }
    }


}
