package ch13class;

import java.io.*;

public class CopyLines {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(
				new FileReader("C:\\Users\\임재욱\\Desktop\\memos for Java\\input.txt"));
				PrintWriter out = new PrintWriter(
						new FileWriter("C:\\Users\\임재욱\\Desktop\\memos for Java\\output.txt"))) {
			String line;
			while ((line = in.readLine()) != null) { // 기본적으로 BufferedReader는 한 줄을 통째로 입력받는 방법으로 주로 쓰입니다. 그래서 readLine() 쓰이는 것임(String 값으로 엔터값 포함해서 한줄을 전부 읽어옴)
				out.println(line); // println() 메소드가 호출되면 자동으로 flush() 메소드를 호출한다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
