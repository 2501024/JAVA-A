
import java.io.IOException;
import java.util.Scanner;

public class Employee {
    private String name;
    private String employeeID;
    private Date birthDay;
    private char departNo;
    private char grade;
    private int extraPay;

    public Employee(String name, String employeeID, Date birthDay, char departNo, char grade) {
        this.name = name;
        this.employeeID = employeeID;
        this.birthDay = birthDay;
        this.departNo = departNo;
        this.grade = grade;
    }

    protected void inputExtraPay() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 수당 입력 : ", name);
            extraPay = keyboard.nextInt();
            if (extraPay >= 0 && extraPay <= 1000000) {
                break;
            } else {
                System.err.print("ERROR : 수당 오류");
                System.in.read();
            }
        }
    }

    private String depart() {
        String result = "";
        switch (departNo) {
            case '1' :
                result = "인사팀";
                break;
            case '2' :
                result = "재무팀";
                break;
            case '3' :
                result = "영업팀";
                break;
            case '4' :
                result = "개발팀";
                break;
            case '5' :
                result = "생산팀";
        }
        return result;
    }

    private int salary() {
        int result = 0;
        switch (grade) {
            case '1' :
                result = 1650000;
                break;
            case '2' :
                result = 1680000;
                break;
            case '3' :
                result = 1700000;
                break;
            case '4' :
                result = 1720000;
                break;
            case '5' :
                result = 1750000;
        }
        return result;
    }

    private int gross() {
        return salary() + extraPay;
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
                name, birthDay.toString(), employeeID, depart(), grade, salary(), extraPay,
                gross(), tax(), payment());
    }
}
