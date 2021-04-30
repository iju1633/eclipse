package ch7class;

public class ExceptionTest {

	public static void main(String[] args) {
		// Integer obj = new Integer(100); 이렇게 쓰는 궐 권장하지 않음
		Integer obj = 100;
		obj = 20;
		System.out.println(obj + 1);

		Integer[] iarr = new Integer[2];

		iarr[0] = new Integer(10); // 이렇게 쓰는 궐 권장하지 않음
		iarr[1] = 20;

		int arr[] = { 1, 2, 3, 6, 9, 7 };

		try {
			for (int i = 0; i <= arr.length; i++) { // length까지 ++하면 index 초과가 뜬다 그러므로 catch구문으로 가고 for문 아래의 "출력"은 출력되지
													// 않는다
				System.out.print(arr[i] + " ");
			}
			System.out.println("출력");
		} catch (Exception e) {
			System.out.println("예외 발생");
		} finally {
			System.out.println("최종 처리");
		}
	}

}
