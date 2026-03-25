
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Department[] departments = new Department[] {
            new Department('0', ""),
            new Department('1', "인사팀"),
            new Department('2', "인사팀"),
            new Department('3', "인사팀"),
            new Department('4', "인사팀"),
            new Department('5', "인사팀")};

    Grade[] grades = new Grade[] {
            new Grade('0', 0),
            new Grade('1', 1650000),
            new Grade('2', 1680000),
            new Grade('3', 1700000),
            new Grade('4', 1720000),
            new Grade('5', 1750000)};

    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(new Employee("홍길동", new Date(2003, 3, 25),
            "1234", departments[1], grades[1]));
    employees.add(new Employee("이나라",new Date(2001, 12, 25), "1345",
            departments[3], grades[2]));
    employees.add(new Employee("나정신",new Date(1995, 5, 4), "2234"
            , departments[5], grades[5]));
    employees.add(new Employee("박정환",new Date(2005, 4, 18), "3234"
            , departments[2], grades[3]));
    employees.add(new Employee("김대한", new Date(2000, 8, 13), "4545"
            , departments[4], grades[4]));
    employees.add(new Employee("이민국", new Date(1995, 5, 4), "2234"
            , departments[5], grades[4]));


    Company company = new Company(employees);
    company.inputData();
    company.display();

}
