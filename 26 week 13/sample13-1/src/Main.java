import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String[] students = new String[]{"홍길동", "이순신", "임꺽정", "한민국", "이대한"};

        int[][] score = Input.reaDate(students);

        Compute.total(score);

        Output.display(students, score);
    }
}