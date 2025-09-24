import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height, weight; // Data
        float feet, pound;   // 정보
        final float FEETUNIT = 30.48f;
        final float POUNDUNIT = 0.453592f;


        System.out.print("당신의 키 입력(Cm) : ");
        height = keyboard.nextFloat();
        System.out.print("당신의 몸무게 입력(Kg) : ");
        weight = keyboard.nextFloat();


        feet = height / FEETUNIT;
        pound = weight / POUNDUNIT;

        System.out.printf("당신의 키(%.2f Cm)는 %.3f 피트(feet) 입니다.\n", height, feet);
        System.out.printf("당신의 몸무게(%.2f Kg)는 %.3f 파운드(pound)입니다.\n", weight, pound);

    }
}