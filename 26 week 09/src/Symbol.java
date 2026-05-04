import java.io.IOException;

public interface Symbol {
    int TAX1 = 2000000;
    int TAX2 = 4000000;
    int TAX3 = 6000000;

    double TAXRATE1 = 4.5;
    double TAXRATE2 = 8.4;
    double TAXRATE3 = 10.6;
    double TAXRATE4 = 12.3;

    int CONTRACT = 2000000;

    int STEPBONUS = 100000;
    int STEPBONUS1 = 150000;

    int[] base = new int[] {0, 6000000, 5000000, 4589000, 3689000, 3235000, 2589000, 2123000};
    String[] gradeName = new String[] {"", "상무", "이사", "부장", "차장", "과장", "대리", "사원"};

    default boolean isValid(int data) {
        return data >= 25000 && data <= 95000;
    }

    default boolean isValid1(int data) {
        return data >= 0 && data <= 31;
    }

    default boolean isValid2(int data) {
        return data >= 0 && data <= 700000;
    }
    default boolean isValid3(int data) {
        return data >= 0 && data <= 1000000;
    }

    default void error(String message) throws IOException {
        System.err.println("ERROR : " + message);
        System.in.read();
    }
}