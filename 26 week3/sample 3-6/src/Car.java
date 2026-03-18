
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving....");
    }

    public void stop() {
        engine.stop();
        System.out.println("Car has stopped.");
    }
}
