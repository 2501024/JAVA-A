public class Main {
    public static void main(String[] args) {


        String apple = "부사";
        int count = 4;
        String name = "홍길동";
        double height = 170.5;


        System.out.printf("사과의 종류는 %s이고, 개수는 %d개 입니다.\n", apple, count);
        System.out.printf("%s의 키는 %5.1f %c 입니다.\n", name, height, '\u339d');
    }
}