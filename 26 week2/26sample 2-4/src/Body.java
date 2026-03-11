public class Body {

    private double height;   // 키
    private double weight;   // 몸무게
    private int age;         // 나이

    public void setBody(double h, double w, int a) {
        height = h;
        weight = w;
        age = a;
    }

    public void print() {
        System.out.println("김철수는 키가 " + height + "Cm이고, 몸무게는 "
                + weight + "Kg이고, 나이는 " + age + "살 입니다.");
    }
}