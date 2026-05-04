import java.time.LocalDate;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);
        return today.getYear() - birthDate.getYear() -
                (today.getDayOfYear() < birthDate.getDayOfYear() ? 1 : 0);
    }

    @Override
    public String toString() {
        return String.format("(%4d년 %2d월 %2d일)", year, month, day);
    }
}