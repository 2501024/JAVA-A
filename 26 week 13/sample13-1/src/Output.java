public class Output {
    public static void display(String[] students, int[][] score) {
        display();
        System.out.println(" 이름 국어  영어  수학 총점 ");
        display();
        for (int i= 0; i < students.length; i++) {
            System.out.printf(" %3s %3d %3d %3d %3d\n", students[i],
                    score[i][0], score[i][1], score[i][2], score[i][3]);
        }
        display();
    }

    private static void display() {
        System.out.println("*********************************");
    }
}