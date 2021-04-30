package ch7Assignmen;

import java.util.Scanner;

public class EX4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "count";

		String[] chosenWordArray = answer.split(""); // 정답이 들어가 있는 배열
		String[] hiddenWordArray = new String[answer.length()];
		for (int i = 0; i < answer.length(); i++) { // 모든 문자를 "_" 처리하는 과정
			hiddenWordArray[i] = "_";
		}

		while (true) {
			System.out.print("현재의 상태: ");
			for (int i = 0; i < answer.length(); i++) {
				System.out.print(hiddenWordArray[i]);
			}
			System.out.println();
			System.out.print("글자를 추측하시오: ");
			String input = sc.next();

			for (int i = 0; i < answer.length(); i++) { // 맞춘 문자가 있으면 갱신
				if (input.equals(chosenWordArray[i])) {
					hiddenWordArray[i] = input;
				}
			}
			int cnt = 0; // 밖에다 선언할 경우, 누적되기 때문에 계속 초기화해줘야함
			for (int i = 0; i < hiddenWordArray.length; i++) {
				if (hiddenWordArray[i].equals(chosenWordArray[i])) {
					cnt++;
				}
			}
			if (cnt == answer.length()) { // 모든 문자를 다 맞추면 while loop 나와서 정답 출력
				System.out.println("정답: " + answer);
				break;
			}
		}
	}
}