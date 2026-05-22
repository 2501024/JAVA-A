import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String[][] students = new String[][]{{"홍길동", "남", ""}, {"강민성", "남", ""},
                {"김소민", "여", ""}, {"박건준", "남", ""}, {"김시온", "여", ""}, {"박신혁", "남", ""},
                {"이예린", "여", ""}, {"니카타", "남", ""}, {"밀리나", "여", ""}, {"바토르", "남", ""}};
        int[] height = new int[students.length];
        float[][] weight = new float[students.length][3];   // {"체중", "표준체중", "bmi"}

        Input.readData(students, height);
        System.out.println();
        Input.readData(students, weight);

        Compute.standard(students, height, weight);
        Compute.bmi(weight);
        Compute.check(students, weight);

        Output.display(students, height, weight);
    }
}