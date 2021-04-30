package ch2Assignment;

import java.util.*;

public class EX2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("받은 돈: ");
		int input = sc.nextInt();

		System.out.print("상품 가격: ");
		int cost = sc.nextInt();

		int tax = (int) (cost * 0.1); // 0.1은 double형이므로 down casting 해줄 필요 있음, 예시의 결과창을 보면 다 integer
		int remain = input - cost;
		System.out.println("부가세: " + tax);
		System.out.println("잔돈: " + remain);

	}

}
