
public class Seller {
    private Apple apple;
    private int myMoney;

    public Seller(Apple apple, int myMoney) {
        this.apple = apple;
        this.myMoney = myMoney;
    }

    public boolean sale(int count) {
        boolean flag = true;

        if (apple.getInventory() >= count) {
            apple.setInventory(apple.getInventory() - count);
            myMoney += count * apple.getPrice();
        } else {
            System.out.println("ERROR : 사과 재고가 부족 합니다.");
            flag = false;
        }
        return flag;
    }

    @Override
    public String toString() {
        return String.format("%s\n과일 장수 현재 금액 : %,d원\n",
                apple, myMoney);
    }
}
