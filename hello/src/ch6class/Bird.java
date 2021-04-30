package ch6class;

class Animal {
	void walk() {
		System.out.println("���� �� ����");
	}
}

public class Bird extends Animal {
	void fly() {
		System.out.println("�� �� ����");
	}

	void sing() {
		System.out.println("�뷡�� �� ����");
	}

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
