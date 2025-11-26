
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        int radius;
        float area;

        radius = Input.readData();    // call by name
        area = Compute.area(radius);   // call by value
        Output.display(radius, area);  // call by value

    }
}
