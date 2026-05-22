import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String[][] customers = new String[][] {{"1111", "홍길동", "1", ""},
                {"2222", "이순신", "2", ""}, {"7777", "한민국", "3", ""},
                {"3333", "이대한", "4", ""}, {"8888", "경복대", "5", ""},
                {"4444", "정성호", "4", ""}, {"9999", "김남국", "2", ""},
                {"5555", "황철현", "3", ""}, {"1010", "조동국", "5", ""},
                {"6666", "이예린", "1", ""}};

        for (int i = 0; i < customers.length; i++)
            Input.preProcess(customers[i]);

        float[] used = Input.readData(customers);
        int[][] money = new int[customers.length][3]; // {사용요금, 세금, 징수금액}

        for (int i = 0; i < customers.length; i++) {
            Compute.pay(customers[i], used[i], money[i]);
        }

        Compute.tax(customers, money);

        for (int i = 0; i < money.length; i++)
            Compute.total(money[i]);

        Output.display(customers, used, money);
    }
}