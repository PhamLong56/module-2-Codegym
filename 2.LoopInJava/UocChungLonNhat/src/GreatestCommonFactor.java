import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0||b==0){
            System.out.println("The greatest common factor is zero");
        }
        while (a!=b){
            if(a>b){
                a=a-b;
            }else
                b=b-a;
        }
        System.out.println("The greatest common factor is "+a);
    }
}
