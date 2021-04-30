package ch3Assignment;

import java.util.Scanner;

public class EX3_6 {

	public static void main(String[] args) { // 비기는 경우에 대해서는 다루지 않았음
		// 코딩의 흐름 : 내가 돌을 놓는다 -> 빙고인지 확인 -> 아니면 컴퓨터가 돌을 놓는다 -> 빙고인지 확인 -> 반복(내가 돌을 놓을 차례)
		// 빙고일 경우 빙고판 출력하고 결과 출력 후 게임 종료

		char[][] board = new char[3][3];
		int x, y;

		Scanner sc = new Scanner(System.in);
		// 보드판 초기화
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}

		outer: do {
			// 바둑판 그리기(O와 X가 들어갈 자리를 만들어 놓음)
			for (int i = 0; i < 3; i++) {
				System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);

				if (i != 2) {
					System.out.println("---|---|---");
				}
			}

			// 돌을 놓을 좌표 입력
			System.out.print("다음 수의 좌표를 입력하시오: ");
			x = sc.nextInt();
			y = sc.nextInt(); // 내가 놓을 바둑돌의 자표 입력하기

			if (board[x][y] != ' ') { // 비어있지 않으면 다시하고 아니면 X 표시하기
				System.out.println("잘못된 위치입니다. ");
				continue;
			} else {
				board[x][y] = 'X';
			}

			// 컴퓨터가 돌을 놓는 순서 중요함(내가 놓고 나서, 빙고인지 판단하고 돌을 놓아야함. 나도 놓고 컴퓨터도 놓고 판단하면 둘다 승리 가능)
			// 컴퓨터가 놓을 자리 : 위에서부터 차곡차곡이라는 것이 한계 -> 정밀하려면 random으로 바꿔줄 필요 있음

			int cnt = 0; // 무승부일 경우를 대비해서 만든 변수
			
			// 가로선 비교
			for (int k = 0; k < 3; k++) { // 줄은 총 3개
				if (board[k][0] == 'O' && board[k][1] == 'O' && board[k][2] == 'O') { // 열별로 비교해서 모든 값이 O이면 computer
																						// won! 출력하고 프로그램 끝내야함
					cnt++;
					for (int l = 0; l < 3; l++) { // 바둑판 결과 보여주기
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("컴퓨터 승리");
					break outer;

				} else if (board[k][0] == 'X' && board[k][1] == 'X' && board[k][2] == 'X') {
					
					cnt++;
					for (int l = 0; l < 3; l++) { // 바둑판 결과 보여주기
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("인간 승리");
					break outer;
				}
			}

			// 세로선 비교
			for (int k = 0; k < 3; k++) { // 줄은 총 3개
				if (board[0][k] == 'O' && board[1][k] == 'O' && board[2][k] == 'O') {
					cnt++;
					for (int l = 0; l < 3; l++) { // 바둑판 결과 보여주기
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("컴퓨터 승리");
					break outer;
				} else if (board[0][k] == 'X' && board[1][k] == 'X' && board[2][k] == 'X') {
					cnt++;
					for (int l = 0; l < 3; l++) { // 바둑판 결과 보여주기
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("인간 승리");
					break outer;
				}

			}

			// 대각선 \모양

			if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
				cnt++;
				for (int k = 0; k < 3; k++) { // 바둑판 그리기(O와 X가 들어갈 자리를 만들어 놓음)
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("컴퓨터 승리");
				break;
			} else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
				cnt++;
				for (int k = 0; k < 3; k++) { // 바둑판 그리기(O와 X가 들어갈 자리를 만들어 놓음)
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("인간 승리");
				break;
			}

			// 대각선 /모양

			if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
				cnt++;
				for (int k = 0; k < 3; k++) { // 바둑판 그리기(O와 X가 들어갈 자리를 만들어 놓음)
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("컴퓨터 승리");
				break;
			} else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
				cnt++;
				for (int k = 0; k < 3; k++) { // 바둑판 그리기(O와 X가 들어갈 자리를 만들어 놓음)
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("인간 승리");
				break;
			}
			

			// 컴퓨터가 돌을 놓는 과정
			/*
			 * random으로 컴퓨터가 돌을 놓는 버전
			 * for(int m = 0; m<1; m++) { 
			 * int i = (int) (Math.random()*3); 
			 * int j = (int) (Math.random()*3); 
			 * 		if(board[i][j] != ' ') {
			 * 			m--; 
			 * 			continue;
			 * 		} 
			 * 		else board[i][j] = 'O';
			 * }
			 */
			
			outter: for (int i = 0; i < 3; i++) { // 해당 좌표가 비어있다면, O 표시
				for (int j = 0; j < 3; j++) {
					if (board[i][j] == ' ') {
						board[i][j] = 'O';
						break outter; // 그냥 break하게 되면 행별로 다 O표시됨
					}
				}
			}

			// 가로선 비교
			for (int k = 0; k < 3; k++) { // 줄은 총 3개
				if (board[k][0] == 'O' && board[k][1] == 'O' && board[k][2] == 'O') { // 열별로 비교해서 모든 값이 O이면 computer won! 출력하고 프로그램 끝내야함
					cnt++;
					for (int l = 0; l < 3; l++) { // 바둑판 결과 보여주기
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("컴퓨터 승리");
					break outer;

				} else if (board[k][0] == 'X' && board[k][1] == 'X' && board[k][2] == 'X') {
					cnt++;
					for (int l = 0; l < 3; l++) { // 바둑판 결과 보여주기
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("인간 승리");
					break outer;
				}
			}

			// 세로선 비교
			for (int k = 0; k < 3; k++) { // 줄은 총 3개
				if (board[0][k] == 'O' && board[1][k] == 'O' && board[2][k] == 'O') {
					cnt++;
					for (int l = 0; l < 3; l++) { // 바둑판 결과 보여주기
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("컴퓨터 승리");
					break outer;
				} else if (board[0][k] == 'X' && board[1][k] == 'X' && board[2][k] == 'X') {
					cnt++;
					for (int l = 0; l < 3; l++) { // 바둑판 결과 보여주기
						System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

						if (l != 2) {
							System.out.println("---|---|---");
						}
					}
					System.out.println("인간 승리");
					break outer;
				}

			}

			// 대각선 \모양

			if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
				cnt++;
				for (int k = 0; k < 3; k++) { // 바둑판 결과 보여주기
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("컴퓨터 승리");
				break;
			} else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
				cnt++;
				for (int k = 0; k < 3; k++) { // 바둑판 결과 보여주기
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("인간 승리");
				break;
			}

			// 대각선 /모양
				
			if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
				cnt++;
				for (int k = 0; k < 3; k++) { // 바둑판 결과 보여주기
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("컴퓨터 승리");
				break;
			} else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
				cnt++;
				for (int k = 0; k < 3; k++) { // 바둑판 결과 보여주기
					System.out.println("  " + board[k][0] + "|  " + board[k][1] + "|  " + board[k][2]);

					if (k != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("인간 승리");
				break;
			}
			
			
			// 비기는 경우
			
			boolean isEmpty = false; // 보드판이 비워져 있는가를 판별할 변수 선언
			outter2 : for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if (board[i][j] == ' ') { // 빈 곳이 있다면 무승부를 판별할 때가 아님
						isEmpty = true;
					}
					if(isEmpty == true) {
						break outter2;
					}
				}
			} // 바둑판이 비어있지 않다면 if문으로 내려감
			if(cnt == 0 && isEmpty == false) { // 다 차있는데 빙고된게 없다면 비겼다고 결과 출력
				for (int l = 0; l < 3; l++) { // 바둑판 결과 보여주기
					System.out.println("  " + board[l][0] + "|  " + board[l][1] + "|  " + board[l][2]);

					if (l != 2) {
						System.out.println("---|---|---");
					}
				}
				System.out.println("무승부");
				break;
			}
			

		} while (true);

	}

}
