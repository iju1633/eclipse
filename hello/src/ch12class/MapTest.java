package ch12class;

import java.util.*;

class Student {
	int number;
	String name;

	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return name; // print할 때 new Student(100, "홍길동")이렇게 해도 홍길동만 출력된다는 의미, 예시처럼 출력되게 빈칸 출제 가능!!!
	}
}

public class MapTest {

	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>(); // HashMap에 대한 내용 : https://coding-factory.tistory.com/556
		st.put("100", new Student(100, "홍길동"));
		st.put("200", new Student(200, "김유신"));
		st.put("300", new Student(300, "김철수"));

		System.out.println(st); // 전체 출력 방법 : {100=홍길동, 200=김유신, 300=김철수}, set은 []였음

		st.remove("200"); // 김유신 행 삭제

		st.put("100", new Student(20090003, "최자영")); // 홍길동 대신 최자영으로 갱신
		System.out.println(st.get("300")); // key값 300의 value 얻기 : 김철수

		//entrySet() 활용
		for (Map.Entry<String, Student> s : st.entrySet()) { // String과 Student로 이루어진 항목(entry) 집합을 돌며 getKey와 getValue를 통해 반환
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}

		// keySet() 활용
		System.out.println();
		for (String key : st.keySet()) { // key들의 집합을 돌면서 get을 통해 value를 반환
			Student s = st.get(key);
			System.out.println("key=" + key + ", value=" + s); // s : value=최자영 이렇게 나옴, 왜냐하면 위에서 toString(); 재정의 했기 때문
		}

		// 람다식 활용
		System.out.println();
		st.forEach((key, value) -> { // 꼭 알아둘 것!! st.ForEach((key, value) -> {
			System.out.println("key=" + key + ", value=" + value);
		});
	}

}
