import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;


        System.out.print("분자, 분모 입력 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        float temp = (num2 == 0) ? 0.0f : (float) num1 / num2;
        String result = temp == 0 ? "ERROR : 분모가 0이면 안됩니다." :
                String.format("%d / %d = %.2f\n", num1, num2, temp);
        System.out.println(result);


        if (num2 == 0) {
            System.err.println("ERROR : 분모가 0이면 안됩니다.");
        } else {
            temp = (float) num1 / num2;
            System.out.printf("%d / %d = %.2f\n", num1, num2, temp);
        }

    }
}