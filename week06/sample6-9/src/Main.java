import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int CIGA = 7;  // 분
        int life;
        float minute;
        float year = 0;
        int ga;
        float hour = 0;
        float temp = 0;
float day = 0;

        System.out.print("당신은 몇년동안 담배를 피웠나요 ? ");
        life = keyboard.nextInt();
        System.out.print("하루에 평균 몇개피를 피우나요 ? ");
        ga = keyboard.nextInt();

        minute = life * 24 * 60 * CIGA;
        year =(int) ((float)minute / 60 / 24 / 365);
day = (int) ((float)minute /60 /24);
hour = minute - (day * 60 * 24);

        System.out.printf("담배 1개피는 %d분의 수명을 단축 합니다.\n", CIGA);
        System.out.printf("%d년 동안 %d개피의 담배를 피우면 %,.1f분의 생명이 단축 됩니다.\n", life, ga, minute);
        System.out.printf("%,.1f분은%.0f년 %.0f일 %.0f시간 %.0f 분 입니다.\n", minute, year, day, hour, temp);
    }
}