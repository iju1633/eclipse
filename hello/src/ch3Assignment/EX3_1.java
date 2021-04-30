package ch3Assignment;

public class EX3_1 {

	public static void main(String[] args) {
		int star = 5;
		int space = 0;

		for (int i = 0; i < 3; i++) { // 3줄까지
			for (int j = space; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}

			System.out.println();
			star -= 2;
			space++;
		}
		star = 3; // 위에서 마지막 번째로 처리하고 star와 space 연산 구문이 한 번 더 실행되었으므로 for문 들어가기전에 한 번 개수를 초기화해줘야함
		space = 1;

		for (int i = 4; i <= 5; i++) { // 4줄, 5줄

			for (int j = space; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}

			System.out.println();
			star += 2;
			space--;
		}
	}

}
