import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static int[][] readData(int ban, String[][] students) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int[][] data = new int[students.length][7];  // 국어, 영어, 수학 선택, 총점, 반석차, 학년 석차
        String[] subject = new String[]{"국어", "영어", "수학", "기술", "가정"};

        System.out.printf("*** %d반 성적 입력 ***\n", ban);
        for (int i = 0; i < data.length; i++) {
            int j = 0;
            while (j  < subject.length - 1) {
                if (j == 3 && students[i][2].equals("여"))
                    System.out.printf("%d반 학생 %s의 %s 점수 입력 : ",
                            ban, students[i][1], subject[j + 1]);
                else
                    System.out.printf("%d반 학생 %s의 %s 점수 입력 : ",
                            ban, students[i][1], subject[j]);
                data[i][j] = keyboard.nextInt();
                if (data[i][j] >= 0 && data[i][j] <= 100)
                    j++;
                else {
                    System.err.println("ERROR : ");
                    System.in.read();
                }
            }
            System.out.println();
        }

        return data;
    }
}