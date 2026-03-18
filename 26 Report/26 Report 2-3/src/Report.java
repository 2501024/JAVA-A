class Date {
    int year;
    int month;
    int day;

    // 생성자
    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 날짜 출력
    public String toString() {
        return year + "년 " + month + "월 " + day + "일";
    }
}

public class Report {
    public static void main(String[] args) {

        // 본인 생년월일
        Date birth = new Date(2003, 5, 10);
        System.out.println("생년월일: " + birth);

        // 오늘 날짜
        Date today = new Date(2025, 3, 10);
        System.out.println("오늘 날짜: " + today);

        // 오류 날짜 (2025년 2월 29일)
        Date errorDate = new Date(2025, 2, 29);
        System.out.println("지정한 날짜: " + errorDate);

        // 년도 수정
        today.year = 2023;
        System.out.println("수정된 날짜: " + today);
    }
}