package ch7main;
import ch7lib.*;

public class PackageTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(100, 200));
	}
// kr.ac.uos.cs.hong 이런식으로 도메인을 거꾸로 써서 package 선언함
// com.company.department.mypackage
}
