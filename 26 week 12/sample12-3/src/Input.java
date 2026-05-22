import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static int redata() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int radius;

        while (true) {
            System.out.print("원의 반지름 입력 : ");
            radius = keyboard.nextInt();
            if (radius > 0)
                break;
            else {
                System.err.println("ERROR : ");
                System.in.read();
            }
        }

        return radius;
    }
}