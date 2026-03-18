
public class Car {

    public void drive(Navigation navigation, String start, String destination) {
        System.out.println("운전 시작");
        navigation.findRoute(start, destination);
        System.out.println("Driving to " + destination);
    }
}
