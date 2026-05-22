public class Compute {
    public static void total(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length - 3; j++) {
                ints[i][ints[i].length - 3] += ints[i][j];
            }
        }
    }

    public static void sort(String[][] students, int[][] score) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (score[i][score[i].length - 3] < (score[j][score[j].length - 3])) {
                    String[] student = students[i];
                    students[i] = students[j];
                    students[j] = student;
                    int[] temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
    }

    public static void ranking(int[][][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++)
                score[i][j][score[i][j].length - 2] = j + 1;
        }
        tieRanking(score);
    }

    private static void tieRanking(int[][][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length - 1; j++) {
                for (int k = j + 1; k < score[i].length; k++)
                    if (score[i][j][score[i][j].length - 3] == score[i][k][score[i][j].length - 3])
                        score[i][k][score[i][j].length - 2] = score[i][j][score[i][j].length - 2];
            }
        }
    }

    public static void gradeRanking(int[][][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j][score[i][j].length - 1] = 1;
                for (int k = 0; k < score.length; k++) {
                    for (int l = 0; l < score[k].length; l++) {
                        if (score[i][j][score[i][j].length - 3] <
                                score[k][l][score[k][l].length - 3]) {
                            score[i][j][score[i][j].length - 1]++;
                        }
                    }
                }
            }
        }
    }

    public static void average(int[][][] score, float[][] avg) {
        for (int i = 0; i < score.length; i++) {
            avg[i] = new float[score[i].length];
            for (int j = 0; j < score[i].length; j++) {
                avg[i][j] = score[i][j][score[i][j].length - 3] / 4.0f;
            }
        }
    }

    public static float average(float[] avg) {
        float total = 0.0f;

        for (int i = 0; i < avg.length; i++) {
            total += avg[i];
        }
        return total / avg.length;
    }

    public static float gradeAvg(float[][] avg) {
        float temp = 0.0f;
        int count = 0;
        for (int i = 0; i < avg.length; i++) {
            for (int j = 0; j < avg[i].length; j++) {
                count++;
                temp += avg[i][j];
            }
        }
        return temp / count;
    }
}