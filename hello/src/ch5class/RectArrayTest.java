package ch5class;

class Rect { // 처음에 얘를 RectArrayTest안에 만들었음. 그러면 아래와 같이 오류가 남
	/*
	 * No enclosing instance of type RectArrayTest is accessible. Must qualify the
	 * allocation with an enclosing instance of type RectArrayTest (e.g. x.new A()
	 * where x is an instance of RectArrayTest).
	 */
	int width, height;

	public Rect(int w, int h) {
		this.width = w;
		this.height = h;
	}

	double calcArea() {
		return (double) width * height;
	}
}

public class RectArrayTest {

	public static void main(String[] args) {
		Rect[] list;
		list = new Rect[5];

		for (int i = 0; i < list.length; i++) {
			list[i] = new Rect(i, i);
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(i + "번째 사각형의 면적 = " + list[i].calcArea());
		}
	}

}
