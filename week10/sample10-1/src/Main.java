import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {


        Scanner keyboard = new Scanner(System.in);


        int[] java = {95, 75, 80, 70, 100};
        float[] java1 = {95.0f, 70.0f, 80.0f, 75.0f, 100.0f};
        String name[] = {"홍길동", "이재명", "윤석열", "경복대", "오세훈"};

        int i = 0;
        while (i < name.length) {
            System.out.printf("%s님의 java 성적 입력 : ", name[i]);
            java[i] = keyboard.nextInt();
        }
        { if (java[i] >= 0 && java[i] <= 100)
            i++;
        else {
            System.err.println("ERROR : 0~100 입력");
            System.in.read();
        }

            for (i = 0; 1 < java.length; i++)
                System.out.printf("%d번 JAVA 성적 :  %3d 점\n", name[i], java[i]);
        }
    }
}