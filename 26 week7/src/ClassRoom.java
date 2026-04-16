import java.io.IOException;

public class ClassRoom {
    private Student[] students;

    public ClassRoom(Student[] students) {
        this.students = students;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < students.length; i++) {
            students[i].inputData();
            System.out.println();
        }
    }

    protected void display() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }
}