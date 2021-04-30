package ch5Assignment;

import java.util.*;

public class EX5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}

		System.out.println("---------------------");
		System.out.println("0 1 2 3 4 5 6 7 8 9");
		System.out.println("---------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		while (true) {

			System.out.println();
			System.out.print("몇번째 좌석을 예약하시겠습니까? ");
			int input = sc.nextInt();


			if (array[input] == 1) { // 보여준 예시와 형태를 맞추기 위헤 예약을 할 수 없는 경우가 발생하면 예약할수없습니다.라는 문구 출력 후, 좌석을 보여주고 종료함
				System.out.println("예약할수없습니다.");
				System.out.println();
				System.out.println("---------------------");
				System.out.println("0 1 2 3 4 5 6 7 8 9");
				System.out.println("---------------------");
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}
				System.out.println();
				break;

			} else {
				array[input] = 1;
				System.out.println("예약되었습니다.");
			}

			System.out.println();
			System.out.println("---------------------");
			System.out.println("0 1 2 3 4 5 6 7 8 9");
			System.out.println("---------------------");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	}

}
