
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        float[] movie = new float[10];
        final float MIN = 1.0f;
        final float MID = 5.0f;
        final float MAX = 10.0f;
        float total = 0.0f, avg;
        int maxCount = 0;
        int minCount = 0;

        int i = 0;
        while (i < movie.length) {
            System.out.printf("%d번 고객의 평점 입력 : ", i + 1);
            movie[i] = keyboard.nextFloat();

            if (movie[i] >= MIN && movie[i] <= MAX)
                i++;
            else {
                System.err.printf("ERROR : %.1f ~ %.1f", MIN, MAX);
                System.in.read();
            }
        }

        for (i = 0; i < movie.length; i++)
            total += movie[i];

        avg = total / movie.length;

        for (i = 0; i < movie.length; i++) {
            if (movie[i] == MAX)
                maxCount++;
            if (movie[i] <= MID)
                minCount++;
        }

        System.out.printf("평균 점수 : %3.1f 점\n", avg);
        System.out.printf("만점자(%.0f 점) 수 : %d 명\n", MAX, maxCount);
        System.out.printf("%.0f점 이하자 수 : %d 명\n", MID, minCount);
    }
}
