//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Employee[] employees = new Employee[]{
            new Contract("이대한", new Date(1990, 3, 24), "5678"),
            new Temporary("경복대", new Date(2000, 3, 24), "2004"),
            new Staff("홍길동", new Date(1990, 1, 1), "1001", 7, 3),
            new Manager("김철수", new Date(1985, 5, 5), "2001", 3, 5),
            new Executive("이영희", new Date(1975, 7, 7), "3001", 1),
            new Contract("정영진", new Date(1978, 12, 20), "5588"),
            new Temporary("류동규", new Date(2000, 10, 14), "4562"),
            new Staff("박동철", new Date(1994, 8, 20), "1401", 5, 5),
            new Manager("진성철",  new Date(1996, 11, 5),"2041", 4, 4),
            new Executive("신동진",  new Date(1977, 10, 7),"3401", 2)
    };

    InputHandler inputHandler = new InputHandler();
    inputHandler.inputData(employees);

    Company company = new Company(employees);
    company.sortByNet();

    OutputHandler outputHandler = new OutputHandler();
    outputHandler.display(employees);


}