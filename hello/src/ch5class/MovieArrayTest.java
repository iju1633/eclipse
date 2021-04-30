package ch5class;

import java.util.*;

class Movie {
	String title, director;

	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}

	public void print() {
		System.out.println("{ " + title + ", " + director + " }");
	}
}

public class MovieArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Movie[] list = new Movie[2]; // 여기에서는 배열이 들어갈 자리를 만들고 배열이 들어갈 주소를 만든 것임

		for (int i = 0; i < list.length; i++) {
			System.out.print("영화제목 : ");
			String title = sc.nextLine();
			System.out.print("영화감독 : ");
			String director = sc.nextLine();

			list[i] = new Movie(title, director); // 만들어진 배열 자리에 값을 넣는 과정
		}

		for (int i = 0; i < list.length; i++) {
			list[i].print(); // 이런 방법도 있음, 아래의 방법은 객체의 변수를 직접 가져오는 것이므로 지양해야한다고 하심
			// System.out.print("{ " + list[i].title + ", " + list[i].director + " }");
		}
	}

}
