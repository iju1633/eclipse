package ch6class;

interface Printable { // 시험문제 나오기 좋다고 함, MultiInterface에서 draw 정의 안하면 다른 곳에서 draw() 없다면 default의 Shape draw 출력됨.
					  // 여기서 default도 정의 안하면 Shape3에서 정의한 draw() 사용. 상속받았기 때문.
					  // 셋 다 정의(interface, 부모class, 자식class)했으면 자식 클래스의 화면의 원을 출력합니다가 출력됨.
	void print();
}

interface Drawable {
	default void draw() { // 만약 아래에서 draw() 메서드를 구현 안할 경우, 이걸 쓰겠다는 뜻
						  // 그리고 이걸 해놓으면 아래 따로 void draw();할 필요가 없겠지?(이헤)
		System.out.println("Default draw");
	}
}

class Shape3 {
	int x, y;

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw() {
		System.out.println("Shape draw");
	}
}

public class MultiInterface extends Shape3 implements Printable, Drawable {

	public void print() {
		System.out.println("프린터로 원을 출력합니다");
	}

//	public void draw() {
//		System.out.println("화면에 원을 그립니다");
//	}

	public static void main(String[] args) {
		MultiInterface obj = new MultiInterface();
		obj.print();
		obj.draw();

		Printable p = obj;
		p.print();
		// p.draw();

		Drawable d = obj;
		d.draw();
		// d.print();
	}

}
