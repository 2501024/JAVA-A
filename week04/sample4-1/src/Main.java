import java.io.PrintStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
int a = 5;
int b = -a;

int c = (((a++) + 5) + (--b));


        int d = (((a++) + 5) + (--b));

        float e = (float) a / c;

        int f = 9 % 4;
int g = -9 % 4;
float h = -9.2f % 4;

a += 5 * c;
      System.out.printf("a = %d, b = %d, c= %d, d=%d, e = %.2f, f = %d , g = %d ,h =%.2f\n", a, b, c, d, e, f, g, h);
    }
}