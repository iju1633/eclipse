package ch9class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame { // MyListener 클래스 만들어서 이벤트 처리
	private JButton button;
	private JLabel label;
	int counter = 0;

	class MyListener implements ActionListener { // 내장 클래스로 구현했고, implements ActionListener한 것만 이벤트로 등록 가능
		public void actionPerformed(ActionEvent e) { // 이벤트 클래스를 손코딩하는 시험 가능!
			counter++;
			label.setText("현재의 카운터값: " + counter);
		}
	}

	public MyFrame() {
		setSize(400, 150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout()); // panel이 아니라 그냥 frame에다가 넣는 것이므로 기본 배치는 flow이다

		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: " + counter);

		button.addActionListener(new MyListener()); // 이벤트 등록 : 교수님이 핵심이라고 하심, 빈칸 출제 가능

		add(label); // panel 안만들고 그냥 add해도 됨
		add(button);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
