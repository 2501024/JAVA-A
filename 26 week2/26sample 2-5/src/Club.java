public class Club {

    String clubName;
    int clubMember;

    Club(String clubName, int clubMember) {
        this.clubName = clubName;
        this.clubMember = clubMember;
    }

    void join(Person p) {
        System.out.println("나이가 " + p.age + "살, 이름이 '" + p.name +
                "' 이라는 남자가 있다.");
        System.out.println("이 남자는 " + clubName + "에 참여 하였고, 클럽 인원은 "
                + clubMember + "명 이다.");
    }
}