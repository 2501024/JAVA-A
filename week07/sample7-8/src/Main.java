import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary = 0;
        int tax = 0;

        System.out.print("급여액 입력 (1 ~ 30000000) : ");
        salary = keyboard.nextInt();

        if (salary > 0 && salary <= 30000000) {
         if (salary < 2000000) {
             tax = 0;
         } else if (salary <= 4000000) {
             tax = (int)((salary - 2000000) * (10.0f / 100));
         } else if (salary <= 6000000) {
             tax = (int)((salary - 2000000) * (8.0f / 100));
         } else if (salary <= 20000000) {
             tax = (int)((salary - 2000000) * (6.0f / 100));
         } else {
             tax = (int)((salary - 2000000) * (5.0f / 100));
         }
            System.out.printf("급여액 %,d원이면, 세금은 %,d원 입니다.\n", salary, tax);
        } else {
            System.err.println("ERROR : 급여액이 이상하네");
        }
    }
}