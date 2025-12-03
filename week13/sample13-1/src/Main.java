import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String[] name = {"홍길동", "이순신", "임꺽정", "이대한", "강민성"};  // 5개

        //     int[] score = new int[name.length]; //5 개
        int[][] score = Input.inputData(name);

        Compute.process(score);
        Output.display(name, score);
    }
}