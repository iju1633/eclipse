package ch6class;

class car {
	int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

class SportsCar extends car {
	boolean turbo;
	
	public void setTurbo(boolean flag) {
		turbo = flag;
	}
}

public class SportsCarTest {

	public static void main(String[] args) {
		
		SportsCar sc = new SportsCar();
		sc.speed = 10;
		sc.setSpeed(60);
		// System.out.println(sc.speed); 60À¸·Î °»½ÅµÊ
		sc.setTurbo(true);
	}

}
