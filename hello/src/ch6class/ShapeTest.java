package ch6class;

abstract class Shape2 { // Shape2에서 추상을 빼고 여기에서 draw를 Shape2 Draw 출력으로 정의해놓고, Rectangle2의 재정의 부분을 지우면
						// arrayOfShape2[i].draw(); 했을 때 Shape2 Draw 출력됨
	int x, y;

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void draw();
}

class Rectangle2 extends Shape2 {
	int width, height;

	public void draw() {
		System.out.println("Rectangle draw");
	}
}

class Triangle extends Shape2 {
	int base, height;

	public void draw() {
		System.out.println("Triangle draw");
	}
}

class Circle2 extends Shape2 {
	int radius;

	public void draw() {
		System.out.println("Cirlce draw");
	}
}

public class ShapeTest {

	public static void main(String[] args) {

		Shape2 s;
		// s = new Shape2(); Shape2는 추상 클래스이기 때문에 객체 생성이 안됨
		s = new Rectangle2();
		s.x = 10;
		s.y = 20;
		// s.width = 10; // 부모 클래스에서 자식 클래스의 멤버 접근 불가
		// s.height = 10;

		Rectangle2 r;
		r = new Rectangle2();
		r.x = 10; // 자식에서 부모는 됨
		r.y = 20;
		r.width = 10;
		r.height = 10;

		Shape2 arrayOfShape2[] = new Shape2[3];
		arrayOfShape2[0] = new Rectangle2();
		arrayOfShape2[1] = new Triangle();
		arrayOfShape2[2] = new Circle2();

		for (int i = 0; i < arrayOfShape2.length; i++) { // 동적 바인딩
			arrayOfShape2[i].draw();

			if (arrayOfShape2[i] instanceof Rectangle2) { // 객체 타입 비교하는 것으로 true나 false를 반환
				System.out.println("Rectangle object");
			} else if (arrayOfShape2[i] instanceof Triangle) {
				System.out.println("Triangle object");
			} else if (arrayOfShape2[i] instanceof Circle2) {
				System.out.println("Circle2 object");
			}

		}

	}

}
