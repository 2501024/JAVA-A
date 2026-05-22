public class Compute {
    public static void total(int[][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length - 1; j++) {
                score[i][score[i].length - 1] += score[i][j];
            }
        }

    }
}