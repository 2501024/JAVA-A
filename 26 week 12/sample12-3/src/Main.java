import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        int radius;
        float area;

        radius = Input.redata();

        area = Compute.area(radius);

        Output.display(radius, area);
    }
}