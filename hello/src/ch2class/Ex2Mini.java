package ch2class;

import java.util.*;
public class Ex2Mini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨온도를 입력하시오: ");
		Double F = sc.nextDouble();
		
		Double C = 5.0/9 * (F - 32); // 5/9*() 하게 되면 5/9가 0기에 할거면 (double)5/9 * (F - 32)해야됨 or 5.0/9*()
		System.out.println("섭씨온도는 " + C);
	}

}
