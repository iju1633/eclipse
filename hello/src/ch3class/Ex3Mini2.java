package ch3class;

public class Ex3Mini2 {

	public static void main(String[] args) {

		String[] array1 = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] array2 = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		for (int i = 0; i < 5; i++) {
			int index1 = (int) (Math.random() * 4); // index의 값은 0, 1, 2, 3이 무작위로 나와야하는 것이므로 4를 곱하는 것이다
			int index2 = (int) (Math.random() * 13); // index의 값은 0, 1,..., 11, 12이 무작위로 나와야하는 것이므로 13을 곱하는 것이다

			System.out.print(array1[index1] + "의 " + array2[index2]);
			System.out.println();
		}
	}

}
