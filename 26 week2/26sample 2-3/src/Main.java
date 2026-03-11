public class Main {
    public static void main(String[] args) {

        // Box 객체 생성
        Box box1 = new Box(10, 20, 30, "Brown", "Fragile");

        // 객체 정보 출력
        System.out.println(box1);

        // 부피만 출력
        System.out.println("Box Volume = " + box1.volume());
    }
}