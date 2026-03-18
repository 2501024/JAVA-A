public class Car {
    protected String model;

    public Car(String model) {
        this.model = model;
    }

    public void drive() {
        System.out.println(model + "가 달립니다.");
    }

    public void stop() {
        System.out.println(model + "가 멈춤니다.");
    }
}