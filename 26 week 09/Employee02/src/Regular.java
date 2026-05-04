public abstract class Regular extends Employee{
    private int grade;
    private int step;

    public Reqular(String name, Date hireDate, String employeeID, int grade, int step) {
        super(name, hireDate, employeeID);
        this.grade = grade;
        this.step = step;
    }

    public int getGrade() {
        return grade;
    }

    public int getStep() {
        return step;
    }

    @Override
    public int baseSalary() {
        return base[grade];

    }

    @Override
    public int baseBonus() {
        return step * STEPBONUS;
    }


    private String gradeName() {
        return gradeName[grade];
    }

    @Override
    public String toString() {
        return String.format("%s %d급(%s) %d호봉 %2d %,6d원 %,9d원",
                super.toString(), grade, gradeName(), step, 0, 0, baseSalary());

    }
}