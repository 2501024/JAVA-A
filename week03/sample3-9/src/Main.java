import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
 final String NAME = "양준혁";
        int batting = 0;
        int hit = 0;
        float result = 0.0f;

        System.out.print("오늘의 타수 입력 : ");
        batting = keyboard.nextInt();
        System.out.print("오늘의 안타수 입력 : ");
        hit = keyboard.nextInt();

        result = (float) hit/batting;



        System.out.printf("선수 이름 : %s\n", NAME);
        System.out.printf("오늘의 타수 : %ds\n", batting);
        System.out.printf("오늘의 안타수 : %ds\n", hit);
        System.out.printf("오늘의 타율 : %.2f\n", result);
    }
}