import java.io.IOException;
import java.util.Scanner;

public class Executive extends Reqular{
    private int performance;
    private int stockOption;


    public Executive(String name, Date hireDate, String employeeID, int grade) {
        super(name, hireDate, employeeID, grade, 0);
        this.performance = 0;
        this.stockOption = 0;
    }

    protected void inputData(String type) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        inputPerformance(type, keyboard);
        inputStockOption(type, keyboard);

    }

    private void inputPerformance(String type, Scanner keyboard) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 성과 수당 입력 : ", type, getName());
            performance = keyboard.nextInt();
            if (isValid2(performance))
                break;
            else
                error("성과 수당 오류 (0 ~ 700,000)");
        }
    }

    private void inputStockOption(String type, Scanner keyboard) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 스탁옵션 입력 : ", type, getName());
            stockOption = keyboard.nextInt();
            if (isValid3(stockOption))
                break;
            else
                error("스탁옵션 오류 (0 ~ 1,000,000)");
        }
    }

    @Override
    public int baseBonus() {
        return 0;
    }

    @Override
    public int salary() {
        return baseSalary() + performance + stockOption;
    }

    @Override
    public String toString() {
        return String.format("%s %,7d원 %,7d원 %,7d원 %,8d원 %,9d원 %,7d원 %,9d원",
                super.toString(), baseBonus(), managerBonus(), performance, stockOption, salary(), tax(), net());
    }
}