package BaiTap;

import java.util.Scanner;

public class DisplayHinh {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw Rectangle");
            System.out.println("2. Draw the Upside down Triangle");
            System.out.println("3. Draw the Inverted Triangle");
            System.out.println("4. Draw the Isosceles Triangle");
            System.out.println("5. Draw the Rectangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 4:
                    int k = 0;
                    System.out.println("Draw the Isosceles Triangle");
                    for (int i = 1; i <= 6; ++i, k=0) {
                        for (int space = 1; space <= 6 - i; ++space) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Draw the Upside down Triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Draw the Inverted Triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Draw the Square");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;

                case 1:
                    System.out.println("Draw Rectangle");
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
