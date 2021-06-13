package ch11class;

import javax.swing.*;
import java.awt.*;

class Slice {
	double value;
	Color color;

	public Slice(double value, Color color) { // 생성자 변수 넣어서 설정
		this.value = value;
		this.color = color;
	}
}

class MyPanel extends JPanel { // 이전 실습들은 이벤트 처리도 해야했기에 public class 안에 다 실현되었음
	Slice[] list = { new Slice(10, Color.red), new Slice(20, Color.blue), new Slice(30, Color.orange),
			new Slice(40, Color.green) }; // Slice 객체들이 들어가는 array 바로 선언

	public void paintComponent(Graphics g) { // 위치는 JPanel을 extends한 class안!
		super.paintComponent(g);
		double total = 0.0D; // double 값을 의미한다는 뜻
		for (Slice s : list) { // total 구하는 과정
			total += s.value;
		}
		double currValue = 0.0;
		int start = 0;
		for (Slice s : list) {
			start = (int) (currValue * 360 / total); // 시작점과 각도 모두 360까지 존재!
			int angle = (int) (s.value * 360 / total);

			g.setColor(s.color); // 설정한 색깔에 맞게!!!
			g.fillArc(100, 50, 200, 200, start, angle); // 칠해줌
			currValue += s.value; // 시작점을 바꿔주어야하므로 필수적인 코드!!!
		}
	}
}

public class PieChart extends JFrame {

	public PieChart() {
		setSize(600, 300);
		setTitle("Pie Chart");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel()); // 핵심
	}

	public static void main(String[] args) {
		PieChart c = new PieChart();
	}

}
