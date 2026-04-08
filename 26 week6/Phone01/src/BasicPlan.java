public class BasicPlan extends Plan{

    public BasicPlan() {
        super("기본 요금제");
    }

    protected int calculateFee(Customer customer) {
        int callFee = customer.getUsageTime() / 2 +
                (customer.getUsageTime() % 2 == 0 ? 0 : 1) * 10;
        int msgFee = (customer.getMessage() - 20) * 2;
        return callFee + msgFee;
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