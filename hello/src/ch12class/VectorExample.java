package ch12class;

import java.util.*;

class Monster {
	String name;
	double hp;

	public Monster(String name, double hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() { // 재정의, 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		return "{" + name + "," + "hp" + "}";
	}
}

public class VectorExample {

	public static void main(String[] args) {
		Vector<Monster> list = new Vector<>();

		list.add(new Monster("M1", 100));
		list.add(new Monster("M2", 100));
		list.add(new Monster("M3", 100));

		System.out.println("벡터의 크기 : " + list.size());
		System.out.print(list); // println하던 print하던 결과 동일, 왜냐하면 list에 요소 하나씩 들어가있음. index를 줘서 for each에서 하나씩
								// 출력하면 한줄 씩 출력되겠지
	}

}
