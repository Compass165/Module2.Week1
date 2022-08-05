import java.util.Scanner;

public class LaiSuatNam {
    public static void main(String[] args) {

        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số tiền bạn gửi: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng bạn muốn gửi: ");
        month = input.nextInt();
        System.out.println("Tiền được nhận được nhận: ");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for (int i=0; i<month; i++){;
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("totalInterest = " + totalInterest);
    }
}
