package ch12class;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student2 implements Comparable<Student2> { // Comparable interface, 람다식 쓰면 implements 필요없음
	int number;
	String name;

	public Student2(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Student2 s) { // 이거를 참조해서 아래의 sort가 실행됨, 문법 중요!
		return s.number - number; // 내림차순
	}
}

public class SortTest1 {

	public static void main(String[] args) {
		Student2[] array = { new Student2(2, "김철수"), new Student2(3, "이철수"), new Student2(1, "박철수") };

		List<Student2> list = Arrays.asList(array);
		Collections.sort(list);
//		Collections.sort(list, (Student2 s1, Student2 s2) -> { //이름 없는 메서드가 객체로 취급되는 것이 이것을 의미, 알파벳으로 sorting하는 것도 해볼 것
//			return (s1.number - s2.number); // https://www.daleseo.com/java-comparable-comparator/ 참고하여 이해하기
//		});

		System.out.println(list);
	}
	// 오른차순으로 나오게 하려면? number - s.number로 바꾸면 됨
}
