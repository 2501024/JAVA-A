
public class Output {
    public static void display(double temp, double result) {
        display();
        System.out.printf("섭씨온도 %.2f\u2103 -> 화씨온도 %.2f\u2109\n", temp, result);
        display();       // call by name
    }

    private static void display() {
        System.out.println("********************************");
    }
}
