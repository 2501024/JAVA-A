
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {}

    @Override
    public String toString() {
        return String.format("%3s", name);
    }
}
