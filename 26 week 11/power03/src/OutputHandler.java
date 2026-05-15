import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class OutputHandler {

    protected void report(String fileName, ArrayList<Customer> customers) {
        header();
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
        line(60);
        try {
            PrintWriter printWriter = new PrintWriter(fileName, StandardCharsets.UTF_8);
            header(printWriter);
            for (int i = 0; i < customers.size(); i++) {
                printWriter.println(customers.get(i));
            }
            line(60, printWriter);
            printWriter.close();
            System.out.printf("%s 파일이 생성되었습니다.\n", fileName);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    private void header(PrintWriter printWriter) {
        line(60, printWriter);
        printWriter.println(" 고객번호  이름  사용량  기본요금   세금   납부금액   비고 ");
        line(60, printWriter);
    }

    private void header() {
        line(60);
        System.out.println(" 고객번호  이름  사용량  기본요금   세금   납부금액   비고 ");
        line(60);
    }

    private void line(int count, PrintWriter printWriter) {
        for (int i = 0; i < count; i++)
            printWriter.print("*");
        printWriter.println();
    }

    private void line(int count) {
        for (int i = 0; i < count; i++)
            System.out.print("*");
        System.out.println();
    }

}