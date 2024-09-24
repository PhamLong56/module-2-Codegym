import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inputString = scanner.nextLine();

        int[] frequentChars = new int[255];
        for (int i = 0; i <inputString.length(); i++) {
        int ascii = (int) inputString.charAt(i);
        frequentChars[ascii] += 1;
    }
        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequentChars[i] > max) {
                max = frequentChars[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is " + character+ " with a frequency of " + max+ " times");
    }
}
