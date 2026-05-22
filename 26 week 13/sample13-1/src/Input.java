import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static int[][] reaDate(String[] students) throws IOException {
        int[][] data = new int[students.length][4];  // {국어, 영어, 수학, 총점}
        String[] subject = {"국어", "영어", "수학"};
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subject.length; j++) {
                data[i][j] = input(students[i], subject[j]);
            }
        }
        return data;
    }

    private static int input(String student, String s) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int data;
        while (true) {
            System.out.printf("%s님의 %s 성적 입력 : ", student, s);
            data = keyboard.nextInt();
            if (data >= 0 && data <= 100)
                break;
            else {
                System.err.println("ERROR");
                System.in.read();
            }
        }
        return data;
    }
}