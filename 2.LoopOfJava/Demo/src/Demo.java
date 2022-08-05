import java.util.Scanner;

public class Demo {
//Demo break
//    public static void main(String[] args) {
//        for (int i=0; i<10;i++) {
//            if (i==5)
//                break;
//            System.out.printf("%d\t",i);
//        }
//        System.out.printf("%s\t","End of Loop");
//    }

//    Demo continue
    public static void main(String[] args) {
//        for (int i=0; i<10;i++) {
//            if (i==5)
//                continue;
//            System.out.printf("%d\t",i);
//        }
//        System.out.printf("%s\t","End of Loop");
        int a[] = {3, 4, 5, 7, 8, 9};

        a: for (int i = 10; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==4) break a;
                System.out.println(i+ " "+ j);
            }

        }

    }



}
