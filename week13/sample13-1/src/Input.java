
import java.io.IOException;
import java.util.Scanner;

public class Input {
    static Scanner keyboard = new Scanner(System.in);
    static String[] subject = {"국어", "영어", "수학"};

    public static int[][] inputData(String[] name) throws IOException {
        int[][] data = new int[name.length][4];  // {"국어", "영어", "수학", "총점"}


        int i = 0;
        while (i < data.length) {
            for (int j = 0; j < subject.length; j++) {
                data[i][j] = readData(name[i], j, data[i][j]);
            }
            i++;
        }

        return data;
    }



    private static int  readData(String name, int i, int i1) throws IOException {
        while (true) {
            System.out.printf("%s님의 %s 성적 입력 : ", name, subject[i]);
            i1 = keyboard.nextInt();
            if (i1 >= 0 && i1 <= 100)
                break;
            else {
                System.out.println("ERROR : ");
                System.in.read();
            }
        }
        return i1;
    }
}
