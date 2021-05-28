package ch12class;

import java.util.*;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();

		list.add(new Point(0, 0));
		list.add(new Point(1, 0));
		list.add(new Point(2, 0));
		list.add(new Point(3, 0));
		list.add(new Point(4, 0));

		System.out.println(list); // 배열이기에 대괄호로 덮여서 나옴 + 기본적으로 ,를 기준으로 요소들이 출력됨
	}

}
