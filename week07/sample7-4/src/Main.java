import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
int result = 0;

System.out.printf("10진 정수 입력 ( 1 ~ 9999) : ");
num = keyboard.nextInt(10);

if (num >= 1 && num <= 9999) {
if (num >= 1000) {
    result = 9999 - num + 1;
} else if (num >=100) {
    result = 999 - num + 1;
    
} else if (num >=10) {
    result = 99 - num + 1;
} else {
    result = 9 - num + 1;
}
    System.out.printf("10의 진수 %,d의 10의 보수는 %,d입니다.\n", num, result);





} else {
    System.out.print("ERROR : 압력 값은 1 ~ 9999 입니다.");
}


        System.out.printf("10의 진수 %,d의 10의 보수는 %,d입니다.\n", num, result);
    }
}