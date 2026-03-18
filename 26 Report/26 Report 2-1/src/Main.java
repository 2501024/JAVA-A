class TV {
    String company = "Samsung";
    int year = 2017;
    int inch = 55;
    String type = "LED TV";
}

public class Main {
    public static void main(String[] args) {

        TV tv = new TV();

        System.out.println("우리집 TV는 " + tv.company + "에서 만든 "
                + tv.year + "년형 " + tv.inch + "인치 "
                + tv.type + " 입니다.");
    }
}