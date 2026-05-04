import java.io.IOException;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }


    public Employee[] getEmployees() {
        return employees;
    }

    protected void sortByNet() {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].net() < employees[j + 1].net()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }



}