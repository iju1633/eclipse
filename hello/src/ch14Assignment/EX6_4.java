package ch14Assignment;

class Bus implements Runnable {
	String name;
	static int seat = 10;
	int requiredSeat;

	public Bus(String name, int requiredSeat) { // 객체 생성 시 이름과 요청 좌석수를 매개변수로 받음
		this.name = name;
		this.requiredSeat = requiredSeat;
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getName() { // Thread 이름 출력 시 필요한 메소드
		return name;
	}

	public synchronized void update() { // 가능한 좌석수를 갱신하기 위한 메서드, 가능한 좌석수는 계속 공유되어야 하기에 synchronized 키워드 필요
		seat -= requiredSeat;
	}

	public void run() { // 생성된 Thread에서 실행할 내용
		System.out.println("Thread-" + getName() + " 가 들어왔음.");
		System.out.println("가능한 좌석수 : " + seat + " 요청좌석수 : " + requiredSeat);
		if (seat >= requiredSeat) { // 가능한 좌석 수보다 요청한 좌석 수가 같거나 같으면 예약 가능, 아니면 예약 불가능
			System.out.println("좌석이 가능합니다. 예약하세요.");
			System.out.println(requiredSeat + " 좌석이 예약되었음.");
		} else {
			System.out.println("좌석 예약이 불가능합니다.");
		}
		System.out.println("Thread-" + getName() + " 가 나갑니다.");
		System.out.println("--------------------------------------------------");
		update(); // 좌석 수 갱신
	}

}

public class EX6_4 {

	public static void main(String[] args) throws InterruptedException { // 교수님이 말씀하신 대로 순서는 A C B 순이고 요청좌석 수도 예시와 같이 정해져 있음
		Thread th1 = new Thread(new Bus("A", 5));
		Thread th2 = new Thread(new Bus("C", 2));
		Thread th3 = new Thread(new Bus("B", 4));
		th1.start();
		
		try {
			th1.join();
			th2.start();
			th2.join();
			th3.start();
		} catch (InterruptedException e) {

		}

	}

}