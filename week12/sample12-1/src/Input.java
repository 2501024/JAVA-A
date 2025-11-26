import java.util.Scanner;

public class Input {
    static int readData(String msg) {
        Scanner keyboard = new Scanner(System.in);
        int temp;
        System.out.print(msg);
        temp = keyboard.nextInt();

        return  temp;
    }
}