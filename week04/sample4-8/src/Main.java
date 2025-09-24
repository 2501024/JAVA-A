import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary, bonus;
        int total, tax;


        System.out.print("본봉 입력 : ");
        salary = keyboard.nextInt();
        System.out.print("보너스 입력 : ");
        bonus = keyboard.nextInt();

        total = salary +  bonus;
        tax = (int) (total * (8.0f / 100));
        tax /= 100;
        tax *= 100;


        System.out.printf("본봉은 %,d 원\n", salary);
        System.out.printf("보너스는 %,d 원\n", bonus);
        System.out.printf("총 수입액 = %,d원\n", total);
        System.out.printf("세금 = %,d 원\n", tax);
        System.out.printf("실 입금액 = %,d 원 \n", total - tax);
    }
}