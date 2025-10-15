import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int HEART = 65;   // 분당
        int life;
        long result;

        System.out.print("당신은 몇년 살았나요 ?");
        life = keyboard.nextInt();

        result = (long) life * 365 * 24 * 60 * HEART;

        System.out.printf("심장은 분당 %d회 박동 합니다.\n", HEART);
        System.out.printf("%d년 동안 살았다면 %,d 회 심장박동 했습니다.\n", life, result);
    }
}