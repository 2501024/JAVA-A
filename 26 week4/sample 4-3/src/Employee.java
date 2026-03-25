import java.io.IOException;
import java.util.Scanner;

public class Employee {
    private String[] person;
    private Date birthDay;
    private Department department;
    private Grade grade;
    private int extraPay;

    public Employee(String[] person, Date birthDay, Department department, Grade grade) {
        this.person = person;
        this.birthDay = birthDay;
        this.department = department;
        this.grade = grade;
    }

    protected void inputExtraPay() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 수당 입력 : ", person[0]);
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
        return String.format("%3s%s %4s %3s %c %,10d원 %,8d원 %,10d원 %,8d원 %,10d원",
                person[0], birthDay, person[1], department.getName(),
                grade.getGrade(), grade.getBaseSalary(), extraPay, gross(), tax(),  payment());
    }
}