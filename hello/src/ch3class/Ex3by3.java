package ch3class;

import java.util.*;

public class Ex3by3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2): ");
		int choice = sc.nextInt();

		final int sci = 0;
		final int rock = 1;
		final int pap = 2;

		int computer = (int) Math.random() * 3; // 0부터 2까지 임의의 정수 나타남

		System.out.printf("인간: %d 컴퓨터: %d   ", choice, computer);

		if (choice == computer) {
			System.out.println("비겼음");
		} else if (choice == (computer + 1) % 3) { // key point!
			System.out.println("인간 승리");
		} else
			System.out.println("컴퓨터 승리");
	}

}
