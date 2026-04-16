import java.io.IOException;
import java.util.Scanner;

public class Part implements MyProject {
    private String partName;
    private int score;

    public Part(String partName) {
        this.partName = partName;
        this.score = 0;
    }

    public String getPartName() {
        return partName;
    }

    public int getScore() {
        return score;
    }

    protected void inputData(String name) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 %s 성적 입력 : ", name, partName);
            score = keyboard.nextInt();
            if (partName.equals("출석")) {
                if (isValid1(score))
                    break;
                else {
                    error("성적 입력 오류 (0 ~ 20 점)");
                }
            } else {
                if (isValid(score))
                    break;
                else {
                    error("성적 입력 오류 (0 ~ 100 점)");
                }
            }
        }
    }
}