
import java.io.IOException;
import java.util.Scanner;

public class Customer {
    private String name;
    private String waterNo;
    private char type;
    private float usage;
    private final int BASIC;

    public Customer(String name, String waterNo, char type) {
        this.name = name;
        this.waterNo = waterNo;
        this.type = type;
        this.usage = 0.0f;
        this.BASIC = 1200;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWaterNo() {
        return waterNo;
    }

    public void setWaterNo(String waterNo) {
        this.waterNo = waterNo;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
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
            System.out.printf("[%s] %s님의 수도 사용량 입력 : ", getTypeName(), name);
            usage = keyboard.nextFloat();
            if (usage >= 0.0f && usage <= 999.9f)
                break;
            else {
                System.err.print("ERROR : 사용량 오류");
                System.in.read();
            }
        }
    }

    private String getTypeName() {
        String typeName = "";
        switch (type) {
            case '1':
                typeName = "가정용";
                break;
            case '2':
                typeName = "영업용";
                break;
            case '3':
                typeName = "공장용";
                break;
            case '4':
                typeName = "관공서";
                break;
            case '5':
                typeName = "군기관";
                break;
        }
        return typeName;
    }

    private int fee() {
        int fee = 0;
        switch (type) {
            case '1':
                fee = ((int) (usage + 0.5f)) * 40;
                break;
            case '2':
                fee = ((int) (usage + 0.5f)) * 55;
                break;
            case '3':
                fee = ((int) (usage + 0.5f)) * 78;
                break;
            case '4':
                fee = ((int) (usage + 0.5f)) * 35;
                break;
            case '5':
                fee = ((int) (usage + 0.5f)) * 20;
                break;
        }
        return fee;
    }

    private int tax() {
        int tax = 0;
        switch (type) {
            case '1':
                tax = (int) ((BASIC + fee()) * (5.0f / 100));
                break;
            case '2':
                tax = (int) ((BASIC + fee()) * (3.5f / 100));
                break;
            case '3':
                tax = (int) ((BASIC + fee()) * (2.5f / 100));
                break;
            case '4':
                tax = (int) ((BASIC + fee()) * (1.5f / 100));
                break;
            case '5':
                tax = 0;
                break;
        }
        return tax;
    }

    private int pay() {
        return BASIC + fee() + tax();
    }

    @Override
    public String toString() {
        return String.format("%4s %3s %3s %6.1f  %,8d원  %,6d원  %,8d원 %s",
                waterNo, name, getTypeName(), usage,
                fee(), tax(), pay(), type == '5' ? "일괄 징수" : "");
    }
}
