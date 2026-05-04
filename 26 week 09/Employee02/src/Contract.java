public class Contract extends Employee{


    public Contract(String name, Date hireDate, String employeeID) {
        super(name, hireDate, employeeID);
    }

    @Override
    public int baseSalary() {
        return CONTRACT;
    }


    @Override
    public String toString() {
        return String.format("%s %c급(%s) %c호봉 %2d %,6d원 %,9d원 %,7d원 %,7d원 %,7d원 %,8d원 %,9d원 %,7d원 %,9d원",
                super.toString(), 'X', "계약", 'X', 0, 0, baseSalary(), baseBonus(),
                managerBonus(), 0, 0, salary(), tax(), net());

    }
}