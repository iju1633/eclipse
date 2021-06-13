package ch11class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyPanel3 extends JPanel implements ActionListener { // 구조 이해할 것

	boolean flag = false;
	private int light_number = 0;

	public MyPanel3() {
		setLayout(new BorderLayout());
		JButton b = new JButton("신호 변경");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(100, 10, 100, 100);
		g.drawOval(200, 10, 100, 100);
		g.drawOval(300, 10, 100, 100);
		
		if (light_number == 0) {
			g.setColor(Color.red);
			g.fillOval(100, 10, 100, 100);
		} else if (light_number == 1) {
			g.setColor(Color.YELLOW);
			g.fillOval(200, 10, 100, 100);
		} else {
			g.setColor(Color.GREEN);
			g.fillOval(300, 10, 100, 100);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (++light_number >= 3) { // light_number 값이 2인 상태에서 버튼 누르면 0되게 하기 위함
			light_number = 0;
		}
		repaint();
	}

}

public class Mini extends JFrame {
	public Mini() {
		add(new MyPanel3());
		setSize(600, 200);
		setTitle("Traffic Sign");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Mini();
	}

}
