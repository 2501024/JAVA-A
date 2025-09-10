import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        char ch = ' ';


        System.out.print("문자 하나 입력 : ");
        ch = keyboard.next().charAt(0);


        System.out.printf("\n입력한 문자 %c의 ASCII 코드는 %h이다.\n",ch, ch);

    }
}