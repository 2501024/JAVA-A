import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary, expenses;  // Data
        int save, remain, money;   // 정보
        float saveRate; // 저축 비율 (Data)


        System.out.print("당신의 급여액 입력 : ");
        salary = keyboard.nextInt();
        System.out.print("월 저축 비율 (예 20% -> 0.2) : ");
        saveRate = keyboard.nextFloat();
        System.out.print("월 기본 지출 비용 입력 : ");
        expenses = keyboard.nextInt();

        save = (int) (saveRate * salary);
        remain = salary - (save + expenses);
        money = remain / 30;


        System.out.println("[예산 계산 결과]");
        System.out.printf("월급 : %,d원\n", salary);
        System.out.printf("저축액 : %,d원\n", save);
        System.out.printf("지출액 : %,d원\n", expenses);
        System.out.printf("남은 금액 : %,d원\n", remain);
        System.out.printf("일일 사용 가능 예산 : %,d원\n", money);
    }
}