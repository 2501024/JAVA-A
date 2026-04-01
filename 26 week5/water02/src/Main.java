
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Type[] types = new Type[] {
            new Type("", 0, 0.0f),
            new Type("가정용", 40, 5.0f),
            new Type("영업용", 55, 3.5f),
            new Type("공장용", 78, 2.5f),
            new Type("관공서", 35, 1.5f),
            new Type("군기관", 20, 0.0f),
    };

    Customer[] customers = new Customer[] {
            new Customer("홍길동", "1234", types[1]),
            new Customer("홍길동", "2234", types[2]),
            new Customer("홍길동", "3234", types[3]),
            new Customer("홍길동", "1234", types[4]),
            new Customer("홍길동", "1234", types[5])
    };

    WaterOffice office = new WaterOffice(customers);
    office.inputData();
    office.display();
}
