package ch6class;

class Shape1 {
	protected int x, y;

	public void print() {
		System.out.println(x + " " + y);
	}
}

class Rectangle1 extends Shape1 {
	int width, height;

	double calcArea() {
		return width * height;
	}

	void draw() {
		System.out.println("Shape에서 가져온 " + x + " 와 " + y);
	}
	
	@Override // 이렇게 쓰는 것(위치!)
	public void print() {
		super.print(); // 0 0
		System.out.println("짠");
	}
}

public class Rectangle {
	public static void main(String[] args) {
		Rectangle1 rc = new Rectangle1();
		rc.print(); // 0 0 \n 짠
		rc.draw(); // Shape에서 가져온 0 와 0
	}

}
