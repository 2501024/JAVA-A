import java.io.IOException;
import java.util.Scanner;

public class Input {
    static Scanner keyboard = new Scanner(System.in);


    public static void readData(String[][] students, int[] height) throws IOException {
        int i = 0;
        while (i < students.length) {
            System.out.printf("%s 학생의 키 입력 : ", students[i][0]);
            height[i] = keyboard.nextInt();
            if (height[i] >= 30 && height[i] < 230)
                i++;
            else {
                System.err.println("ERROR : 30 ~ 230");
                System.in.read();
            }
        }
    }


    public static void readData(String[][] students, float[][] weight) throws IOException {
        int i = 0;
        while (i < students.length) {
            System.out.printf("%s 학생의 몸무게 입력 : ", students[i][0]);
            weight[i][0] = keyboard.nextFloat();
            if (weight[i][0] >= 30 && weight[i][0] < 230)
                i++;
            else {
                System.err.println("ERROR : 30 ~ 230");
                System.in.read();
            }
        }
    }
}