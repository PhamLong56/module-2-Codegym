public class NumberMinArray {

    public static void main(String[] args) {
        int []arr ={4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest number is " + arr[index]);
    }
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
            System.out.println(array[index]);
        }
        return index;
    }
}
