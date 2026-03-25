class Student {
    String name;      // 이름
    int rollno;       // 학번
    String depart;    // 학과
    int birthYear;    // 출생년도

    // 생성자
    Student(String name, int rollno, String depart, int birthYear) {
        this.name = name;
        this.rollno = rollno;
        this.depart = depart;
        this.birthYear = birthYear;
    }

    // 나이 계산 메서드
    int getAge() {
        int currentYear = 2026; // 현재 연도 (필요시 수정)
        return currentYear - birthYear;
    }
}