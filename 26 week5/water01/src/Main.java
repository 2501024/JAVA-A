
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Customer[] customers = new Customer[] {
            new Customer("홍길동", "1234", '1'),
            new Customer("홍길동", "2234", '2'),
            new Customer("홍길동", "3234", '3'),
            new Customer("홍길동", "1234", '4'),
            new Customer("홍길동", "1234", '5')
    };

    WaterOffice office = new WaterOffice(customers);
    office.inputData();
    office.display();
}
