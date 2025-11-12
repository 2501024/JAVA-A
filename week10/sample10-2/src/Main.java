import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text;
        char[] result;

        System.out.print("영 문장 입력 : ");
        text = keyboard.nextLine();

        result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                result[i] = (char) (text.charAt(i) - 32);
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                result[i] = (char) (text.charAt(i) + 32);
            } else {
                result[i] = text.charAt(i);
            }
        }

        System.out.printf("원문 : %s\n", text);
        System.out.printf("변경 : %s\n", new String(result));
    }
}