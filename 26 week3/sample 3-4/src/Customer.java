
public class Customer {
    private int myMoney;
    private Apple apple;

    public Customer(int myMoney) {
        this.myMoney = myMoney;
    }

    public void buy(Seller seller, Apple apple, int quantity) {
        int totalPrice = apple.getPrice() * quantity;

        if (totalPrice <= myMoney) {
            if (seller.sale(quantity)) {
                if (this.apple == null) {
                    this.apple = new Apple(apple.getPrice(), quantity);
                } else {
                    this.apple.setInventory(quantity + this.apple.getInventory());
                }
                myMoney -= totalPrice;
                System.out.println(this);
                System.out.println(seller);
            } else {
                System.out.println("판매자 재고 부족");
            }
        } else {
            System.out.println("예산이 부족합니다");
        }
    }

    @Override
    public String toString() {
        String result = "";
        result += String.format("고객 현재 잔액 : %,d원\n", myMoney);
        if (apple != null) {
            result += apple.toString();
        }
        return result;
    }
}
