//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("당신의 이름은 ? ");
        String name = keyboard.nextLine();

        System.out.print(name + "님의 나이는 ? ");
        int age = Integer.parseInt(keyboard.nextLine());


        System.out.print(name + "님의 성별 (남 = M, 여 = F) : ");
        String genderInput = keyboard.nextLine();
        char gender = genderInput.charAt(0);

        String genderStr = (gender == 'M' || gender == 'm') ? "남자" : "여자";


        System.out.println();
        System.out.println(name + "님의 나이는 " + age + "살 입니다.");
        System.out.println(name + "님의 성별은 " + gender + "(" + genderStr + ") 입니다.");

        keyboard.close();
    }
}
