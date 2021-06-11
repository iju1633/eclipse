package ch14Assignment;

import java.util.ArrayList;

class RandomList<T> {
	ArrayList<T> list; // 동적 배열 사용 예정

	public RandomList(int i) { // 객체 생성하면 arraylist 만들어지도록 설정, 아래에서 객체 생성 시 매개변수도 받으므로 int i 설정
		list = new ArrayList<>(i);
	}

	public void add(T item) { // 제네릭 프로그래밍
		list.add(item);
	}

	public T select() {
		int index = (int) (Math.random() * list.size()); // 임의로 list안의 값을 가져오기 위함
		return list.get(index);
	}

	public int size() { // 당연 구현해야 함, arrayList의 list() 메소드랑 헷갈림
		return list.size();
	}

	public T get(int i) { // arrayList의 get 메서드와 같은 기능
		return list.get(i);
	}

}

public class EX6_3 {
	public static void main(String[] args) {
		RandomList<Integer> rla = new RandomList<Integer>(2);

		rla.add(10);
		rla.add(20);
		rla.add(50);

		for (int i = 0; i < rla.size(); i++) {
			System.out.println(rla.get(i));
			System.out.println(rla.select());
		}

		RandomList<String> rlb = new RandomList<String>(1);

		rlb.add("We");
		rlb.add("Are");
		rlb.add("The");
		rlb.add("World");

		for (int i = 0; i < rlb.size(); i++) {
			System.out.println(rlb.get(i));
			System.out.println(rlb.select());
		}
	}
}
