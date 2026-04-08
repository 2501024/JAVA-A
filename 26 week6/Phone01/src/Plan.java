
public abstract class Plan {
    private String name;
    protected final int NETWORK = 3200;

    public Plan() {
    }

    public Plan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
