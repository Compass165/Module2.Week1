package BaiTap;

import java.util.Scanner;

public class ReadNumToName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Mời bạn nhập số cần đọc thành chữ: ");
        int number = scanner.nextInt();

//        System.out.print("Số cần đọc là: " + number);
        System.out.printf("%s%20s\n\n","Số","Chữ");
        String isNumber = "";

        switch (number) {

            case 0:
                isNumber = "Zero";
                break;

            case 1:
                isNumber = "One";

                break;

            case 2:
                isNumber = "Two";

                break;

            case 3:
                isNumber = "Three";

                break;

            case 4:
                isNumber = "Four";

                break;

            case 5:
                isNumber = "Five";

                break;

            case 6:
                isNumber = "Six";

                break;

            case 7:
                isNumber = "Seven";

                break;

            case 8:
                isNumber = "Eight";

                break;

            case 9:
                isNumber = "Nine";

                break;

            case 10:
                isNumber = "Ten";

                break;

            default:
                System.out.println("Out of ability");
        }
//        System.out.printf("%-19d%s",number,isNumber);
        System.out.println("number is " + isNumber);
    }
}
