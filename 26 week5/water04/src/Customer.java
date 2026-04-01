
import java.io.IOException;
import java.util.Scanner;

public class Customer extends Person{
    private String waterNo;
    protected Type type;
    private float usage;
    private final int BASIC;

    public Customer(String name, String waterNo) {
        super(name);
        this.waterNo = waterNo;
        this.usage = 0.0f;
        this.BASIC = 1200;
    }

    public String getWaterNo() {
        return waterNo;
    }

    public void setWaterNo(String waterNo) {
        this.waterNo = waterNo;
    }

    public float getUsage() {
        return usage;
    }

    public void setUsage(float usage) {
        this.usage = usage;
    }

    public int getBASIC() {
        return BASIC;
    }

    protected void inputUsage() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("[%s] %s님의 수도 사용량 입력 : ",
                    type.getTypeName(), super.getName());
            usage = keyboard.nextFloat();
            if (usage >= 0.0f && usage <= 999.9f)
                break;
            else {
                System.err.print("ERROR : 사용량 오류");
                System.in.read();
            }
        }
    }

    protected int fee() {
        int fee = ((int) (usage + 0.5f)) * type.getUnitPrice();

        return fee;
    }

    private int tax() {
        int tax = (int) ((BASIC + fee()) * (type.getTaxRate() / 100));
        return tax;
    }

    private int pay() {
        return BASIC + fee() + tax();
    }

    @Override
    public String toString() {
        return String.format("%4s %s %3s %6.1f  %,8d원  %,6d원  %,8d원 %s",
                waterNo, super.toString(), type.getTypeName(), usage,
                fee(), tax(), pay(), type.getMessage());
    }
}
