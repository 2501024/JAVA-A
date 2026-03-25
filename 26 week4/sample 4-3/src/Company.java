
import java.io.IOException;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < employees.length; i++) {
            employees[i].inputExtraPay();
        }
    }

    private void sortByPayment() {
        Employee temp;
        for (int i = 0; i < employees.length - 1; ++i) {
            for (int j = i + 1; j < employees.length; ++j) {
                if (employees[i].payment() < employees[j].payment()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }


    protected void display() {
        sortByPayment();
        line();
        System.out.println("   이름(생일)  사번  부서  호봉  기본급  수당   급여   세금   지급액");
        line();
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i]);
        line();
    }

    private void line() {
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
