package ch4class;

public class Dice { // roll에서 value갑을 설정하면 setValue안써도 되고, roll에서 값만 가져오면 setValue에서 그 값을 설정하면 됨.
	private int value;

	public Dice() {
		value = 0;
	}

	public int roll() { // 1~6에서 정수하나 추출
		int result = (int) (Math.random() * 6) + 1;
		return result;
	}

	public void setValue(int value) { // roll()에서 추출한 값을 넣을 예정
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		Dice d1 = new Dice(); // 주사위 2개 생성
		Dice d2 = new Dice();

		int cnt = 1; // 한번에 성공하는 경우 걸린회수는 1이기 때문에 1로 초기화해야함
		while (true) {

			d1.setValue(d1.roll());
			int result1 = d1.getValue();

			d2.setValue(d2.roll());
			int result2 = d2.getValue();

			System.out.println("주사위1=" + result1 + " 주사위2=" + result2);
			if (result1 + result2 == 2) {
				System.out.println("(1,1)이 나오는데 걸린회수 = " + cnt);
				break;
			}
			cnt++;
		}
	}

}
