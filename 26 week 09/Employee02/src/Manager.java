public class Manager extends Reqular{

    public Manager(String name, Date hireDate, String employeeID, int grade, int step) {
        super(name, hireDate, employeeID, grade, step);
    }

    @Override
    public int baseBonus() {
        return getStep() + STEPBONUS1;
    }

    @Override
    public int managerBonus() {
        return (int)(baseSalary() * (10.0 / 100));
    }

    @Override
    public int salary() {
        return baseSalary() + baseBonus() + managerBonus();
    }

    @Override
    public String toString() {
        return String.format("%s %,7d원 %,7d원 %,7d원 %,8d원 %,9d원 %,7d원 %,9d원",
                super.toString(), baseBonus(), managerBonus(), 0, 0, salary(), tax(), net());
    }
}