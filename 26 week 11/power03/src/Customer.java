abstract public class Customer extends Person implements Constants{
    private String customID;
    private int powerUsage;

    public Customer() {
        super();
    }

    public Customer(String name, String customID, int powerUsage) {
        super(name);
        this.customID = customID;
        this.powerUsage = powerUsage;
    }

    public void setCustomID(String customID) {
        this.customID = customID;
    }

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    protected int fee() {
        int temp = powerUsage;
        float fee = basic;
        for (int i = 0; i < table.length; i++) {
            int usage = Math.min(temp, limits[i]);
            fee += usage * table[i];
            temp -= usage;
            if (temp <= 0)
                break;
        }
        return (int) fee;
    }

    private int tax() {
        return (int) (fee() * rate);
    }

    protected int charge() {
        return fee() + tax();
    }

    @Override
    public String toString() {
        return String.format("%6s %3s %,5d Kw %,9d원 %,7d원 %,9d원",
                customID, getName(), powerUsage, fee(), tax(), charge());
    }
}