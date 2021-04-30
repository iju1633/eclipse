package ch2Assignment;

import java.util.*;

public class EX2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("오렌지의 개수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int orange = sc.nextInt();

		int box = orange / 10; // 몫
		int remain = orange % 10; // 나머지

		System.out.println(box + "박스가 필요하고 " + remain + "개가 남습니다.");

	}

}
