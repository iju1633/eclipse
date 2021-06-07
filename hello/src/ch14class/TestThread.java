package ch14class;

class MyRunnable implements Runnable { // R 대문자!
	String Myname;

	public MyRunnable(String name) {
		Myname = name;
	}

	public void run() { // 꼭 정의해야하는 메서드(재정의)
		for (int i = 10; i >= 0; i--) {
			System.out.print(Myname + i + " "); // Myname인지 name인지 헷갈렸음
		}
	}
}

public class TestThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable("A"));
		Thread t2 = new Thread(new MyRunnable("B"));

		t1.start();
		t2.start();
	}

}
