public class Output {
    public static void display(String[][] students, int[] height, float[][] weight) {
        display();
        System.out.println(" 이름  성별 키  체중   표준체중   BMI    판정 ");
        display();
        for (int i = 0; i < students.length; i++) {
            System.out.printf(" %3s %1s %3d Cm %5.1f Kg %5.1f Kg %5.1f %s\n",
                    students[i][0], students[i][1], height[i],
                    weight[i][0], weight[i][1], weight[i][2], students[i][2]);
        }
        display();
    }

    private static void display() {
        System.out.println("*********************************************");
    }
}