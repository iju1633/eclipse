package ch7class;

import java.io.*;

class MyException extends Exception {
	public MyException() {
		super("사용자 정의 예외"); // getMessage를 쓰기 위함
	}
}
public class ExceptionTest1 {

	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("C:\\Users\\임재욱\\Desktop\\memos for Java\\test.txt");
		char[] a = new char[50];
		fr.read(a); // read 메서드는 여러가지 기능이 있는데 이것은 버퍼에 문자열을 담는 역할을 함
		for(char c : a) { // read의 매소드의 리턴값은 정수형이기에 캐스트 연산자 (char)를 사용해서 문자로 바꿈
			System.out.print(c);
		}
		
		try {
			method1();
		}
		catch( MyException e) {
			System.out.println(e.getMessage() + "\n호출 스택내용: "); // e.getMessage() : 에러의 원인을 간단하게 출력합니다
			e.printStackTrace();
			System.out.println("예외 테스트");
		}
	}
	
	public static void method1() throws MyException { // throws를 하면 MyException에 맡기는 것임
		throw new MyException();
	}

}
