import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the Triangle");
            System.out.println("2. Draw the Square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Draw the Triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Draw the Square");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Draw the Square");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("I dont Understand your choice!");
            }

        }
    }

}
