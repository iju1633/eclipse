package ch13class;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {

	public static void main(String[] args) throws Exception { // throws Exception 필수!!
		try (FileReader fr = new FileReader("C:\\Users\\임재욱\\Desktop\\memos for Java\\test.txt")) {
			int ch;
			while ((ch = fr.read()) != -1) { // 안에 괄호 하나 더 있음!, 빈칸 출제로 좋음!
				System.out.print((char) ch); // 다시 문자로 반환해야함, println하면 안됨
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
