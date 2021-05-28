package ch12class;

import java.util.*;

public class AslistExample {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
		s.add(9); // 추가나 삭제할 수 없는 배열을 set에 넣은 것이기에 그 set에는 추가나 삭제 가능
		
		List<Integer> l = Arrays.asList(1,2);
		// l.add(3); 에러발생!! 해당원소를 추가할 수 없음!
		System.out.println(s);
		// System.out.println(l); : error
	}

}
