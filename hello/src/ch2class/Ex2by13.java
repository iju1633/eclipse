package ch2class;

import java.util.*;
public class Ex2by13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 가로를 입력하시오: ");
		int width = sc.nextInt();
		// System.out.println(); 입력할 때 enter하므로 줄바꿈 필요없음!!
		
		System.out.print("사각형의 세로를 입력하시오: ");
		int height = sc.nextInt();
		
		System.out.println("사각형의 넓이는 "+ (double)width*height);
		System.out.println("사각형의 둘레는 "+ (double)2*(width+height));
	}

}
