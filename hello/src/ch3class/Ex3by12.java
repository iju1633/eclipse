package ch3class;

import java.util.*;

public class Ex3by12 { // 약수 출력

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		int num = sc.nextInt();

		System.out.println(num + "�� ����� ������ �����ϴ�.");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
