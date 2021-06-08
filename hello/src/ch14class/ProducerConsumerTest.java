package ch14class;

import java.util.Random;

class Buffer {
	private int data;
	private boolean empty = true;

	public synchronized int get() { // data를 공유함, ex 생성하면 소비하고, 기다렸다가 생성되면 소비하고 이런 구조임
		while (empty) { // 비어있으면 계속 기다림
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true; // 비어있지 않다면 소비할 거니까 빈 걸로 다시 만들어야 함
		notifyAll(); // 대기 상태에 있는 쓰레드를 깨운다. notify()라는 함수는 하나의 쓰레드를 깨우는 것인데 대기 상태에 들어간 순서대로 깨우는것이 아니니 사용시 주의
		return data;
	}

	public synchronized void put(int data) {
		while (!empty) { // 하나라도 생산되어있다면 생산하면 안됨 -> 계속 기다림
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false; // 비어있다면 생산할거니까 비어있지 않다고 표기해야 함
		this.data = data; // 매개변수에 넣을 data가 생산된다는 의미!!
		notifyAll();
	}
}

class Producer implements Runnable {
	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			buffer.put(i); // 생산자니까 put하고 print
			System.out.println("생산자: " + i + "번 케잌을 생산하였습니다.");
			try {
				Thread.sleep((int) Math.random() * 100);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Consumer implements Runnable {
	private Buffer buffer;

	public Consumer(Buffer drop) {
		this.buffer = drop;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			buffer.get(); // 이거 없으면 0번 생산한 후에 계속 소비만 계속하네, get을 해줘야지 empty가 true가 되어서 생산을 하는데, get을 안하면 비어있지 않으니까 생산이 안돼서 소비만 계속 하는 것임
			System.out.println("소비자: " + i + "번 케잌을 소비하였습니다.");
			try {
				Thread.sleep((int) Math.random() * 100);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ProducerConsumerTest {

	public static void main(String[] args) {
		Buffer buffer = new Buffer(); // 의외로 놓치기 좋은 부분
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();
	}

}
