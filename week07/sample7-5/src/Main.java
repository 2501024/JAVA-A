import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        char result = 0;

        System.out.print("두 정수 입력 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.err.printf("%d와 %d를 곱하면 0 입니다.\n", num1, num2, result);
        } else {
            if ((num1 > 0 && num2 > 0) || (num1 < 0 && num2 < 0))
                result = '양';
            else {
                result = '음';
            }


            System.out.printf("%d와 %d를 곱하면 부호는 %c수(%,d) 입니다.\n", num1, num2, result, num1 * num2);
        }
    }
}