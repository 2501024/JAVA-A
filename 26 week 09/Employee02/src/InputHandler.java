import java.io.IOException;
import java.util.Scanner;

public class InputHandler implements Symbol{
    private Scanner keyboard;

    public InputHandler() {
        this.keyboard = new Scanner(System.in);
    }

    protected void inputData(Employee[] employees) throws IOException {
        for (int i = 0; i < employees.length; i++){
            if (employees[i] instanceof Temporary) {
                inputWorkDay((Temporary) employees[i]);
                inputDailyPay((Temporary) employees[i]);
                System.out.println();
            } else if (employees[i] instanceof Executive) {
                inputPerformance((Executive)  employees[i]);
                inputStockOption((Executive) employees[i]);
                System.out.println();
            }
        }
    }

    private void inputWorkDay(Temporary temporary) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 작업 일수 입력 : ", "일용직", temporary.getName());
            temporary.setWorkDay(keyboard.nextInt());
            if (isValid1(temporary.getWorkDay()))
                break;
            else
                error("작업 일수 오류 (0 ~ 31)");
        }
    }

    private void inputDailyPay(Temporary temporary) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 일당 입력 : ", "일용직", temporary.getName());
            temporary.setDailyPay(keyboard.nextInt());
            if (isValid(temporary.getDailyPay()))
                break;
            else
                error("일당 오류 (25,000 ~ 95,000)");
        }
    }



    private void inputPerformance(Executive executive) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 성과 수당 입력 : ", "임원", executive.getName());
            executive.setPerformance(keyboard.nextInt());
            if (isValid2(executive.getPerformance()))
                break;
            else
                error("성과 수당 오류 (0 ~ 700,000)");
        }
    }

    private void inputStockOption(Executive executive) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 스탁옵션 입력 : ", "임원", executive.getName());
            executive.setStockOption(keyboard.nextInt());
            if (isValid3(executive.getStockOption()))
                break;
            else
                error("스탁옵션 오류 (0 ~ 1,000,000)");
        }
    }


}