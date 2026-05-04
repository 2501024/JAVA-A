import java.io.IOException;
import java.util.Scanner;

public class Temporary extends Employee {
    private int dailyPay;
    private int workDay;

    public Temporary(String name, Date hireDate, String employeeID) {
        super(name, hireDate, employeeID);
    }

    protected void inputData(String type) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        inputDailyPay(type, keyboard);
        inputWorkDay(type, keyboard);

    }

    private void inputWorkDay(String type, Scanner keyboard) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 작업 일수 입력 : ", type, getName());
            workDay = keyboard.nextInt();
            if (isValid1(workDay))
                break;
            else
                error("작업 일수 오류 (0 ~ 31)");
        }
    }

    private void inputDailyPay(String type, Scanner keyboard) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 일당 입력 : ", type, getName());
            dailyPay = keyboard.nextInt();
            if (isValid(dailyPay))
                break;
            else
                error("일당 오류 (25,000 ~ 95,000)");
        }
    }


    @Override
    public int baseSalary() {
        return dailyPay * workDay;
    }



    @Override
    public String toString() {
        return String.format("%s %c급(%s) %c호봉 %2d %,6d원 %,9d원 %,7d원 %,7d원 %,7d원 %,8d원 %,9d원 %,7d원 %,9d원",
                super.toString(), 'X', "일용", 'X', workDay, dailyPay, baseSalary(), baseBonus(),
                managerBonus(), 0, 0, salary(), tax(), net());

    }
}