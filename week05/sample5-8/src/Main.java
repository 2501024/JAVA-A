import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char ch = ' ';
String result = "";
String type = "";

        System.out.print("하나의 문자 입력 : ");
        ch = (char) keyboard.nextInt() ;

        result = (ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' &&  ch <= '9') ? "올바른" : "올바르지 않은";

        type = (ch >= 'A' && ch <= 'Z') ? "대문자":
                 (ch >= 'a' && ch <= 'z') ? "소문자" :
                        (ch >= '0' && ch <= '9') ? "숫자" : "X";


        System.out.printf("입력한 문자 %c는 %s(%s) 문자 입니다.\n", ch, result, type);
        }
    }
