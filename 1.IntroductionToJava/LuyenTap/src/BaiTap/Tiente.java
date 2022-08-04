package BaiTap;

import java.util.Scanner;

public class Tiente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Mời bạn nhập số tiền USD vào đây: $");
        double USD = scanner.nextDouble();


        double VND = (USD * 23000)/1000;
        System.out.printf("%.3fVND\t",VND);
    }

}
