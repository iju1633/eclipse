package ch13class;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile1 {

	public static void main(String[] args) throws IOException { // throws IOException 꼭 해줘야 함!!!, 결과 쓰라하거나 빈칸 가능!
		try (FileReader fr = new FileReader("C:\\Users\\임재욱\\Desktop\\memos for Java\\test.txt"); // 교수님 예제에서는 "test.txt"
				FileWriter fw = new FileWriter("C:\\Users\\임재욱\\Desktop\\memos for Java\\copy.txt")) {

			int ch;
			while ((ch = fr.read()) != -1) {
				fw.write(ch); // 화면에 표시할 필요 없으니 char형변환 필요 없음!
			}
		} // catch를 안쓰기도 함 -> 따라서 읽어올 파일이 없으면 오류남
	}
}
