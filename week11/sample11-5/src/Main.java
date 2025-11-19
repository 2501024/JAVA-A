
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String[][] employees = {{"홍길동", "1111"}, {"강민성", "1411"}, {"아이돌", "1167"},
                {"이동화", "1677"}, {"이동준", "1555"}, {"정설실", "1777"},
                {"고길동", "1441"}, {"저동항", "1737"}, {"박근태", "1772"},
                {"소민자", "3333"}};
        char[] hobong = new char[] {'1', '2','3', '5', '4', '3', '3', '1', '4', '2'};
        int[][] salarys = new int[employees.length][5]; // {기본급, 수당, 급여액, 세금, 지급액}

        int i = 0;
        while (i < employees.length) {
            System.out.printf("%s 사원의 업무수당 입력 : ", employees[i][0]);
            salarys[i][1] = keyboard.nextInt();

            if (salarys[i][1] >= 0 && salarys[i][1] <= 1000000)
                i++;
            else {
                System.err.println("ERROR : 0 ~ 1,000,000");
                System.in.read();
            }
        }

        for (i = 0; i < employees.length; i++) {
            switch (hobong[i]) {
                case '1' :
                    salarys[i][0] = 1650000;
                    break;
                case '2' :
                    salarys[i][0] = 1680000;
                    break;
                case '3' :
                    salarys[i][0] = 1700000;
                    break;
                case '4' :
                    salarys[i][0] = 1720000;
                    break;
                case '5' :
                    salarys[i][0] = 1750000;
                    break;
                default:
                    salarys[i][0] = 0;
            }
        }

        for (i = 0; i < employees.length; i++) {
            salarys[i][2] = salarys[i][0] + salarys[i][1];
        }

        for (i = 0; i < employees.length; i++) {
            if (salarys[i][2] >= 2600000) {
                salarys[i][3] = (int) (salarys[i][2] * (10.0f / 100));
            } else if (salarys[i][2] >= 2000000) {
                salarys[i][3] = (int) (salarys[i][2] * (8.0f / 100));
            } else {
                salarys[i][3] = (int) (salarys[i][2] * (5.0f / 100));
            }
            salarys[i][3] /= 100;
            salarys[i][3] *= 100;
        }

        for (i = 0; i < employees.length; i++) {
            salarys[i][4] = salarys[i][2] - salarys[i][3];
        }

        for (i = 0; i < employees.length - 1; i++) {
            // 마지막 i개는 이미 정렬되어 있음
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if ( salarys[j][4] >  salarys[j + 1][4]) {
                    // swap
                    String[]  temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;

                    char temp1 = hobong[j];
                    hobong[j] = hobong[j + 1];
                    hobong[j + 1] = temp1;

                    int[] salary = salarys[j];
                    salarys[j] = salarys[j + 1];
                    salarys[j + 1] = salary;
                }
            }
        }





        System.out.println("**********************************************************");
        System.out.println(" 사번  이름  호봉   기본급  업무수당   금여액  세금   지금액 ");
        System.out.println("**********************************************************");
        for (i = 0; i < employees.length; i++) {
            System.out.printf("%5s %3s %c %,9d %,9d %,9d %,8d %,9d\n",
                    employees[i][1], employees[i][0], hobong[i],
                    salarys[i][0], salarys[i][1], salarys[i][2], salarys[i][3], salarys[i][4]);
        }
        System.out.println("**********************************************************");
    }
}
