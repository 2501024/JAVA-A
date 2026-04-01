
public class School extends Customer{
    public School(String name, String waterNo) {
        super(name, waterNo);
        type = new Type("학교용", 10, 1.5f, "교육기관");
    }
}
