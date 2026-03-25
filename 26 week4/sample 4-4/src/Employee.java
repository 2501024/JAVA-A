
import java.io.IOException;
import java.util.Scanner;

public class Employee extends Person{
    private String employeeID;
    private Department department;
    private Grade grade;
    private int extraPay;

    public Employee(String name, Date birthDay, String employeeID, Department department, Grade grade) {
        super(name, birthDay);
        this.employeeID = employeeID;
        this.department = department;
        this.grade = grade;
    }

    protected void inputExtraPay() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 수당 입력 : ", super.getName());
            extraPay = keyboard.nextInt();
            if (extraPay >= 0 && extraPay <= 1000000) {
                break;
            } else {
                System.err.print("ERROR : 수당 오류");
                System.in.read();
            }
        }
    }

    private int gross() {
        return grade.getBaseSalary() + extraPay;
    }

    private int tax() {
        int tax = 0;

        if (gross() < 1700000) {
            tax = (int) (gross() * (5.0f / 100));
        } else if (gross() < 2300000) {
            tax = (int) (gross() * (8.0f / 100));
        } else {
            tax = (int) (gross() * (10.0f / 100));
        }
        return tax;
    }

    protected int payment() {
        return gross() - tax();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%4s %3s %c %,10d원 %,8d원 %,10d원 %,8d원 %,10d원",
                employeeID, department.getName(), grade.getGrade(), grade.getBaseSalary(),
                extraPay, gross(), tax(), payment());

    }
}
