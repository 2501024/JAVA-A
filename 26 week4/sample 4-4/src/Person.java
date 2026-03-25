
public class Person {
    private String name;
    private Date birthDay;

    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%3s%s ", name, birthDay);
    }
}
