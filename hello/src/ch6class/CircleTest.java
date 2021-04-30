package ch6class;


class Shape {
	int x, y;
}

class Circle extends Shape {
	int r;
	public Circle(int r) {
		this.r = r;
		x = 0;
		y = 0;
	}
	
	double calcArea() {
		return 3.14*r*r;
	}
}
public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle(10);
		System.out.println("원의 중심: (" + c.x + "," + c.y + ")");
		System.out.println("원의 면적: " + c.calcArea());
	}

}
