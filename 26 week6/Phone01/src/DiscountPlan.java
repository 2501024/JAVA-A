
public class DiscountPlan extends Plan{
    private final int BASIC = 1000;

    public DiscountPlan() {
        super("할인 요금제");
    }

    protected int calculateFee(Customer customer) {
        int callFee = customer.getUsageTime() / 2 +
                (customer.getUsageTime() % 2 == 0 ? 0 : 1) * 5;
        int msgFee = 0;
        if (customer.getBirthDay().getAge() >= 80)
            msgFee = 0;
        else
            msgFee = (customer.getMessage() - 40) * 2;
        return BASIC + callFee + msgFee;
    }

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
