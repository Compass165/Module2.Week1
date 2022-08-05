package BaiTap;
import java.util.Scanner;

public class PrimeLessThan100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số 100: ");
        int count = scanner.nextInt();

        for (int number=2; number<=count ;number++) {
            int i=2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) System.out.println(number + " is a prime");
        }
    }

}
