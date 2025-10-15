import java.util.Scanner;
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int GOLD = 852000;
        float weight;
        final float DON = 3.75f;
        float temp;
        long result;

        System.out.print("당신의 몸무게 입력 : ");
        weight = keyboard.nextFloat();


        temp = weight * 1000 / DON;
        result = (long) (temp * GOLD);
result /=1000;
result *=1000;


        System.out.printf("금 1돈(%.2f g)의 가격은 %,d 원 입니다.\n", DON, GOLD);
        System.out.printf("나의 몸무게 %.1f Kg(%.1f 돈)은 %,d 원 입니다.\n", weight, DON, temp);
        System.out.printf("나의 몸값은 %,d 원 입니다.\n", result);
    }
}