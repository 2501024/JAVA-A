public class Main {
    public static void main(String[] args) {

        Person p = new Person("이순신", 27);
        Club c = new Club("테니스 클럽", 5);

        c.join(p);

    }
}