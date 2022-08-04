package IntroductionJava;

import java.util.Scanner;

public class IA {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rong: ");
        width = scanner.nextFloat();

        System.out.println("Dai: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Dien tich la: " +area );

    }
}
