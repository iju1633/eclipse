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
		ImageIcon icon = new ImageIcon("C:\\Users\\임재욱\\Desktop\\잡동사니\\배경화면\\Fox.png"); // 이 과정 확실히 알 것!!
		image = icon.getImage();
	}

	public void draw(Graphics g) { // 다시 그릴 건데 선택되지 않은 것만 다시 repaint한다는 마인드, draw()메소드의 위치 생소하니 기억할 것
		if (isSelected == 0) {
			g.drawImage(image, x, y, W, H, null); // null은 imageObserver에 해당, null 자리가 ImageObserver인데 this를 하게되면
													// Monster2를 가리키는 것이고 Monster2는 그림을 그릴 수 있는 컴포넌트가 아닌 객체 class이므로 대체로
													// this 적지만 이번에는 null해야함.
		}
	}

	public void selected(int x, int y) {
		if ((this.x < x && this.x + W > x) && (this.y < y && this.y + H > y)) { // if 이미지 크기 안을 클릭한다면 then selected.
			isSelected = 1;
		}
	}
}

public class Mini extends JPanel {
	int x, y;
	ArrayList<Monster2> monsters = new ArrayList<Monster2>(); // 객체를 배열에 저장

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

	public void paintComponent(Graphics g) { // paintComponent 철자 조심하라했으니 요 메서드 전체 쓰는 거 가능!!!
		super.paintComponent(g);

		for (int i = 0; i < monsters.size(); i++) {
			Monster2 m = monsters.get(i); // 배열안에 있는 객체를 하나 가져오는 것 의미
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
