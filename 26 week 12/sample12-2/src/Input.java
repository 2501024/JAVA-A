import java.util.Scanner;

public class Input {
    public static int readData() {
        Scanner keyboard = new Scanner(System.in);
        int temp;

        System.out.print("섭씨온도 입력 : ");
        temp = keyboard.nextInt();

        return temp;
    }
}