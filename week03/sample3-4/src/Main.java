//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 21;
        float eye = 1.2f;
        String blood = "0";



        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %2d\n", age);
        System.out.printf("시력 : %3.1f\n", eye);
        System.out.printf("혈액형 : %s\n", blood);
    }
}