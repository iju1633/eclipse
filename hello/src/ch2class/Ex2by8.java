package ch2class;

import java.util.Scanner;

public class Ex2by8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean isLeapYear = false;
		if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
			isLeapYear = true;
		}

		System.out.println(year + " = " + isLeapYear);
	}

}
