
public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public void study(Book book) {
        System.out.printf("학생(%s) : 네~ %s으로 공부할게요!\n",
                super.toString(), book.getTitle());
    }

}
