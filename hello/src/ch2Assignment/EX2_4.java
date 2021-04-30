package ch2Assignment;

import java.util.*;

public class EX2_4 {

	public static void main(String[] args) { // 교재의 팁에 반복 루프 사용하지 않고 해보자라는 의견 반영, 반복문 써서 몫이 0이 될때까지 하는 방법도 있음
		// TODO Auto-generated method stub
		System.out.print("정수: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num; // 문제를 푸는 과정 중에 num을 사용할 것이므로 결과 출력란에서 사용하기 위해 temp변수에 num값 저장

		int a1 = num / 64; // a부터 g까지 7개의 문자를 이용하여 이진법의 각 자리를 나타냄(순서 : 최고자리부터)
		int a2 = num % 64;
		num = num - a1 * 64;

		int b1 = num / 32;
		int b2 = num % 32;
		num = num - b1 * 32;

		int c1 = num / 16;
		int c2 = num % 16;
		num = num - c1 * 16;

		int d1 = num / 8;
		int d2 = num % 8;
		num = num - d1 * 8;

		int e1 = num / 4;
		int e2 = num % 4;
		num = num - e1 * 4;

		int f1 = num / 2;
		int g1 = num % 2; // 마지막 자리의 값은 0아님 1이므로 따로 처리해줄 필요 없음
		num = num - f1 * 2;

		// 결과를 이진법으로 나타내야하기 때문에 각 자리수에 알맞는 값을 곱해줌
		int result = a1 * 1000000 + b1 * 100000 + c1 * 10000 + d1 * 1000 + e1 * 100 + f1 * 10 + g1;

		System.out.println(temp + ": " + result);

	}

}
