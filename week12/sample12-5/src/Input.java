
import java.io.IOException;
import java.util.Scanner;

public class Input {
    static Scanner keyboard = new Scanner(System.in);

    public static void readData(String[][] students, int[] height) throws IOException {
        int i = 0;
        while (i < students.length) {
            System.out.printf("%s님의 키 입력 : ", students[i][0]);
            height[i] = keyboard.nextInt();
            if (height[i] >= 30 && height[i] <= 250)
                i++;
            else {
                System.err.println("ERROR : 30 ~ 250");
                System.in.read();
            }
        }
    }

    public static void readData(String[][] students, float[][] height) throws IOException {
        int i = 0;
        while (i < students.length) {
            System.out.printf("%s님의 몸무게 입력 : ", students[i][0]);
            height[i][0] = keyboard.nextFloat();
            if (height[i][0] >= 30.0f && height[i][0] <= 250.0f)
                i++;
            else {
                System.err.println("ERROR : 30 ~ 250");
                System.in.read();
            }
        }
    }
}
