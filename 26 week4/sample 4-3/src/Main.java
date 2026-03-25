
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

    Employee[] employees = new Employee[] {
            new Employee(new String[]{"홍길동", "1234"},
                    new Date(2003, 3, 25), departments[1], grades[1]),
            new Employee(new String[]{"이나라", "1345"},
                    new Date(2001, 12, 25), departments[3], grades[2]),
            new Employee(new String[]{"나정신", "2234"},
                    new Date(1995, 5, 4), departments[5], grades[5]),
            new Employee(new String[]{"박정환", "3234"},
                    new Date(2005, 4, 18), departments[2], grades[3]),
            new Employee(new String[]{"김대한", "4545"},
                    new Date(2000, 8, 13), departments[4], grades[4]),
            new Employee(new String[]{"이민국", "2234"},
                    new Date(1995, 5, 4), departments[5], grades[4])
    };

    Company company = new Company(employees);
    company.inputData();
    company.display();
}
