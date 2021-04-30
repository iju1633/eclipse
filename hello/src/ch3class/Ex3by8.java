package ch3class;

import java.util.*;

public class Ex3by8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month; // 사용될 변수는 do나 while구문 안에 사용될 수 있으므로 구문 밖에서 설정해야함.
		do {
			System.out.print("올바른 월을 입력하시오[1-12]: ");
			month = sc.nextInt();
		} while (1 > month || month > 12); // while 구문안에 해당하면 다시 반복하는 것임
		System.out.println("사용자가 입력한 월은 " + month);
	}

}
