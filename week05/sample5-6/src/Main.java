import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int data = 0;
String result ="";

        System.out.printf("정수 입력 : ");
        data = keyboard.nextInt();

        result = data > 0 ? "양수" : ((data == 0) ? "영" : "음수");


        System.out.printf("입력한 숫자 %d는 %s입니다.\n", data, result);
    }
}