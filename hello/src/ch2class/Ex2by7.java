package ch2class;

import java.util.Scanner;

public class Ex2by7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("이름을 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		System.out.print("나이를 입력하시오: ");
		int age = sc.nextInt();

		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
	}

}
