



public class Main {
    public static void main(String[] args) {
        int first, second;
        int result;

        Output.display();                              // call by name
        first = Input.readData("첫번째 데이터 입력 : ");  // call by value
        second = Input.readData("두번째 데이터 입력 : ");
        result = Compute.add(first, second);
        Output.display(first, second, result);
        Output.display();
    }
}
