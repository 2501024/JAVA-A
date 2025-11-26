
public class Output {
    // Method Overloading

    public static void display(int[] data, int result) {
        display("*");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("data[%d] = %d\n", i, data[i]);
        }
        System.out.printf(" 합계 : %,d\n", result);
        display("+");        // call by value
    }

    private static void display(String temp) {
        for (int i = 0; i < 30; i++)
            System.out.print(temp);
        System.out.println();
    }
}
