package ch7class;

class Circle {
	int x, y;
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Circle(r=" + radius + ")";
	}

	public boolean equals(Circle c) {
		if (radius == c.radius) {
			return true;
		} else
			return false;
	}
}

public class CircleTest {

	public static void main(String[] args) {

		Circle obj1 = new Circle(10);
		Circle obj2 = new Circle(20);

		System.out.println(obj1.toString()); // //toString 메소드 오버라이딩하면 내부적으로 toString메소드가 String 객체를 리턴, 안했으면 그냥 객체의 정보
												// 출력
		System.out.println(obj2);

		if (obj1.equals(obj2)) {
			System.out.println("2���� ���� �����ϴ�.");
		} else
			System.out.println("2���� ���� ���� �ʽ��ϴ�.");

		// ���� �ñ��ؼ� �غ� ��
		System.out.println(obj1.getClass()); // class ch7class.Circle
		System.out.println(obj1.getClass().getName()); // ch7class.Circle

	}

}
