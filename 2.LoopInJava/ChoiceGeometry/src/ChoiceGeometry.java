import java.util.Scanner;

public class ChoiceGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1:Print the rectangle");
        System.out.println("2:Print the square triangle ");
// (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)
        System.out.println("3:Print isosceles triangle");
        System.out.println("0:Exit");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        if(choice == 1) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        } else if (choice == 2) {
            System.out.println("1:Print the rectangle top-left");
            System.out.println("2:Print the square triangle top-right ");
            System.out.println("3:Print isosceles triangle bottom-left");
            System.out.println("4:Print isosceles triangle bottom-right");
            System.out.println("0:Exit");
            System.out.println("Enter your choice");
            int choiceTriangle = scanner.nextInt();
                if (choiceTriangle == 1) {
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 4; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                }else if (choiceTriangle == 2) {
                    for (int i = 5; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("  ");
                        }
                            System.out.println(" * ");
                    }
                /*else if (choiceTriangle == 2) {
                    for (int i = 5; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                } else if (choiceTriangle == 3) {
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print(" * ");
                        }
                        System.out.println();

                    }*/
                }
            }else if(choice == 3) {
            System.out.println("isosceles triangle");
            for (int i = 7; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            }else {
            System.out.println("Invalid choice");
        }
        }
        }








