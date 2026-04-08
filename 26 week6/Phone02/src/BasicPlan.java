
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



}
