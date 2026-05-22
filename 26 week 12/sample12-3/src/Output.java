public class Output {
    public static void display(int radius, float area) {
        display();
        System.out.printf("원의 반지름 : %,d Cm\n", radius);
        System.out.printf("원의 면적 : %.2f \u33a0\n", area);
        display();
    }

    private static void display() {
        System.out.println("*******************************");
    }
}