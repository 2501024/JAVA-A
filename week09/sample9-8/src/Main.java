//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int TURTLE = (35 * 1000) / (60 * 60); // 초당 거리
        final int RABIT = (60 * 1000) / (60 * 60);  // 초당 거리

        int turtle = 450;
        int rabit = 0;

        int i = 1;
        for (   ; true; i++) {
            turtle += TURTLE;
            rabit += RABIT;

            if (rabit > turtle)
                break;
            System.out.printf("%d초후 토끼 : %,d m, 거북이 : %d m\n", i, rabit, turtle);
        }
        System.out.printf("%d초후 토끼 : %,d m, 거북이 : %d m\n", i, rabit, turtle);
    }
}