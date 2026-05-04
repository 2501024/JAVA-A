public class Person {
    private String name;
    private Date hireDate;

    public Person(String name, Date hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%3s%s", name, hireDate);

    }
}