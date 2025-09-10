import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        short age = 0;

        System.out.print("당신의 이름은 ? ");
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는 ? ", name);
        age = keyboard.nextShort();

        System.out.printf("\n%s님의 나이는 %d살 입니다.\n", name, age);

    }
}