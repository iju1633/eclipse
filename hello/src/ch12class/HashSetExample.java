package ch12class;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = {"사과", "사과", "바나나", "토마토"};
		for(String a : sample) {
			if(!s.add(a)) { // 추가되지 않으면 중복된 단어로 출력, 추가되지 않는 것, 즉 중복되었다는 것은 시스템이 판단!
				System.out.println("중복된 단어 : " + a);
			}
		}
		
		System.out.println(s.size() + " 중복되지 않은 단어 : " + s); // 3 중복되지 않은 단어 : [토마토, 사과, 바나나], 결과 형식 주목!
	}

}
