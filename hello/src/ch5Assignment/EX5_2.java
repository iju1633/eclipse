package ch5Assignment;

class Plane {

	private String manufacturer;
	private String model;
	private int passengers;
	static int planes = 0;

	Plane() {
		planes++; // 생성자가 두개인데 어떠한 형태의 생성자를 사용하던 항공기 대수를 1씩 늘려야함
	}

	Plane(String manufacturer, String model, int passengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.passengers = passengers;
		planes++; // 생성자가 두개인데 어떠한 형태의 생성자를 사용하던 항공기 대수를 1씩 늘려야함
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public static int getPlanes() {
		return planes;
	}

}

public class EX5_2 {

	public static void main(String[] args) {

		Plane p1 = new Plane("에어버스", "A380", 500); // 다른 생성자 사용,주석으로 처리한 부분과 같은 결과 도출
		Plane p2 = new Plane();
		Plane p3 = new Plane();

//		p1.setManufacturer("에어버스"); 
//		p1.setModel("A380");
//		p1.setPassengers(500);

		p2.setManufacturer("보잉");
		p2.setModel("B777");
		p2.setPassengers(400);

		p3.setManufacturer("보잉");
		p3.setModel("B747");
		p3.setPassengers(300);

		System.out.println(
				"제작사: " + p1.getManufacturer() + " 모델: " + p1.getModel() + " 최대승객: " + p1.getPassengers() + "명");
		System.out.println(
				"제작사: " + p2.getManufacturer() + " 모델: " + p2.getModel() + " 최대승객: " + p2.getPassengers() + "명");
		System.out.println(
				"제작사: " + p3.getManufacturer() + " 모델: " + p3.getModel() + " 최대승객: " + p3.getPassengers() + "명");
		System.out.println("항공기 대수 = " + Plane.getPlanes() + "대");
	}

}
