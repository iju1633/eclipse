package ch5class;

import java.util.Arrays;

public class ArrayArgumentTest {
	
	public static double minArray(double[] list) {
		double min = list[0];

		for (int i = 1; i < list.length; i++) { // 나는 여태 min = list[0]; 이라고 해도 i를 0부터 시작했었음. 불필요한 i의 시작이었던 것
			if (list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}

	public static void addArray(double[] list, int len) {
		for (int i = 0; i < list.length; i++) {
			list[i]++;
		}
		len++;
	}

	public static void main(String[] args) {

		double[] a = { 1.1, 2.2, 3.3, 4.4, 0.1, 0.2 };
		double[] b = { -2.0, -3.0, -9.0, 2, 9, 1, 5 };

		double min = minArray(a); // static 매서드이기 때문에 바로 사용하면 됨
		System.out.println("a 배열의 최솟값 = " + min);
		double min2 = minArray(b);
		System.out.println("b 배열의 최솟값 = " + min2);

		System.out.println(Arrays.toString(a) + " length :" + a.length);
		addArray(a, a.length); // addArray매서드에서 매개변수 len은 int형 변수이기에 매서드에서 ++해도 값이 변하지 않음(참조형이 아님!)
		System.out.println(Arrays.toString(a) + " length :" + a.length);

	}

}
