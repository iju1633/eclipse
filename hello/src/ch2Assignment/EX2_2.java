package ch2Assignment;

import java.util.*;

public class EX2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("마일을 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		double mile = sc.nextDouble();

		double kilo = mile * 1.609;
		System.out.println(mile + "마일은 " + kilo + "킬로미터입니다.");
	}

}
