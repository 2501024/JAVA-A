import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String[][][] students = new String[3][][]; //3반 학생 정보 저장
        students[0] = new String[][]{ //1반 학생 정보
                {"2101234", "홍길동", "남"}, {"2101235", "경복대", "여"},
                {"2101236", "한국인", "남"}, {"2101345", "정상인", "여"}};
        students[1] = new String[][]{ //2반 학생 정보
                {"2301345", "구자철", "남"}, {"2301435", "이가을", "여"},
                {"2301443", "김광현", "남"}, {"2301678", "박종철", "남"},
                {"2301679", "올시즌", "여"}};
        students[2] = new String[][]{ //3반 학생 정보
                {"2401234", "한민국", "여"}, {"2401456", "안우진", "남"},
                {"2401789", "이대한", "남"}};
        int[][][] score = new int[students.length][][];  // 학생 성적 저장
        float[][] avg = new float[students.length][];    // 학생별 평균 저장

        for (int i = 0; i < students.length; i++) {
            score[i] = Input.readData(i + 1, students[i]);
            System.out.println();
        }

        for (int i = 0; i < students.length; i++) {
            Compute.total(score[i]);
        }

        for (int i = 0; i < students.length; i++)
            Compute.sort(students[i], score[i]);     // 정렬

        Compute.ranking(score);    // 반 석차

        Compute.gradeRanking(score);   // 학년 석차

        Compute.average(score, avg);


        Output.display(students, score, avg);
    }
}