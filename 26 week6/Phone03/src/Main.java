
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Customer[] customers = new Customer[]{
            new Customer("홍길동", new Date(1999, 4, 8),
                    "123-4567-8978", new DiscountPlan()),
            new Customer("박길동", new Date(2016, 4, 8),
                    "123-4567-8978", new DiscountPlan()),
            new Customer("이노인", new Date(1940, 4, 8),
                    "123-4567-8978", new BasicPlan()),
            new Customer("박길동", new Date(2016, 4, 8),
                    "123-4567-8978", new DiscountPlan())};
    PhoneOffice office = new PhoneOffice(customers);
    office.inputData();
    office.display();


}
