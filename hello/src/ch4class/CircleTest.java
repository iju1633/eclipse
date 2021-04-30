package ch4class;

class Circle {
	int r;
	String color;

	double calcArea() {
		return 3.14 * r * r;
	}
}

public class CircleTest {
	public static void main(String[] args) {

		Circle obj;
		obj = new Circle();
		obj.r = 100;
		obj.color = "blue";
		double area = obj.calcArea();
		System.out.println("원의 면적 : " + area);
	}
}
