class Movie {
    String title;
    String director;
    int open;
    String mainActor;
    double rankPoint;

    // 생성자
    Movie(String title, String director, int open, String mainActor, double rankPoint) {
        this.title = title;
        this.director = director;
        this.open = open;
        this.mainActor = mainActor;
        this.rankPoint = rankPoint;
    }
}

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("헤라클레스", "레니 할린", 2014, "켈란 루츠", 6.9);
        Movie movie2 = new Movie("노아", "대런 아로노프스키", 2004, "러셀 크로우", 7.3);

        // movie2 평점 변경
        movie2.rankPoint = 8.2;

        // movie1 출력
        System.out.println("제목: " + movie1.title);
        System.out.println("감독: " + movie1.director);
        System.out.println("개봉: " + movie1.open);
        System.out.println("주연: " + movie1.mainActor);
        System.out.println("평점: " + movie1.rankPoint);

        System.out.println();

        // movie2 출력
        System.out.println("제목: " + movie2.title);
        System.out.println("감독: " + movie2.director);
        System.out.println("개봉: " + movie2.open);
        System.out.println("주연: " + movie2.mainActor);
        System.out.println("평점: " + movie2.rankPoint);

        System.out.println();

        // movie1 감독 이름만 출력
        System.out.println("movie1 감독: " + movie1.director);
    }
}