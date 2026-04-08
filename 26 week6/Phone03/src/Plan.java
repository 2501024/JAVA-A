
public interface Plan {
    int NETWORK = 3200;
    int BASIC = 1000;
    double TAXRATE = 6.5;
    int UNIT = 2;
    int[] FEE = {10, 5};   // {기본 요금, 할인여금 }

    String getName();
    int calculateFee(Customer customer);

    default boolean isOld(int age) {
        if (age >= 80)
            return true;
        return false;
    }

    default boolean isYoung(int age) {
        if (age <= 19)
            return true;
        return false;
    }

    default int tax(Customer customer) {
        int total = NETWORK + calculateFee(customer);
        int tax = 0;
        if (isYoung(customer.getBirthDay().getAge()))
            tax = 0;
        else
            tax = (int) (total * (TAXRATE / 100));
        return tax;
    }
}
