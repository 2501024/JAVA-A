
public class Apple {
    private int price;
    private int inventory;

    public Apple(int price, int inventory) {
        this.price = price;
        this.inventory = inventory;
    }

    public int getPrice() {
        return price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return String.format(" 폼목 이름 : %s, 가격 : %,d원, 재고량 : %,d 개"
                , "사과", price, inventory);

    }
}
