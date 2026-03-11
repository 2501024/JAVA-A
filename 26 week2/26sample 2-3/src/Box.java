public class Box {

    // Attribute (속성)
    private int width;   // 가로
    private int height;  // 세로
    private int depth;   // 높이
    private String color; // 색상
    private String text;  // 문구

    // 생성자
    public Box(int width, int height, int depth, String color, String text) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.text = text;
    }

    // Behavior (행동) : 부피 계산
    public int volume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return String.format(
                ">>>> BOX <<<<\n" +
                        "width = %d Cm\n" +
                        "height = %d Cm\n" +
                        "depth = %d Cm\n" +
                        "color = %s\n" +
                        "text = %s\n" +
                        "부피 = %,d",
                width, height, depth, color, text, volume()
        );
    }
}