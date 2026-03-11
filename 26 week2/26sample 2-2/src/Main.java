public static void main(String[] args) {
    FastFood pizza;
    pizza = new FastFood();
    pizza.radius = 10;
    pizza.name = "자바피자";
    System.out.println(pizza);


    FastFood donut = new FastFood();
    donut.radius = 2;


    donut.name = "자바도넛";
    System.out.println(donut);
}