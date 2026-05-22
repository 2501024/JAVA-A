import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static float[] readData(String[][] customers) throws IOException {
        float[] data = new float[customers.length];

        for (int i = 0; i < customers.length; i++)
            data[i] = readData(customers[i][1]);    // call by value

        return data;
    }

    private static float readData(String name) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        float temp;
        while (true) {
            System.out.printf("%s 고객의 수도 사용량 입력 : ", name);
            temp = keyboard.nextFloat();
            if (temp >= 0.0f && temp <= 999.9f)
                break;
            else {
                System.err.println("ERROR");
                System.in.read();
            }
        }
        return temp;
    }

    public static void preProcess(String[] customer) {
        if (customer[2].equals("1")) {
            customer[3] = "가정용";
        } else if (customer[2].equals("2")) {
            customer[3] = "영업용";
        } else if (customer[2].equals("3")) {
            customer[3] = "공장용";
        } else if (customer[2].equals("4")) {
            customer[3] = "관공서";
        } else if (customer[2].equals("5")) {
            customer[3] = "군기관";
        } else {
            customer[3] = "";
        }
    }
}