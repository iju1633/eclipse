package ch11class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; // 동적 배열인 Vector를 사용하기 위함

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class MouseDragged extends JFrame { // 이 문제할 때 시험에서 실행결과 알려주고 빈칸을 채우라하는 문제낼 수 있다고 언급하심. 즉, 이 문제 전체 손코딩 해볼 것!!

	int x, y;
	Vector<Point> list = new Vector<>(); // import java.util.*; 필요

	class MyPanel extends JPanel {
		public MyPanel() { // 패널에다가 이벤트 추가해야함
			addMouseMotionListener(new MouseMotionAdapter() { // 익명 클래스에 해당, https://ssg4089.tistory.com/11 참고할 것
				public void mouseDragged(MouseEvent event) { // 마우스가 드래스 될때마다 좌표를 배열에 저장하고 paintComponent 호출
					x = event.getX();
					y = event.getY();
					list.add(new Point(x, y));
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (Point p : list) { // 배열에 있는 모든 좌표 활용하여 원 그림
				g.fillOval(p.x, p.y, 4, 4);
			}
		}
	}

	public MouseDragged() {
		setSize(600, 150);
		setTitle("My Paint");
		setVisible(true);
		add(new MyPanel()); // 까먹기 쉬움
	}

	public static void main(String[] args) {
		MouseDragged md = new MouseDragged();
	}

}
