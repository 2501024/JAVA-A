
public class Business extends Customer{
    public Business(String name, String waterNo) {
        super(name, waterNo);
        type = new Type("영업용", 55, 3.5f, "");
    }
}
