package ch9class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGame extends JFrame {

	int n1, n2, n3;
	JButton b1, b2, b3;

	public SimpleGame() {
		setTitle("Simple Game Machine");
		setSize(300, 150);

		JPanel panel = new JPanel();
		b1 = new JButton("" + n1);
		panel.add(b1);
		b2 = new JButton("" + n2);
		panel.add(b2);
		b3 = new JButton("" + n3);
		panel.add(b3);

		panel.requestFocus(); // 키 이벤트를 받을 컴포넌트를 강제로 설정  --> 빈칸 쌉 가능!
		panel.setFocusable(true); // 이벤트를 받을 컴포넌트가 여러 개 있을 때 우선적으로 받기 위함

		panel.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode(); // getKeycode() : int 값
				if (keyCode == KeyEvent.VK_ENTER) {
					n1 = (int) (Math.random() * 10);
					n2 = (int) (Math.random() * 10);
					n3 = (int) (Math.random() * 10);
					b1.setText("" + n1); // 빈칸 가능!
					b2.setText("" + n2);
					b3.setText("" + n3);
				}
			}

			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SimpleGame sg = new SimpleGame();
	}

}
