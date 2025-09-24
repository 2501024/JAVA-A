//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int  result1, result2;
        float result3;


        System.out.print("첫 번째 수를 입력 (분자) : ");
        int op1 = keyboard.nextInt();
        System.out.print("두 번째 수를 입력 (분모) : ");
       int op2 = keyboard.nextInt();

        result1 = op1 / op2;
        result2 = op1 % op2;
        result3 = (float) op1 / op2;




        System.out.printf("\n%d를 %d로 나누면 몫 = %d, 나머지 = %d 이다.\n", op1, op2, result1, result2);
        System.out.printf("%d를 %d로 나누면 = %.1f 이다.\n", op1, op2, result3);
    }
}