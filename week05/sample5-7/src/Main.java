import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char type = ' ';
        int width = 0;
        int height = 0;
        int area = 0;

        System.out.print("사각형의 가로 길이 입력 : ");
        width = keyboard.nextInt();
        System.out.print("사각형의 세로 길이 입력 : ");
        height = keyboard.nextInt();

        type = width == height ? '정' : '직';
        area = width * height;

        System.out.printf("**** %사각형 넓이 *****\n", type);
        System.out.printf("\t가로길이 : %d Cm\n", width);
        System.out.printf("\t세로길이 : %d Cm\n", height);
        System.out.printf("\t넓   이 : %d \u33a0\n", area);
    }}
