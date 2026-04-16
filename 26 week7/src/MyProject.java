import java.io.IOException;

public interface MyProject {
    float A = 90.0f;
    float B = 80.0f;
    float C = 70.0f;
    float D = 60.0f;

    default boolean isValid(int score) {
        return score >= 0 && score <= 100;
    }

    default boolean isValid1(int score) {
        return score >= 0 && score <= 20;
    }

    default void error(String message) throws IOException {
        System.err.printf("ERROR : %s", message);
        System.in.read();
    }
}