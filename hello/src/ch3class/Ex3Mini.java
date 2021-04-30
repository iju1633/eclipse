package ch3class;

import java.util.*;

public class Ex3Mini {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		int answer = (int) (Math.random() * 100); // Math.random() * 100 이거에 괄호 안하면 Math.random()이게 int형 되니까 그냥 0임. 답이 게속 0임!
		int i = 0;
		do {
			System.out.print("정답을 추측하여보시오: ");
			choice = sc.nextInt();

			if (choice > answer) {
				System.out.println("LOW");
			} else if (choice < answer) {
				System.out.println("HIGH");
			}
			i++;
		} while (choice != answer);
		System.out.println("축하합니다. 시도횟수=" + i);
	}

}
