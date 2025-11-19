
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[][] students = new String[][]{{"12345", "홍길동"}, {"34563", "이혜인"},
                {"45321", "김명성"}, {"56456", "경복대"}, {"67853", "이대학"}, {"67891", "강민성"}};
        String[] subject = {"국어", "영어", "수학"};
        int[][] score = new int[students.length][subject.length + 1];
        float[] avg = new float[students.length];



        for (int i = 0; i < students.length; i++) {
            int j = 0;
            while (j < subject.length) {
                System.out.printf("%s 학생의 %s 과목 성적 입력 : ", students[i][1], subject[j]);
                score[i][j] = keyboard.nextInt();

                if (score[i][j] >= 0 && score[i][j] <= 100)
                    j++;
                else {
                    System.err.println("ERROR : 0 ~ 100");
                    System.in.read();
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < score[i].length - 1; j++) {
                score[i][score[i].length - 1] += score[i][j];
            }
        }

        for (int i = 0; i < students.length; i++) {
            avg[i] = score[i][score[i].length - 1] / 3.0f;
        }



        System.out.println("***************************************************");
        System.out.printf(" 학번   이름   %2s  %2s  %2s  합계 평균 \n", subject[0], subject[1], subject[2]);
        System.out.println("***************************************************");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%6s %3s %3d %3d %3d %3d %6.1f\n", students[i][0], students[i][1],
                    score[i][0], score[i][1], score[i][2], score[i][3], avg[i]);
        }
        System.out.println("***************************************************");

    }
}
