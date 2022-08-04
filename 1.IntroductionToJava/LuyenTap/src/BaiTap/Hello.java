package BaiTap;
import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập tên của mình: ");
        String name = scanner.nextLine();

        System.out.println("Hello:  " + name);
    }

}
