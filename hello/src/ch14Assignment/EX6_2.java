package ch14Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Car {
	int x = 0;
	int y = 0;
	Color color;
	int size;

	public Car(String color, int size, int x, int y) { // 색상, 크기, 위치를 매개변수로 받는 생성자
		this.size = size;
		this.x = x;
		this.y = y;
	}

	public int getX() { // 예시 그림에서 차 윗부분의 빨간 사각형의 좌측 상단을 기준으로 x좌표를 가져오는 메서드
		return x;
	}

	public int getY() { // 예시 그림에서 차 윗부분의 빨간 사각형의 좌측 상단을 기준으로 y좌표를 가져오는 메서드
		return y;
	}

	public int getSize() { // 자동차의 크기를 설정하는 부분
		return size;
	}

}

public class EX6_2 extends JFrame implements ActionListener {

	Car c1;
	Car c2;
	Car c3;

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) { // // 예시 그림에서 차 윗부분의 빨간 사각형의 좌측 상단이 좌표의 기준이며, 총 3대 구현
			super.paintComponent(g);
			
			g.setColor(Color.red);
			g.fillRect(c1.getX(), c1.getY(), 60 + c1.getSize(), 20 + c1.getSize());
			g.setColor(Color.yellow);
			g.fillRect(c1.getX() - 11, c1.getY() + 20, 96 + c1.getSize(), 30 + c1.getSize());
			g.setColor(Color.red);
			g.fillOval(c1.getX(), c1.getY() + 45, 30 + c1.getSize(), 30 + c1.getSize());
			g.fillOval(c1.getX() + 45, c1.getY() + 45, 30 + c1.getSize(), 30 + c1.getSize());

			g.setColor(Color.red);
			g.fillRect(c2.getX(), c2.getY(), 60 + c2.getSize(), 20 + c2.getSize());
			g.setColor(Color.yellow);
			g.fillRect(c2.getX() - 11, c2.getY() + 20, 96 + c2.getSize(), 30 + c2.getSize());
			g.setColor(Color.red);
			g.fillOval(c2.getX(), c2.getY() + 45, 30 + c2.getSize(), 30 + c2.getSize());
			g.fillOval(c2.getX() + 45, c2.getY() + 45, 30 + c2.getSize(), 30 + c2.getSize());

			g.setColor(Color.red);
			g.fillRect(c3.getX(), c3.getY(), 60 + c3.getSize(), 20 + c3.getSize());
			g.setColor(Color.yellow);
			g.fillRect(c3.getX() - 11, c3.getY() + 20, 96 + c3.getSize(), 30 + c3.getSize());
			g.setColor(Color.red);
			g.fillOval(c3.getX(), c3.getY() + 45, 30 + c3.getSize(), 30 + c3.getSize());
			g.fillOval(c3.getX() + 45, c3.getY() + 45, 30 + c3.getSize(), 30 + c3.getSize());

		}
	}

	public EX6_2() {
		setSize(600, 380);
		setTitle("CarGame");

		c1 = new Car("Color.yellow", 10, 50, 30); // 색상을 매개변수로 받지만 변화시키진 않음, 색깔을 변화시키지 않아도 된다고 하심, 예시와 최대한 비슷하게 구현
		c2 = new Car("Color.red", 10, 100, 150);
		c3 = new Car("Color.green", 10, 50, 250);

		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Timer timer = new Timer(100, this); // timer을 설정해서 100ms 마다 이벤트 구현되게 처리함
		timer.start();
	}

	public void actionPerformed(ActionEvent e) { // 왼쪽에서 오른쪽으로 움직일 수 있도록 x좌표에다가 10씩 더하고 repaint();
		c1.x += 10;
		c2.x += 10;
		c3.x += 10;
		repaint();
	}

	public static void main(String[] args) {

		EX6_2 f = new EX6_2();
	}

}