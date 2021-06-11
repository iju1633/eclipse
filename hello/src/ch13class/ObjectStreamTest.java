package ch13class;

import java.io.*;
import java.util.*;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException { // throws IOException 위치 중요! public class 옆 아니다!
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		try {
			int c;

			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			Date dd = new Date();
			System.out.println(dd);
			out.writeObject(dd); // 프로그램 실행 기준 시간 적음

			out.flush(); // 명시적으로 쓰라는 의미
			Thread.sleep(2000); // 2초 쉬고

			in = new ObjectInputStream(new FileInputStream("object.dat"));
			Date d = (Date) in.readObject(); // write했던 거 읽어오는데 객체를 읽어오는 것이니까 형변환 필요
			System.out.println(new Date()); // 2초 지난 시간 출력
			System.out.println(d); // write했던 거 출력 즉, 2초 전 시간 출력
		} catch (ClassNotFoundException e) { // 객체를 읽고 쓰는 것이므로 이러한 오류 가능
		} catch (InterruptedException e) { // Thread.sleep 썼으니까 이러한 오류 가능
		} finally {
			if (in != null) { // 물방울이 조금이라도 남아있다면
				in.close(); // 알아서 flush도 되는 행위, 즉 마지막 남은 물방울 까지 빼겠다는 의미
			}
			if (out != null) {
				out.close();
			}
		}

	}

}
