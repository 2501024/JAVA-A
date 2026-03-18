
public class ClassRoom {
    private Person teacher;
    private Person student;

    public ClassRoom(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
    }

    public void startClass(Book book) {
        if (teacher instanceof Teacher)
            ((Teacher) teacher).teach();
        if (student instanceof  Student)
            ((Student) student).study(book);
    }
}
