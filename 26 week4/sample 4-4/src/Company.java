
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {
    private ArrayList<Employee> employees;

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).inputExtraPay();
        }
    }

    public void sortByPayment() {
        Collections.sort(employees, new netComparator().reversed());
    }

    private class netComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.payment() - o2.payment();
        }
    }

    protected void display() {
        sortByPayment();
        line();
        System.out.println("   이름(생일)  사번  부서  호봉  기본급  수당   급여   세금   지급액");
        line();
        for (int i = 0; i < employees.size(); i++)
            System.out.println(employees.get(i));
        line();
    }

    private void line() {
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
