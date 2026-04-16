public class Person {
    private String studentID;
    private String name;

    public Person(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%8s %3s", studentID, name);
    }
}