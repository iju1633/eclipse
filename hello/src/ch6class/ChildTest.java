package ch6class;

class Parent {
	public void print() {
		System.out.println("�θ� Ŭ������ print()");
	}
}

class Child extends Parent {
	public void print(){
		super.print();
		System.out.println("�ڽ� Ŭ������ print()");
	}
}
public class ChildTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.print();
	}

}
