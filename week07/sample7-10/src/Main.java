import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score;
        char grade;
        char plus = ' ';

        System.out.print(" 점수 입력 (0 ~ 100) : ");
        score = keyboard.nextInt();

        if (score >= 0 && score <= 100) {
            int temp = score / 10;
            switch (temp) {
                case 10:
                    grade = 'A';
                    plus = '+';
                    break;
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
                    plus = ' ';
            }

            if (temp == 9 || grade == 'B' || grade == 'C' || grade == 'D') {
                int temp1 = score % 10;
                switch (temp1) {
                    case 9:
                    case 8:
                    case 7:
                    case 6:
                    case 5:
                        plus = '+';
                        break;
                    default:
                        plus = ' ';
                }
            }
            System.out.printf("점수가 %d이면 학점은 %c%c 입니다.\n", score, grade, plus);
        } else {
            System.err.println("ERROR : 점수는 0 ~ 100 입니다.");
        }
    }
}