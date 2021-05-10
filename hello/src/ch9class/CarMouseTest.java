package ch9class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CarMouseTest extends JFrame {

	int x = 150;
	int y = 150;

	public CarMouseTest() {
		setSize(600,300);
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon("C:\\Users\\임재욱\\Desktop\\잡동사니\\배경화면\\venom1.jpg");
		button.setIcon(icon);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		
		/*
		panel.addMouseListener(new MouseListener() { // MouseListener() 는 인터페이스!
			public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					button.setLocation(x, y);
			}
			public void mouseReleased(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		*/
		
		panel.addMouseListener(new MouseAdapter() { // 어댑터는 class라 재정의하면 됨!
			public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					button.setLocation(x, y);
			}
		});
		
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		CarMouseTest c = new CarMouseTest();
	}

}
