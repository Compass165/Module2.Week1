package LinearEquationResolver;

import java.util.Scanner;
//import java.sql.Date;
//import java.util.Locale;
public class LinearEquationResolver {

    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("Cho mot day la: 'a * x + b = c', Moi nhap hang");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("phuong trinh co 1 nghiem x = %f!\n", answer);
        } else if (b == c){
            System.out.println("Phuong trinh vo so nghiem");
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }


//        public static void main(String[] args) {
//            String string = "Học lập trình là một hạnh phúc";
//            System.out.printf("%S\n", string);
//        }


//        public static void main(String[] args) {
//            int x = 666;
//            double y = 33.99;
//            System.out.printf("%d\t%.5f", x, y);
//        }


}
