public class University extends Student {

    public University(String studentID, String name) {
        super(studentID, name);
        parts.add(0, new Part("출석"));
        parts.add(new Part("레포트"));
    }

    @Override
    public float average() {
        return parts.get(0).getScore() + parts.get(1).getScore() * (30 / 100.0f)
                + parts.get(2).getScore() * (30 / 100.0f) + parts.get(3).getScore() * (20 / 100.0f);
    }


    @Override
    public String grade(float score) {
        String grade = "";
        if (score >= A)
            grade = "A";
        else if (score >= B)
            grade = "B";
        else if (score >= C)
            grade = "C";
        else if (score >= D)
            grade = "D";
        else
            grade = " F";
        if (!grade.equals("F")) {
            if (score % 10 - 5 >= 0)
                grade += "+";
            else
                grade += "0";
        }
        return (grade);
    }

    private float grade1(float score, float rate) {
        return score * (rate / 100.0f);
    }


    @Override
    public String partList() {
        String result = "";
        for (int i = 0; i < parts.size(); i++)
            if (i == 0)
                result += String.format("  %3d   ", parts.get(i).getScore());
            else if (i == parts.size() - 1)
                result += String.format(" %3d(%5.2f) ",
                        parts.get(i).getScore(), grade1(parts.get(i).getScore(), 20.0f));
            else
                result += String.format(" %3d(%5.2f) ",
                        parts.get(i).getScore(), grade1(parts.get(i).getScore(), 30.0f));
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %s %6.2f(%s)", super.toString(), partList(), average(), grade(average()));

    }
}