//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final int LIGHT = 300000;
        final int YEAR = 365;
        int second;
        long result;

        second = YEAR * 24 * 60 * 60;
        result = (long) second * LIGHT;

        System.out.printf("빛의 속도는 1초당 %,d \u33a2 입니다.\n", LIGHT);
        System.out.printf("1년은 %,d 초 입니다.\n", second);
        System.out.printf("빛이 1년간 간 거리는 %,d \u33a2 입니다.\n", result);
    }
}