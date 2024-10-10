public class demo5_testbreak {
    public static void main(String[] args) {
        int sum =0;
        int number = 10;
        while (number <= 20) {
            number++;
            sum += number;
            if(sum>100){
                break;
            }
        }
        System.out.println("The number is: " + number);
        System.out.println("The sum is: " + sum);

    }
}
