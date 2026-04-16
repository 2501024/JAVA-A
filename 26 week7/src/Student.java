import java.io.IOException;
import java.util.ArrayList;

abstract public class Student extends Person implements MyProject, Project{  // 추상 클래스
    ArrayList<Part> parts;

    public Student(String studentID, String name) {
        super(studentID, name);
        this.parts = new ArrayList<>();
        parts.add(new Part("중간고사"));
        parts.add(new Part("기말고사"));
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < parts.size(); i++) {
            parts.get(i).inputData(super.getName());
        }
    }

    private String partNameList(){
        String result = "";
        for (int i = 0; i < parts.size(); i++)
            result += String.format("  %s  ", parts.get(i).getPartName());
        return result;
    }



}