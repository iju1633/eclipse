package ch4class;

public class Complex {
	int real;
	int imag;

	public Complex() { // 교수님께서 필드 선언 후, 생성자에서 0으로 초기화하라고 하심
		real = 0;
		imag = 0;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}

	public void print() {
		System.out.println(real + "+" + imag + "i"); // 교수님께서 복소수 사칙연산 필요없다고 하심
	}

	public static void main(String[] args) {
		Complex c = new Complex();
		c.setReal(10);
		c.setImag(20);
		c.print();
	}

}
