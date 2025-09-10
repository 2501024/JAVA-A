import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        int first;
        int second;
        int result;


        System.out.print("첫번째 정수 입력 : ");
        first = keyboard.nextInt();
        System.out.print("두번째 정수 입력 : ");
        second = keyboard.nextInt();


        result = first * second;



        System.out.printf("%,d * %,d = %,d\n", first, second, result);


    }
}