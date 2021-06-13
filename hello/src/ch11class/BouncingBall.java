package ch11class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JFrame implements ActionListener {

	int x, y;
	private int xSpeed = 3, ySpeed = 3; // 조금씩 움직이느냐 크게 움직이느냐 차이
	private static final int WIDTH = 600;
	private static final int HEIGHT = 200;
	private static final int PERIOD = 10; // 천천히 움직이느냐 빨리 움직이느냐

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.orange);
			g.fillOval(x, y, 40, 40);
		}
	}

	public void update() { // 이해할 것
		x += xSpeed; // 빈칸으로 내기 좋음
		y += ySpeed;
		if (x > WIDTH - 40 || x < 0) { // 오른쪽 벽 || 왼쪽 벽
			xSpeed = -xSpeed; // 튕겨나가도록 부호를 반대로 설정(핵심)
		}
		if (y > HEIGHT - 40 || y < 0) { // 아래 벽 || 위쪽 벽
			ySpeed = -ySpeed;
		}
	}

	public BouncingBall() {
		setSize(WIDTH, HEIGHT);
		setTitle("Bouncing Ball");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new MyPanel());
		Timer timer = new Timer(PERIOD, this); // 액션 이벤트 호출, 핵심 부분!
		timer.start(); // 놓치기 쉬움
	}

	public void actionPerformed(ActionEvent e) { // 이벤트에서 update와 repaint
		update();
		repaint();
	}

	public static void main(String[] args) {
		BouncingBall bb = new BouncingBall();
	}

}
