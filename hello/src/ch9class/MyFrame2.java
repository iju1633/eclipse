package ch9class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame implements ActionListener { // frame에서 이벤트 처리
	private JButton button;
	private JLabel label;
	int counter = 0;

	public void actionPerformed(ActionEvent e) { // 이벤트 클래스를 손코딩하는 시험 가능!
		counter++;
		label.setText("현재의 카운터값: " + counter);
	}

	public MyFrame2() {
		setSize(400, 150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout()); // panel이 아니라 그냥 frame에다가 넣는 것이므로 기본 배치는 border이다

		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: " + counter);

		button.addActionListener(this); // 이벤트 등록 : 교수님이 핵심이라고 하심, 빈칸 출제 가능

		add(label); // panel 안만들고 그냥 add해도 됨
		add(button);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}

}
