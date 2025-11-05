//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int j = 1; j <= 3; j++) {
            System.out.printf("Set : %d\n", j);

            int i = 1;
            do {
                System.out.printf("필굽혀펴기 : %2d 회\n", i++);
            } while (i <= 20);

        /*    while (i <= 20) {
                System.out.printf("필굽혀펴기 : %2d 회\n", i++);
            } */

         /*   for (int i = 1; i <= 20; i++) {
                System.out.printf("필굽혀펴기 : %2d 회\n", i);
            } */
        }
    }
}