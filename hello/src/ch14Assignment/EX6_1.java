package ch14Assignment;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // 주사위 눈의 모양 roundRect 으로 바꿀 것!

class Dice {
	int x = 0;
	int y = 0;
	Color color;
	int size;
	int value;

	public Dice(int x, int y, Color color, int value) { // 위치, 색상, 주사위 면을 받는 생성자
		this.x = x;
		this.y = y;
		this.color = color;
		this.value = value;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setValue() {
		value = (int) (Math.random() * 6) + 1; // 1부터 6까지 랜덤으로 주사위 면 설정
	}

	public int getValue() {
		return value;
	}

}

public class EX6_1 extends JFrame {
	Dice d1;
	Dice d2;

	class MyPanel extends JPanel {

		public void paintComponent(Graphics g) { // 주사위 눈은 예시와 최대한 비슷하게 fillRoundRect으로 구현

			switch (d1.getValue()) { // 첫 번째 주사위에 대한 그래픽 구현, 주사위 눈 마다 알맞은 그래픽이 그려져야 함
			case 1:

				g.drawRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d1.getX() + 20, d1.getY() + 20, 10, 10, 3, 3);
				break;

			case 2:
				g.drawRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d1.getX() + 5, d1.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 35, d1.getY() + 35, 10, 10, 3, 3);
				break;

			case 3:
				g.drawRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d1.getX() + 5, d1.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 20, d1.getY() + 20, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 35, d1.getY() + 35, 10, 10, 3, 3);
				break;

			case 4:
				g.drawRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d1.getX() + 5, d1.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 5, d1.getY() + 35, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 35, d1.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 35, d1.getY() + 35, 10, 10, 3, 3);
				break;

			case 5:
				g.drawRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d1.getX() + 5, d1.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 5, d1.getY() + 35, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 20, d1.getY() + 20, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 35, d1.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 35, d1.getY() + 35, 10, 10, 3, 3);
				break;

			case 6:
				g.drawRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d1.getX(), d1.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d1.getX() + 5, d1.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 5, d1.getY() + 20, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 5, d1.getY() + 35, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 35, d1.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 35, d1.getY() + 20, 10, 10, 3, 3);
				g.fillRoundRect(d1.getX() + 35, d1.getY() + 35, 10, 10, 3, 3);
				break;
			}

			switch (d2.getValue()) { // 두 번째 주사위에 대한 그래픽 구현, 주사위 눈 마다 알맞은 그래픽이 그려져야 함
			case 1:
				g.drawRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d2.getX() + 20, d2.getY() + 20, 10, 10, 3, 3);
				break;

			case 2:
				g.drawRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d2.getX() + 5, d2.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 35, d2.getY() + 35, 10, 10, 3, 3);
				break;

			case 3:
				g.drawRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d2.getX() + 5, d2.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 20, d2.getY() + 20, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 35, d2.getY() + 35, 10, 10, 3, 3);
				break;

			case 4:
				g.drawRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d2.getX() + 5, d2.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 5, d2.getY() + 35, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 35, d2.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 35, d2.getY() + 35, 10, 10, 3, 3);
				break;

			case 5:
				g.drawRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d2.getX() + 5, d2.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 5, d2.getY() + 35, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 20, d2.getY() + 20, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 35, d2.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 35, d2.getY() + 35, 10, 10, 3, 3);
				break;

			case 6:
				g.drawRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.white);
				g.fillRect(d2.getX(), d2.getY(), 50, 50);
				g.setColor(Color.black);
				g.fillRoundRect(d2.getX() + 5, d2.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 5, d2.getY() + 20, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 5, d2.getY() + 35, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 35, d2.getY() + 5, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 35, d2.getY() + 20, 10, 10, 3, 3);
				g.fillRoundRect(d2.getX() + 35, d2.getY() + 35, 10, 10, 3, 3);
				break;
			}

		}
	}

	public EX6_1() {
		setSize(650, 250);
		setTitle("DiceGame");

		d1 = new Dice(200, 70, Color.yellow, 4); // 위치와 색상, 그리고 주사위 눈 설정해서 생성
		d2 = new Dice(350, 70, Color.green, 3);

		add(new MyPanel());

		addMouseListener(new MyMouseAdapter()); // mousePressed의 경우만 처리하기 위해 어댑터 사용

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) { // 마우스 눌릴 때마다 주사위 눈 갱신하고 새로 그려야 함
			d1.setValue();
			d2.setValue();
			repaint();
		}
	}

	public static void main(String[] args) {
		EX6_1 f = new EX6_1();

	}

}
