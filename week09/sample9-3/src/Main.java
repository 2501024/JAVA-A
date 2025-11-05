import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        final int COUNT =5;
        int grade;
        int total = 0;
        float avg;

        int i  =1;
        while (i <= COUNT) {
            System.out.printf("%d번 학생 성적 입력 : ", i);
            grade = keyboard.nextInt();
            if (grade >=0 && grade <= 100) {
                total += grade;
                i++;
            } else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
        }
    }
}