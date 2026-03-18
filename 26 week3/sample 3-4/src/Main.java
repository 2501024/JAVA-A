
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Apple apple = new Apple(1000, 20);
    Seller seller = new Seller(apple, 50000);
    Customer customer = new Customer(35000);

    System.out.println(seller);
    customer.buy(seller, apple, 5);
}
