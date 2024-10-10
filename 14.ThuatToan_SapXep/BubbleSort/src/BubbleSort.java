import java.util.Arrays;

public class BubbleSort {
    static int[] list = {11,9,8,3,2,10,1,5,4,6};
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        int count =0;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;

            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    needNextPass = true;
                    System.out.println(Arrays.toString(list));
                }
                count++;
            }

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }
}
