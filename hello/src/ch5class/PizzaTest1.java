package ch5class;

class Pizza1 {
	int radius;

	Pizza1(int r) {
		radius = r;
	}

	Pizza1 whosLargest(Pizza1 p) { // 형태가 어색할 수 있는데 whosLargest는 매서드이고 앞에 Pizza1이 붙은것은 반환하는 값이 Pizza1의 객체를 반환하기 때문
		if (this.radius > p.radius) {
			return this;
		} else
			return p;
	}
}

public class PizzaTest1 {

	public static void main(String[] args) {

		Pizza1 obj1 = new Pizza1(14);
		Pizza1 obj2 = new Pizza1(18);

		Pizza1 large = obj2.whosLargest(obj1); // this는 obj1 주소를 의미(. 앞에 것이 this에 해당)
		System.out.println(large.radius + "인치 피자가 더 큼."); // large -> obj2 가르킴
	}

}
