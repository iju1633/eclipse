package ch5class;

class MyMath {
	int i = 0; // non static field i
	static int count = 0;

	public static int abs(int x) {
		return x > 0 ? x : -x;
	}

	public static int power(int base, int exponent) {
		int result = 1;
		// result *= i; cannot make a static reference to the non-static field i
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		return result;
	}
}

public class MyMathTest {

	public static void main(String[] args) {
		System.out.println("10ÀÇ 3½ÂÀº : " + MyMath.power(10, 3));
	}

}
