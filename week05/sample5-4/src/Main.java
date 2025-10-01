//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int b = 5;
        int a = 5 > 3 ? b++ : --b;

        System.out.printf("a = %d, b =%d\n", a, b);

        a = 5 > 3 && b > a ? b++ : --b;
        System.out.printf("a = %d, b =%d\n", a, b);

        a = 5 < 3 || b > a ? b++ : --b;
        System.out.printf("a = %d, b =%d\n", a, b);


    }
}