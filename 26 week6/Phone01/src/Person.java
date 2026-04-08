
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

    public Date getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return String.format("%3s%s %3d세", name, birthDay.toString(), birthDay.getAge());
    }
}
