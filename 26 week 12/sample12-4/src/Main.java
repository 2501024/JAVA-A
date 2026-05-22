//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] data = new int[10];
        float avg;

        Input.readData(data);   // call by reference

        avg = Compute.avg(data);   // call by reference

        Output.display(data, avg);   // 혼합 방법

    }
}