
public class BasicPlan implements Plan{

    @Override
    public String getName() {
        return "기본 요금제";
    }

    @Override
    public int calculateFee(Customer customer) {
        int callFee = customer.getUsageTime() / UNIT +
                (customer.getUsageTime() % UNIT == 0 ? 0 : 1) * FEE[0];

        int msgFee = (customer.getMessage() - 20) * 2;
        return callFee + msgFee;
    }
}
