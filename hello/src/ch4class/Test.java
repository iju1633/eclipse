package ch4class;

class A {
	private int a;
	int b;
	public int c;
}

public class Test {

	public static void main(String[] args) {
		A obj = new A();
		// obj.a = 10; 는 private이라 접근 안됨. 그러므로 private 지우거나 해야됨
		obj.b = 10;
		obj.c = 10;
	}

}
