
public class Navigation {
    private String model;

    public Navigation(String model) {
        this.model = model;
    }

    public void findRoute(String start, String destination) {
        System.out.printf("출발지 : %s, 목적지 : %s의 길을 찾다\n",
                start, destination);
    }
}
