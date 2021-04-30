package ch5class;

import java.util.*;

class User {
	String id, pw;
	static int count;

	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
		count++;
	}
}

public class UserTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User[] users = new User[5];
		int count = 0;

		while (true) {
			System.out.println("======================");
			System.out.println("1. Sign up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("======================");
			System.out.print("번호를 입력하시오: ");

			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("Id: ");
				String id = sc.next();
				System.out.print("Password: ");
				String pw = sc.next();
				users[User.count] = new User(id, pw);
				break;

			case 2:
				System.out.print("Id: ");
				String inputID = sc.next(); // id = sc.next()로 교수님은 품. 구별을 위해 변수 이름 다르게 함
				System.out.print("Password: ");
				String inputPW = sc.next();
				int i = 0;
				for (i = 0; i < User.count; i++) {
					if (users[i].id.equals(inputID) && users[i].pw.equals(inputPW)) {
						System.out.println("로그인 되었습니다.");
						break;
					}
				}
				if (i == User.count) { // 위에서 for문의 i가 다 돌면 그때 i 값은 count이다. 따라서 다 돌았는데도 일치하는 값이 없다면 에러 메시지 출력
					System.out.println("아이디 혹은 비밀번호가 잘못 입력되었습니다.");
				}
				break;

			case 3:
				for (int k = 0; k < User.count; k++) { // Print All Users에 대한 내용
					System.out.println("{ " + users[k].id + ", " + users[k].pw + " }");
				}
				break;

			case 4:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}

		}
	}
}
