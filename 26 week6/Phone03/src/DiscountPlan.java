
public class DiscountPlan implements Plan{
    @Override
    public String getName() {
        return "할인 요금제";
    }

    @Override
    public int calculateFee(Customer customer) {
        int callFee = customer.getUsageTime() / UNIT +
                (customer.getUsageTime() % UNIT == 0 ? 0 : 1) * FEE[1];
        int msgFee = 0;
        if (isOld(customer.getBirthDay().getAge()))
            msgFee = 0;
        else
            msgFee = (customer.getMessage() - 40) * 2;
        return BASIC + callFee + msgFee;
    }


}
