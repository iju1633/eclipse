package ch5class;

import java.util.ArrayList;

class Person {
	String name, tel;
	
	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public void print() {
		System.out.println("(" + name + "," + tel + ")");
	}
}
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("ȫ�浿","1"));
		list.add(new Person("ȫ�浿","2"));
		list.add(new Person("ȫ�浿","3"));
		list.add(new Person("ȫ�浿","4"));
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).print();
		}
	}

}
