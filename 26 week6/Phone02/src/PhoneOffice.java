
import java.io.IOException;

public class PhoneOffice {
    private Customer[] customers;

    public PhoneOffice(Customer[] customers) {
        this.customers = customers;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < customers.length; i++) {
            customers[i].inputUsageTime();
            customers[i].inputMessage();
        }
    }

    protected void display() {
        line();
        System.out.println("dsfsdfsdfsdf");
        line();
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i]);
        line();
    }

    private void line() {
        for (int i = 0; i < 100; i++)
            System.out.print("*");
        System.out.println();
    }
}
