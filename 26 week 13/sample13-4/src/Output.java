public class Output {
    public static void display(String[][] customers, float[] used, int[][] money) {
        display();
        System.out.println(" 번호 이름 코드 형태  사용량  사용금액  세금   징수금액    기타");
        display();
        for (int i = 0; i < customers.length; i++) {
            if (customers[i][2].equals("5"))
                System.out.printf(" %4s %3s %1s %3s %5.1f 리터 %,7d원 %,6d 원 %,7d 원   일괄 징수\n",
                        customers[i][0], customers[i][1], customers[i][2], customers[i][3],
                        used[i], money[i][0], money[i][1], money[i][2]);
            else
                System.out.printf(" %4s %3s %1s %3s %5.1f 리터 %,7d원 %,6d 원 %,7d 원 \n",
                        customers[i][0], customers[i][1], customers[i][2], customers[i][3],
                        used[i], money[i][0], money[i][1], money[i][2]);
        }
        display();
    }

    private static void display() {
        System.out.println("**************************************");
    }
}