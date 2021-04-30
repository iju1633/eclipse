package ch7class;

class NotFoundException extends Exception {
	public NotFoundException() {
	}
}

public class ExceptionTest3 {
	static int searchArray(int num) throws NotFoundException {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return i;
			}
		}
		
		throw new NotFoundException();
	}

	public static void main(String[] args) {

		try {
			System.out.println(searchArray(12)); // 이 방법이 있었네
			
		} catch (NotFoundException e) {
			System.out.println("원하는 숫자가 없습니다.");
		}
	}

}
