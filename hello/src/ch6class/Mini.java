package ch6class;

import java.util.Scanner; //  현재 안되는 건, 만났는데도 계속 루프가 돌고 M의 움직이는 범위 설정 못함

// 몬스터의 움직임의 경우, x와 y모두 + - 1씩 되기에 대각선으로도 움직일 수 있음
// 몬스터와 사용자가 만나거나 몬스터가 골드로 가면, Monster has got me, Monster has got gold 를
// 사용자가 골드를 만나면 I have got gold를 출력할 것
// 사용자와 몬스터가 모두 # 안에서만 움직이도록 설정할 것
// 동시에 gold에 올 경우 draw를 출력하고 배열을 출력할 것

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

	void update() { // user의 위치 갱신
		board[x][y] = '@';
	}
}

class Gold extends Sprite {
	public Gold() {
		x = 3;
		y = 6;
	}

	void move(char c) {
	}

	void remove() {
		board[x][y] = ' ';
	}

	void update() { // gold의 위치 갱신
		board[x][y] = 'G';
	}

}

class Monster extends Sprite {
	public Monster() {
		x = y = 7;
	}

	void move(char c) { // user의 움직임은 알아서 #에 겹치지 않게 움직어야 하고, monster는 #과 겹치지 않도록 설정해햐함
	}

	void move() {
		// x에 대해서는 0번과 19번 인덱스에 # 존재
		x += (Math.random() - 0.5) > 0 ? 1 : -1;

		// y에 대해서는 0번과 10번 인덱스에 # 존재
		y += (Math.random() - 0.5) > 0 ? 1 : -1;

	}

	void remove() {
		board[x][y] = ' ';
	}

	void update() { // monster의 위치 갱신
		board[x][y] = 'M';
	}
}

public class Mini extends Sprite {

	@Override
	void move(char c) { // board를 공유하기 위해 board를 Sprite 추상클래스에 정의해서 적어야하는 부분
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		User user = new User();
		Gold gold = new Gold();
		Monster monster = new Monster();

		
		for (int i = 1; i < 19; i++) {
			board[0][i] = '#';
			board[9][i] = '#';
		}
		for (int i = 0; i < 10; i++) {
			board[i][0] = '#';
			board[i][18] = '#';
		}
		int cnt = 0; // 몬스터와 사용자가 만나거나 몬스터가 골드로 가거나 사용자가 골드로 갈 경우 cnt++할 예정
		while (true) { // 위 경우 중, 한 가지의 경우라도 나오면 반복문을 나와서 결과값을 출력할 것임
			
			// 갱신된 배열 출력
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

			user.remove();
			monster.remove();
			// 객체들 움직임
			user.move(num.charAt(0));
			monster.move();
			user.update();
			monster.update();

			// 몬스터와 사용자가 만나거나 몬스터가 골드로 가거나 사용자가 골드로 갈 경우에 대해서 출력문 설정
			if (user.x == monster.x && user.y == monster.y) { // 몬스터와 사용자가 만나는 경우
				System.out.println("Monster has got me");
				gold.remove();
				cnt++;
			} else if (monster.x == gold.x && monster.y == gold.y) { // 몬스터가 골드와 만나는 경우
				System.out.println("Monster has got gold");
				gold.remove();
				cnt++;
			} else if (user.x == gold.x && user.y == gold.y) { // user와 골드가 만나는 경우
				System.out.println("I have got gold");
			} else if ((user.x == monster.x && monster.x == gold.x) && (user.y == monster.y && monster.y == gold.y)) {
				System.out.println("draw");
				gold.remove();
				cnt++;
			}
			if(cnt > 0) {
				break;
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

}
