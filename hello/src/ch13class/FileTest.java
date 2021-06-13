package ch13class;

import java.io.*;
import java.util.*;

public class FileTest { // 여때까지 파일을 읽고 쓰기만 했다면 이제는 파일을 조작하고 속성을 조사할 수 있음

	public static void main(String[] args) throws IOException { // 언제 throws IOException 붙이는 지 파악할 것
		String name = "./"; // 현재 디렉토리 의미
		File dir = new File(name); // 현재 디렉토리 파일을 만듦
		String[] fileNames = dir.list(); // 현재 디렉토리의 전체 파일 리스트

		for (String s : fileNames) {
			File f = new File(name + "/" + s); // 현재 디렉토리의 파일 리스트 중 고른 하나의 파일을 만들어서 아래와 같이 정보 출력함
			System.out.println("========================");
			System.out.println("이름: " + f.getName());
			System.out.println("경로: " + f.getPath());
			System.out.println("부모: " + f.getParent());
			System.out.println("절대경로: " + f.getAbsolutePath());
			System.out.println("정규경로: " + f.getCanonicalPath()); // 중요 getCanonicalPath();, getAbsolutePath();
			System.out.println("디렉토리 여부: " + f.isDirectory());
			System.out.println("파일 여부: " + f.isFile());
			System.out.println("========================");
		}
	}

}
