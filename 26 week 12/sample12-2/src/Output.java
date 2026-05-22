public class Output {
    // Method Overload (중복 정의)

    public static void dsiplay(int temp, float result) {
        dsiplay("*");    // call by value
        System.out.printf("섭씨온도 %d \u2103 -> 화씨온도 %.2f \u2109\n",
                temp, result);
        dsiplay("+");
    }

    private static void dsiplay(String s) {
        for (int i = 0; i < 30; i++)
            System.out.print(s);
        System.out.println();

    }
}