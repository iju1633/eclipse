package ch6class;


class Base {
	public Base() {
		System.out.println("Base 생성자 호출");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("Derived 생성자 호출");
	}
}
public class Test {

	public static void main(String[] args) {
		Derived r = new Derived();
	}

}
