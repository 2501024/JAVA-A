//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
final int SAVE = 100000000;
final int MONTH = 2000000;
final float RATE = 5 / 100.0f;
float deposit = SAVE;
int month =0;
do {
    if (MONTH != 0 && MONTH % 12 == 0)
        deposit += deposit * RATE;
    if (deposit < MONTH)
        break;
    deposit -= MONTH;
    month++;
    System.out.printf("%d달 후 잔고 : %,.0f원\n", month, deposit);
        } while (true);
System.out.printf("%d년 %d달 까지 살수가 있네요\n", month / 12, month % 12);
    }
}