public class Compute {
    public static void multiple(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] *= 2;
            }
        }
    }

    public static void multiple(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
    }

    public static int multiple(int data) {
        return data * 2;
    }
}