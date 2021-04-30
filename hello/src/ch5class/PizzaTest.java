package ch5class;

class Pizza {
	String toppings;
	static int count = 0;

	public Pizza(String toppings) {
		this.toppings = toppings;
		count++;
	}
}

public class PizzaTest {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");

		int n = Pizza.count;
		System.out.println("피자1 토핑 : " + p1.toppings);
		System.out.println("피자2 토핑 : " + p2.toppings);
		System.out.println("피자3 토핑 : " + p3.toppings);
		System.out.println("지금까지 판매된 피자 개수 = " + n);
	}

}
