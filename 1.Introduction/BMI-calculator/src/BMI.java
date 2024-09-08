import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter the height in meter: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18) {
            System.out.printf("BMI: %.2f - Underweight", bmi);
        } else if (bmi >= 18 && bmi < 25) {
            System.out.printf("BMI: %.2f - Normal", bmi);
        }else if (bmi >= 25 && bmi < 30){
            System.out.printf("BMI: %.2f - Overweight", bmi);
        }else if (bmi >= 30 && bmi < 35){
            System.out.printf("BMI: %.2f - Obese", bmi);
        }
        sc.close();
    }
}
