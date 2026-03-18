class Book {
    String title;
    String author;

    // 생성자
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 책 정보 출력
    public String toString() {
        return "책 제목: " + title + ", 저자: " + author;
    }
}

public class Movie {
    public static void main(String[] args) {

        Book book1 = new Book("해리포터와 죽음의 성물", "J.K. Rowling");
        Book book2 = new Book("어린 왕자", "생텍쥐페리");

        System.out.println(book1);
        System.out.println(book2);
    }
}