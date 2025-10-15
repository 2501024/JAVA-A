//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final float YEAR = 365.2422f;
        int day;
        int hour;
        int minute;
        int second;

float temp = YEAR;
        day = (int) temp;

        temp-= day;
        temp *= 24;
        hour = (int) temp;
        temp -= hour;
        temp *= 60;
        minute = (int) temp;

        temp -= minute;
         temp *= 60;
        second = (int)   (temp + 0.5f);

        System.out.printf("1년은 %.4f일 입니다.\n", YEAR);
        System.out.printf("\t %d일\n\t %d시간\n\t %d분\n\t %d초\n", day, hour, minute, second);
    }
}