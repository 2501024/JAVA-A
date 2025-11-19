
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] products = {"텔레비", "냉장고"};
        int[][][] sales = new int[products.length][][];
        sales[0] = new int[][] {{2018, 9, 7, 4, 3, 2}, {2019, 5, 6, 7, 8, 7}, {2020, 13, 21, 7, 8, 9}};
        sales[1] = new int[][] {{2018, 8, 9, 6, 7, 8}, {2019, 5, 6, 7, 8, 7}, {2020, 13, 21, 7, 8, 9}};


        System.out.println("*************************************************************");
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%4s %4d년 %4d %4d %4d %4d %4d\n", products[i],
                        sales[i][j][0], sales[i][j][1], sales[i][j][2], sales[i][j][3], sales[i][j][4], sales[i][j][5]);
            }
        }
        System.out.println("*************************************************************");
    }
}
