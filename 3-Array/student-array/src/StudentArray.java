import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String input_name = sc.nextLine();
        boolean exists = false;
        for (int i = 0; i < students.length; i++) {
            if (input_name.equals(students[i])) {
                System.out.println("Position of the student in the list "+ input_name+" is: "+ i);
                exists = true;
                break;
            }
        }
        if (!exists) {
            System.out.println(input_name + " is Student not found");
        }
    }
}
