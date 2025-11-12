
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] name = new String[]{"홍길동", "이재명", "윤석열", "경복대", "오세훈",
                "강민성", "김시온", "이진우", "한정우", "니키타"};
        String[] hakbun = {"2501002", "2501004", "2501012", "2501022", "2501032",
                "2501042", "2501054", "2501062", "2501072", "2501082"};
        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];
        int[] total = new int[name.length];
        int[] rank = new int[name.length];
        float[] avg = new float[name.length];
        boolean swapped = false;


        int i = 0;
        while (i < name.length) {
            System.out.printf("\n%s 학생의 국어 성적 입력 : ", name[i]);
            kor[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 영어 성적 입력 : ", name[i]);
            eng[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 수학 성적 입력 : ", name[i]);
            math[i] = keyboard.nextInt();

            if ((kor[i] >= 0 && kor[i] <= 100) &&
                    (eng[i] >= 0 && eng[i] <= 100) &&
                    (math[i] >= 0 && math[i] <= 100)) {
                i++;
            } else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
        }

        for (i = 0; i < name.length; i++) {
            total[i] = kor[i] + eng[i] + math[i];
        }

        for (i = 0; i < name.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < name.length; j++) {
                if (total[i] < total[j])
                    ++rank[i];
            }
        }


        /*
        for (i = 0; i < name.length - 1; i++) {
            swapped = false;
            // 인접한 요소를 비교 후 교환
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (total[j] < total[j + 1]) {  // 내림 차순
                    // 자리 교환 (swap)
                    String text = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = text;

                    text = hakbun[j];
                    hakbun[j] = hakbun[j + 1];
                    hakbun[j + 1] = text;

                    int temp = kor[j];
                    kor[j] = kor[j + 1];
                    kor[j + 1] = temp;

                    temp = eng[j];
                    eng[j] = eng[j + 1];
                    eng[j + 1] = temp;

                    temp = math[j];
                    math[j] = math[j + 1];
                    math[j + 1] = temp;

                    temp = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = temp;
                    swapped = true;
                }
            }
            // 교환이 한 번도 일어나지 않았다면 이미 정렬 완료
            if (!swapped) break;
        } */

        for (i = 0; i < name.length; i++) {
            avg[i] = total[i] / 3.0f;
        }



      /*  for (i = 0; i < name.length; i++)
            rank[i] = i + 1;

        for (i = 0; i < name.length - 1; i++) {
            if (avg[i] == avg[i + 1])
                rank[i + 1] = rank[i];
        }

        for (i = 0; i < name.length - 1; i++) {
            swapped = false;
            // 인접한 요소를 비교 후 교환
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (hakbun[j].compareTo(hakbun[j + 1]) > 0) {  // 내림 차순
                    // 자리 교환 (swap)
                    String text = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = text;

                    text = hakbun[j];
                    hakbun[j] = hakbun[j + 1];
                    hakbun[j + 1] = text;

                    int temp = kor[j];
                    kor[j] = kor[j + 1];
                    kor[j + 1] = temp;

                    temp = eng[j];
                    eng[j] = eng[j + 1];
                    eng[j + 1] = temp;

                    temp = math[j];
                    math[j] = math[j + 1];
                    math[j + 1] = temp;

                    temp = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = temp;
                    temp = rank[j];
                    rank[j] = rank[j + 1];
                    rank[j + 1] = temp;

                    float temp1 = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = temp1;

                    swapped = true;
                }
            }
            // 교환이 한 번도 일어나지 않았다면 이미 정렬 완료
            if (!swapped) break;
        } */


        System.out.println("***********************************************");
        System.out.println(" 학번   이름  국어  영어   수학  총점   평군   등수 ");
        System.out.println("***********************************************");
        for (i = 0; i < name.length; i++) {
            System.out.printf("%7s %3s  %3d  %3d  %3d  %3d   %5.1f %2d\n",
                    hakbun[i], name[i], kor[i], eng[i], math[i], total[i], avg[i], rank[i]);
        }
        System.out.println("***********************************************");
    }
}
