import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("당신의 이름은 ? ");
        String name = keyboard.nextLine();


        System.out.print(name + "님의 나이는 ? ");
        int age = Integer.parseInt(keyboard.nextLine());


        System.out.print(name + "님의 주소는 ? ");
        String address = keyboard.nextLine();


        System.out.println();
        System.out.println(name + "님의 나이는 " + age + "살 입니다.");
        System.out.println(name + "님의 주소는 " + address + " 입니다.");

        keyboard.close();
    }
}
