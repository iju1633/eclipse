package ch3Assignment;

import java.util.ArrayList;

public class EX3_2 {

	public static void main(String[] args) {
		System.out.print("2부터 100사이의 소수: ");
		for (int k = 2; k <= 100; k++) {
			ArrayList<Integer> factor = new ArrayList<>(); // for 안에 넣어서 반복될때마다 새로 생기게함
			for (int j = 2; j <= k - 1; j++) { // 2부터 k-1까지 나누어서 나눠지는 게 있으면 안됨
				if (k % j == 0) {
					factor.add(k);
				}
			}
			if (factor.size() == 0) {
				System.out.print(k + " ");
			}
		}
	}

}
