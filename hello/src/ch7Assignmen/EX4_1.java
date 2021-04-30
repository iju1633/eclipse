package ch7Assignmen;

import java.util.Scanner;

abstract class Sprite {
	int x = 3;
	int y = 3;
	static char[][] board = new char[10][19];

	abstract void move(char c);
}

class User extends Sprite {

	void move(char c) {
		if (c == 'h') {
			--y;
		} else if (c == 'j') {
			--x;
		} else if (c == 'k') {
			++x;
		} else if (c == 'l') {
			++y;
		}
	}

	void remove() {
		board[x][y] = ' ';
	}

	void update() {
		board[x][y] = '@';
	}
}

class Gold extends Sprite {
	public Gold() {
		x = 3;
		y = 6;
	}

	void move(char c) {} // gold는 움직이지 않는다

	void remove() {
		board[x][y] = ' ';
	}

	void update() {
		board[x][y] = 'G';
	}

}

class Monster extends Sprite {
	public Monster() { // monster는 사선으로 움직이기 때문에 gold에 닿기 위해선 처음 위치 설정이 중요함
		x = 5;
		y = 8;
	}

	void move(char c) {} // monster는 입력값에 따라 움직이지 않음

	void move() {

		x += (Math.random() - 0.5) > 0 ? 1 : -1;
		y += (Math.random() - 0.5) > 0 ? 1 : -1;

	}

	void remove() {
		board[x][y] = ' ';
	}

	void update() {
		board[x][y] = 'M';
	}
}

public class EX4_1 extends Sprite {

	void move(char c) {}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		User user = new User();
		Gold gold = new Gold();
		Monster monster = new Monster();

		for (int i = 1; i < 19; i++) { // 가로의 #에 해당, 양 끝은 제외
			board[0][i] = '#';
			board[9][i] = '#';
		}
		for (int i = 0; i < 10; i++) { // 세로의 #에 해당
			board[i][0] = '#';
			board[i][18] = '#';
		}
		int cnt = 0; // 상호작용이 일어나면 값을 올릴 변수
		while (true) {

			user.update();
			gold.update();
			monster.update();

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 19; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l): ");
			String num = sc.next();

			user.remove(); // 기존의 위치에 출력된 건 삭제하고 움직여야함
			monster.remove();

			user.move(num.charAt(0)); // #을 밟거나 벗어나지 않게 움직여야 함

			// monster는 #을 밟거나 넘어갈 수 없음
			int a = monster.x;
			int b = monster.y;
			while (true) {
				monster.move();
				if (monster.x <= 0 || monster.x >= 9 || monster.y <= 0 || monster.y >= 18) { // #을 밟거나 벗어날 경우, 위치 초기화 후
																								// move 다시 실행
					monster.x = a;
					monster.y = b;
					continue;
				} else if (monster.x > 0 && monster.x < 9 && monster.y > 0 && monster.y < 18) {
					break;
				}
			}
			// board에 위치 설정
			user.update();
			monster.update();

			if (user.x == monster.x && user.y == monster.y) { // 상호작용이 일어나면 해당하는 출력문 출력후 루프 나오기
				System.out.println("Monster has got me");
				user.remove();
				monster.update();
				cnt++;
			} else if (monster.x == gold.x && monster.y == gold.y) {
				System.out.println("Monster has got gold");
				gold.remove();
				monster.update();
				cnt++;
			} else if (user.x == gold.x && user.y == gold.y) {
				System.out.println("I have got gold");
				gold.remove();
				user.update();
				cnt++;
			} else if ((user.x == monster.x && monster.x == gold.x) && (user.y == monster.y && monster.y == gold.y)) { // 비기는 경우도 추가해달라고 하셨음
				System.out.println("draw");
				gold.remove();
				user.remove();
				monster.remove();
				cnt++;
			}
			if (cnt > 0) {
				break;
			}
		}

		for (int i = 0; i < 10; i++) { // 결과물 출력
			for (int j = 0; j < 19; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

}
