package ch3Assignment;

import java.util.*;

public class EX3_4 {

	public static void main(String[] args) { // switch문도 사용 가능
		Scanner sc = new Scanner(System.in);
		System.out.print("연산을 입력하세요: ");
		String operator = sc.next();
		sc.nextLine();

		System.out.print("숫자 2개를 입력하세요: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();

		if (operator.equals("+")) {
			System.out.print(num1 + "+" + num2 + " = " + (num1 + num2));
		} else if (operator.equals("-")) {
			System.out.print(num1 + "-" + num2 + " = " + (num1 - num2));
		} else if (operator.equals("*")) {
			System.out.print(num1 + "*" + num2 + " = " + (num1 * num2));
		} else if (operator.equals("/")) {
			if (num2 == 0)
				System.out.println("0으로 나눌 수 없습니다."); // 교수님께서 0으로 나눌 수 없는 경우에 처리하라고 하신 내용
			else
				System.out.print(num1 + "/" + num2 + " = " + (num1 / num2));
		}
	}

}
