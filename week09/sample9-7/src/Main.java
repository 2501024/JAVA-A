//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float degree;


        for (int i = 0; i <= 100; i += 10) {  // 화씨 온도
            degree = (5 / 9.0f) * (i - 32);
            System.out.printf("화씨 온도 : %3d\u2103, 섭씨 온도 : %6.2f\u2109\n", i, degree);
        }
    }
}