//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] data = {{1, 3, 6, 9, 12}, {4, 8, 12, 56, 78}};

        Output.display(data);

        Compute.multiple(data);    // 2차원
        Output.display(data);

        for (int i = 0; i < data.length; i++)
            Compute.multiple(data[i]);    // 1차원 배열

        Output.display();
        for (int i = 0; i < data.length; i++)
            Output.display(data[i]);
        Output.display();                        //


        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = Compute.multiple(data[i][j]);   // call by value
            }
        }

        Output.display();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                Output.display(data[i][j]);   // call by value
            }
            System.out.println();
        }
        Output.display();
    }
}