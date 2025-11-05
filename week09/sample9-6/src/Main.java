import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int num;
        int count = 0;
        int total = 0;

        for ( ; true;  ) {
            System.out.print("양의 정수 입력 : ");
            num = keyboard.nextInt();

            if (num > 0) {
                break;
            } else {
                System.err.println("ERROR : 양의 정수 입력");
                System.in.read();
            }
        }

        System.out.printf("입력한 정수는 %,d 입니다.\n",num);

        while (num != 0) {
            total += (num % 10);
            count++;
            num /= 10;
            //    System.out.printf("%d\n", num);
        }

        System.out.printf("숫자의 개수는 %d개 입니다.\n", count);
        System.out.printf("숫자의 합은 %d 입니다.\n", total);
    }
}