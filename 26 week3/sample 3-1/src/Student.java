
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void study(Book book) {
        System.out.printf("학생(%s) : 네~ %s으로 공부할게요!\n",
                name, book.getTitle());
    }

}
