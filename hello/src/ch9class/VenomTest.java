package ch9class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VenomTest extends JFrame {

	int venom_x = 0;
	int venom_y = 0;

	public VenomTest() {
		setSize(600, 300);
		
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon("C:\\Users\\임재욱\\Desktop\\잡동사니\\배경화면\\venom1.jpg");
		button.setIcon(icon); // 빈칸 가능!
		
		button.setLocation(venom_x, venom_y);

		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true); // 헷갈렸음

		panel.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP:
					venom_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					venom_y += 10;
					break;
				case KeyEvent.VK_LEFT:
					venom_x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					venom_x += 10;
					break;
				}
				button.setLocation(venom_x, venom_y); // 교수님이 빈칸 문제 예시로 이 문장을 들었다!!
			}
		});
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		VenomTest vt = new VenomTest();
	}

}
