
public class Government extends Customer{
    public Government(String name, String waterNo) {
        super(name, waterNo);
        type = new Type("관공서", 35, 1.5f, "공공기관");
    }
}
