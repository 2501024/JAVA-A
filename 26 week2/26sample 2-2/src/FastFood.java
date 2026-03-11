public class FastFood {
    int radius;                             // FastFood의반지름Member변수
    String name;                         // FastFood의이름Member 변수
    final double PI = 3.141592;
    public double getArea() {             // MemberMethod
        return PI * radius * radius;
    }
    @Override
    public String toString() {
        return String.format("%s의면적은%.2f ㎠", name, getArea());
    }

}
