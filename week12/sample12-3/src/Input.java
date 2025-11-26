
import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static int readData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int radius;
        while (true) {
            System.out.print("원의 반지름 입력 : ");
            radius = keyboard.nextInt();
            if (radius <= 0) {
                System.err.println("ERROR : 음수!!!");
                System.in.read();
            } else
                break;
        }

        return radius;
    }
}
