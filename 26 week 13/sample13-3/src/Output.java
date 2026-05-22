public class Output {
    public static void display(int[][] data) {
        display();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%3d ", data[i][j]);
            }
            System.out.println();
        }
        display();
    }

    public static void display(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%3d ", data[i]);
        }
        System.out.println();
    }

    public static void display(int data) {
        System.out.printf("%3d ", data);
    }

    public static void display() {
        System.out.println("**********************");
    }
}