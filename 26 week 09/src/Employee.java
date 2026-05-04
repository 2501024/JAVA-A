public abstract class Employee extends Person implements MyProject {
    private String employeeID;

    public Employee(String name, Date hireDate, String employeeID) {
        super(name, hireDate);
        this.employeeID = employeeID;
    }

    protected  int tax() {  // 세금
        int money = salary();
        int tax;
        if (money < TAX1)
            tax = (int) (money * (TAXRATE1 / 100));
        else if (money < TAX2)
            tax = (int) (money * (TAXRATE2 / 100));
        else if (money < TAX3)
            tax = (int) (money * (TAXRATE3 / 100));
        else
            tax = (int) (money * (TAXRATE4 / 100));
        return tax;
    }
    @Override
    public int baseBonus() {
        return 0;
    }

    @Override
    public int salary() {
        return baseSalary();
    }

    @Override
    public int managerBonus() {
        return 0;
    }

    protected int net() { // 지금액
        return  salary() - tax();
    }

    @Override
    public String toString() {
        return String.format("%4s %s", employeeID, super.toString());
    }
}