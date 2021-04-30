package ch2class;

public class Ex2by3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double light_speed = 30e4; // 30 x 10^4
		double distance = 40e12;
		
		double secs = distance/light_speed;
		
		double light_year = secs/(60.0*60.0*24*365.0);
		System.out.println("�ɸ��� �ð��� " + light_year + "�����Դϴ�.");
	}

}
