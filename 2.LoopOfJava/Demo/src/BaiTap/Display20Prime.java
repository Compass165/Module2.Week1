package BaiTap;

import java.util.Scanner;

public class Display20Prime {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(" muon bao nhieu so: ");
//        int number = scanner.nextInt();
//        int count = 1;
//        boolean check = true;
//        if (number < 1){
//            System.out.println(" viet so khac");
//        }
//        else if (number == 1){
//            System.out.println('2');
//        }
//        else {
//            System.out.println('2');
//            int i = 3;
//            while (count < number) {
//                for (int j = 2; j < i; j++){
//                    if (i % j == 0){
//                        check = false;
//                    }
//                }
//                if (check) {
//                    count++;
//                    System.out.println(i);
//                }
//                i++;
//                check = true;
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số 20 vào: ");
        int number = scanner.nextInt();
        int count = 0, N = 2;
        while (count<number) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                count++;
                System.out.println(N);
            }
            N++;
        }

    }
}
