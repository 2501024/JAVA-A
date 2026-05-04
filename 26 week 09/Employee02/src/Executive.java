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

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getStockOption() {
        return stockOption;
    }

    public void setStockOption(int stockOption) {
        this.stockOption = stockOption;
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