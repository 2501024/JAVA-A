import java.io.IOException;
import java.util.Scanner;

public class Setting implements MyProject{
    public Setting() {
    }

    protected int setting() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int type;
        while (true) {
            System.out.print(" 1 = 고등학교, 2 = 대학교 선택 : ");
            type = keyboard.nextInt();
            if (type == 1 || type == 2) {
                break;
            } else
                error("1 or 2");
        }
        return type;
    }

    protected Student[] prepare(int type, Person[] persons) throws IOException {
        Student[] students;
        if (type == 1) {
            students = new HighSchool[persons.length];
            for (int i = 0; i < persons.length; i++) {
                students[i] = new HighSchool(persons[i].getStudentID(), persons[i].getName());
            }
        } else {
            students = new University[persons.length];
            for (int i = 0; i < persons.length; i++) {
                students[i] = new University(persons[i].getStudentID(), persons[i].getName());
            }
        }
        return students;
    }
}