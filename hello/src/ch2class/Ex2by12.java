package ch2class;

public class Ex2by12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0x0fff;
		int y = 0xfff0;
		int z = -16;
		
		System.out.printf("%x ", x&y);
		System.out.printf("%x ", x|y);
		System.out.printf("%x ", x^y);
		System.out.printf("%x ", ~x);
		System.out.printf("%d ", y>>8); // 8비트가 1바이트 : https://coding-factory.tistory.com/521 참고
		System.out.printf("%x ", z>>3); // 음수면 1, 양수면 0으로 채움
		System.out.printf("%x ", z>>>3); // 0으로 채움
		// 부호 비트 >> << >>> 좀 더 알아볼 것. 아직 확실히 모름 -> 해결!
	}

}
