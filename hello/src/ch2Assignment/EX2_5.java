package ch2Assignment;

public class EX2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 : 변수 y, z, a, b의 값을 아래와 같이 16진수로 표시하는 프로그램을 작성하시오
		// 조건 : y : 왼쪽으로 8비트 이동
		// z : 오른쪽으로 8비트 이동
		// a : 0xf0ff And 연산
		// b : 0xf0ff XOR 연산

		int x = 4080;
		System.out.printf("y=0x%x", x << 8);
		System.out.println();
		System.out.printf("z=0x%x", x >> 8);
		System.out.println();
		System.out.printf("a=0x%x", x & 0xf0ff);
		System.out.println();
		System.out.printf("b=0x%x", x ^ 0xf0ff);

		// x 값을 입력받는 경우
		/*
		  Scanner sc = new Scanner(System.in); 
		  int x = sc.nextInt();
		  System.out.printf("y=0x%x" , x<<8); System.out.println();
		  System.out.printf("z=0x%x" , x>>8); System.out.println();
		  System.out.printf("a=0x%x" , x&8); System.out.println();
		  System.out.printf("b=0x%x" , x^8);
		 */

	}

}
