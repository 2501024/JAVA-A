
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

    abstract int calculateFee(Customer customer);

    protected int tax(Customer customer) {
        int total = NETWORK + calculateFee(customer);
        int tax = 0;
        if (customer.getBirthDay().getAge() <= 19)
            tax = 0;
        else
            tax = (int) (total * (6.5 / 100));
        return tax;
    }
}
