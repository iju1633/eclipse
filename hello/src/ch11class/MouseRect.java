package ch11class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseRect extends JFrame { // repaint()가 필요한 경우
	// 프로그램 내에서 컴포넌트의 모양과 위치를 변경한 경우
	// repaint()를 호출하면 자바 플랫폼에 의해 컴포넌트의 paintComponent()가 호출됨

	int x, y;

	class MyPanel extends JPanel {
		public MyPanel() {
			addMouseListener(new MouseAdapter() { // 이벤트 등록할 곳이 panel이기 때문에 button.addActionListener와 같은 형태 띄지 않음
				public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint(); // 적절한 시기에 paintComponent()를 호출한다. 직접 호출하면 안되는 이유 :paintComponent()는 페인팅 메카니즘에 의해 자동으로 호출됨
				}
			});
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // 필수인 이유를 알아낼 것 : repaint()가 불려지면 이 컴포넌트는 새로운 위치에 다시 그려지지만 이전 위치에 있던 자신의 모양이 남아 있기 때문에 부모 컴포넌트의 repaint()를 호출하는 것이 좋음
			g.setColor(Color.orange);
			g.fillRect(x, y, 100, 100);
		}
	}

	public MouseRect() {
		setTitle("Basic Painting");
		setSize(600, 200);
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MouseRect mr = new MouseRect();
	}

}
