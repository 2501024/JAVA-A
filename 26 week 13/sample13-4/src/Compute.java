public class Compute {
    public static void pay(String[] customer, float v, int[] ints) {

        int used = (int) (v + 0.5f);
        if (customer[2].equals("1")) {
            ints[0] = 1200 + (used * 40);
        } else if (customer[2].equals("2")) {
            ints[0] = 1200 + (used * 55);
        } else if (customer[2].equals("3")) {
            ints[0] = 1200 + (used * 78);
        } else if (customer[2].equals("4")) {
            ints[0] = 1200 + (used * 35);
        } else if (customer[2].equals("5")) {
            ints[0] = 1200 + (used * 20);
        } else
            ints[0] = 0;
    }

    public static void tax(String[][] customers, int[][] money) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i][2].equals("1")) {
                money[i][1] = (int) (money[i][0] * (5.0f / 100));
            } else if (customers[i][2].equals("2")) {
                money[i][1] = (int) (money[i][0] * (3.5f / 100));
            } else if (customers[i][2].equals("3")) {
                money[i][1] = (int) (money[i][0] * (2.5f / 100));
            }else if (customers[i][2].equals("4")) {
                money[i][1] = (int) (money[i][0] * (1.5f / 100));
            } else if (customers[i][2].equals("5")) {
                money[i][1] = 0;
            }else {
                money[i][1] = -11;
            }
            money[i][1] /= 10;
            money[i][1] *= 10;
        }
    }

    public static void total(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            ints[ints.length - 1] += ints[i];
        }
        ints[ints.length - 1] += 5;
        ints[ints.length - 1] /= 10;
        ints[ints.length - 1] *= 10;
    }
}