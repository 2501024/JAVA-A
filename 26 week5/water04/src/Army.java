
public class Army extends Customer{
    public Army(String name, String waterNo) {
        super(name, waterNo);
        type = new Type("군기관", 20, 0.0f, "일괄 징수");
    }
}
