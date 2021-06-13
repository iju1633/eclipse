package ch14class;

class Counter {
	private int value = 0;

	public synchronized void increment() { // synchronized 없는 경우에는 3, 4, 5 등 막 나옴(교수님이 없는 경우도 해보라 하심)
		value++;
	}

	public synchronized void decrement() {
		value--;
	}

	public synchronized void printCounter(String name) { // 이 방법이 있네
		System.out.println(name + ":" + value);
	}
}

class MyThread extends Thread {
	Counter sharedCounter;
	String name;

	public MyThread(String str, Counter c) { // 이부분이 핵심!!!
		name = str;
		this.sharedCounter = c;
	}

	public void run() {
		int i = 0;
		while (i < 100) {
			sharedCounter.increment();
			sharedCounter.decrement();

			if (i % 20 == 0) { // i = 0, 20, 40, 60, 80 이렇게 5번 일어나지만 각각의 경우마다 스레드가 4개 존재하므로 20줄 나온 것임
				sharedCounter.printCounter(name);
				System.out.println(i);
			}

			try {
				Thread.sleep((int) Math.random() * 2);
			} catch (InterruptedException e) {
			}
			i++;
		}
	}
}

public class CounterTest {

	public static void main(String[] args) {
		Counter c = new Counter();
		Thread t1, t2, t3, t4;
		t1 = new MyThread("A", c);
		t1.start();
		t2 = new MyThread("B", c);
		t2.start();
		t3 = new MyThread("C", c);
		t3.start();
		t4 = new MyThread("D", c);
		t4.start();
		
		/*
		 * new MyThread(c).start(); 
		 * new MyThread(c).start(); 
		 * new MyThread(c).start();
		 * new MyThread(c).start();
		 */
	}

}
