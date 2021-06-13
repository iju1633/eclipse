package ch13class;

import java.io.*;
import java.util.Scanner;
public class ByteStreamsLab {

	public static void main(String[] args) throws IOException { // throws IOException 없으니까 InputStream, OutputStream 에러나네(Unhandled exception type FileNotFoundException)
		Scanner sc = new Scanner(System.in);
		System.out.print("원본 파일 이름을 입력하시오: ");
		
		String inputFileName = sc.next();
		System.out.println("복사 파일 이름을 입력하시오: ");
		String outputFileName = sc.next();
		
		try(InputStream inputStream = new FileInputStream(inputFileName);
				OutputStream outputStream = new FileOutputStream(outputFileName);){
			
			int c;
			while((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		}
		System.out.println(inputFileName + "을 " + outputFileName + "로 복사하였습니다. ");
	}

}
