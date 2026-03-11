import java.util.Scanner;

public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("정수 2개를 입력 : ");
    int num1 = keyboard.nextInt();
    int num2 = keyboard.nextInt();
    Adder adder = new Adder(num1, num2);
    System.out.println(adder);
}




