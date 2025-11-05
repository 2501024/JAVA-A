//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     /*   System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you.");
        System.out.println("I love you."); */

        for (int i = 0; i <= 10; i++) {
            System.out.println("I love you.");
        }
        System.out.println();

        int i = 0;
        while (i <= 10) {
            System.out.println("I love you.");
            i++;
        }

        System.out.println();
        i = 0;
        do {
            System.out.println("I love you.");
            i++;
        } while (i <= 10);
    }
}