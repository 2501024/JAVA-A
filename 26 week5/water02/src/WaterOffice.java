
import java.io.IOException;

public class WaterOffice {
    private Customer[] customers;

    public WaterOffice(Customer[] customers) {
        this.customers = customers;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < customers.length; i++){
            customers[i].inputUsage();
        }
    }

    protected void display() {
        line();
        System.out.println("수도번호 이름 구분   사용량   사용금액  세금    납부액     비고");
        line();
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
        line();
    }

    private void line() {
        for (int i = 0; i < 80; i++)
            System.out.print("*");
        System.out.println();
    }
}
