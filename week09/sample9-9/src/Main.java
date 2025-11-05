//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
       long money = 0L;
       long test = 0L;

       for (int day = 1; true; day++) {
           test = ((day == 1) ? 1L : (test * 2L));
           money += test;
           System.out.printf("%2d일(%,10d원) : %,12d원\n", day, test, money);
           if (money >= 100000000L)
               break;
        }
    }
}
