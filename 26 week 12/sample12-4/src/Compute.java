public class Compute {
    public static float avg(int[] data) {
        int sum = 0;
        float avg;

        for (int i = 0; i < data.length; i++){
            sum += data[i];
        }

        avg = (float) sum / data.length;

        return avg;
    }
}