package ch4class;

public class Circle1 { // 앞의 CircleTest와 다르게 하나의 class안에 다 작성
	int radius;

	void setRadius(int r) {
		this.radius = r;
	}

	double calcArea() {
		return 3.14 * radius * radius;
	}

	void print() {
		System.out.println("원의 반지름: " + radius);
		System.out.println("원의 면적: " + calcArea());
	}

	public static void main(String[] args) {
		Circle1 obj = new Circle1();
		obj.setRadius(100);

		obj.print();
	}

}
