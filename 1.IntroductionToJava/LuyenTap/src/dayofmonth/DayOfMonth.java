package dayofmonth;

import java.util.Scanner;

public class DayOfMonth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mày muốn đếm số ngày trong tháng nào?");
        int month = scanner.nextInt();


        switch (month) {
            case 2:
                System.out.println("Tháng '2' chỉ có 28 hoặc 29 ngày thôi");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Để mà nói rằng ấy, tháng: '" + month + "' chỉ có 31 ngày thôi!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Để mà nói rằng ấy, tháng: '" + month + "' có tận 30 ngày cơ mà!");
                break;
            default:
                System.out.println("Đíu hiểu sao lại nhập sai tháng ạ?");
                break;
        }

    }

}
