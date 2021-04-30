package ch7Assignmen;

class Rectangle {
	int width, height;

	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
}

class ColorRectangle extends Rectangle {
	String color;

	public ColorRectangle(int w, int h, String c) { 
		super(w, h); // 상위 클래스에서 기본 생성자 없기 때문에 자식 클래스에서 상위 클래스를 호출해줘야함
		super.width = w;
		super.height = h;
		this.color = c;
	}

	void print() {
		System.out.println("가로 : " + width);
		System.out.println("가로 : " + height);
		System.out.println("색상 : " + color);
	}
}

public class EX4_2 {

	public static void main(String[] args) {
		ColorRectangle cr = new ColorRectangle(100, 100, "blue");
		cr.print();
	}

}
