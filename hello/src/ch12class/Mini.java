package ch12class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Monster2 {
	int x, y, hp;
	Image image;
	int isSelected;
	static final int W = 50, H = 50;

	public Monster2(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
		ImageIcon icon = new ImageIcon("C:\\Users\\임재욱\\Desktop\\잡동사니\\배경화면\\Fox.png"); // 이 과정 확실히 알 것
		image = icon.getImage();
	}

	public void draw(Graphics g) {
		if (isSelected == 0) {
			g.drawImage(image, x, y, W, H, null); // null은 imageObserver에 해당
		}
	}

	public void selected(int x, int y) {
		if ((this.x < x && this.x + W > x) && (this.y < y && this.y + H > y)) {
			isSelected = 1;
		}
	}
}

public class Mini extends JPanel {
	int x, y;
	ArrayList<Monster2> monsters = new ArrayList<Monster2>();

	public Mini() {
		for (int i = 0; i < 10; i++) {
			monsters.add(new Monster2((int) (Math.random() * 550), (int) (Math.random() * 350), 100));
		}

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();

				repaint();
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < monsters.size(); i++) {
			Monster2 m = monsters.get(i);
			m.selected(x, y);
			m.draw(g);
		}
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 400);
		f.setTitle("Monster Catch Game");
		f.add(new Mini());
		f.setVisible(true);
	}

}
