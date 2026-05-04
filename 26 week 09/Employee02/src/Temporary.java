import java.io.IOException;
import java.util.Scanner;

public class Temporary extends Employee {
    private int dailyPay;
    private int workDay;

    public Temporary(String name, Date hireDate, String employeeID) {
        super(name, hireDate, employeeID);
    }

    public int getDailyPay() {
        return dailyPay;
    }

    public void setDailyPay(int dailyPay) {
        this.dailyPay = dailyPay;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
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