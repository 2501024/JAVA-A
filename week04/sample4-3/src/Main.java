import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int won = 0;           // data
        float convert;         // Data
        float dollar = 0.0f;   // 정보


        System.out.print("오늘의 달러 환율 입력 : ");
        convert = keyboard.nextFloat();
        System.out.print("원화 얼마를 달러로 환전할까요 ? ");
        won = keyboard.nextInt();



        dollar = won / convert;


        System.out.printf("원화 %,d원은 %,f 달러($) 입니다.\n", won, dollar);

    }
}