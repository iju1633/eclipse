package ch11class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mini extends JFrame implements ActionListener { // 캡쳐한 대로 다시 코딩해볼 것(구조가 좀 다름)

	int cnt = 0;

	public Mini() {
		setSize(600, 200);

		setLayout(new BorderLayout());
		JButton b = new JButton("신호 변경");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);

		add(new MyPanel());
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (++cnt >= 3) { // cnt 값이 120120120 반복됨, 맨 처음에 누르지 않았으니 0으로 세팅
			cnt = 0;
		}
		System.out.println(cnt);
		repaint();
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawOval(100, 50, 50, 50);
			g.drawOval(150, 50, 50, 50);
			g.drawOval(200, 50, 50, 50);

			if (cnt == 0) {
				g.setColor(Color.red);
				g.fillOval(100, 50, 50, 50);
			} else if (cnt == 1) {
				g.setColor(Color.YELLOW);
				g.fillOval(150, 50, 50, 50);
			} else if (cnt == 2) {
				g.setColor(Color.GREEN);
				g.fillOval(200, 50, 50, 50);
			}
		}
	}

	public static void main(String[] args) {
		new Mini();
	}

}
