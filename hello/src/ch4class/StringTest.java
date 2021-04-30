package ch4class;

public class StringTest {

	public static void main(String[] args) {

		String s1 = new String("Java");
		String s2 = new String("Java");

		String s3 = "Java";
		String s4 = "Java";

		int index = 6;
		String s5 = "Hello World";
		char c = s5.charAt(index);
		System.out.println("Length : " + s5.length());
		System.out.println("character at index " + index + " : " + c);

		String s6 = "World";
		index = s5.indexOf(s6); // 처음에 3이라고 생각!! 주의!!
		if (index == -1) {
			System.out.println(s6 + " does not exist");
		} else
			System.out.println(s6 + " index : " + index);

		System.out.println(s1.compareTo(s5)); // J보다 H보다 뒤(2칸 뒤)에 있으므로 값이 2나옴
		System.out.println(s5.compareTo(s1));

		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());

		System.out.println();

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
	}

}
