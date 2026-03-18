
import java.io.FilterOutputStream;

public class ElectricCar extends Car{

    public ElectricCar() {
        super("전기 자동차");
    }

    public void charge() {
        System.out.println(model + "가 충전 합니다.");
    }
}
