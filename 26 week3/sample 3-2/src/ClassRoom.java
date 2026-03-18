public class ClassRoom {
    private Teacher teacher;
    private Student student;

    public ClassRoom(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
    }

    public void startClass(Book book) {
        teacher.teach();
        student.study(book);
    }
}