package ch9class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame3 extends JFrame { // 무명클래스로 실현(이름이 없기에 한 번 사용되고 끝이며 이걸 인지하고 있을 때 유용)
	private JButton button;
	private JLabel label;
	int counter = 0;

	public MyFrame3() {
		setSize(400, 150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout()); // panel이 아니라 그냥 frame에다가 넣는 것이므로 기본 배치는 border이다

		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: " + counter);

		button.addActionListener(new ActionListener() { // 무명 클래스 잘 익혀두자, 클래스 이름이 없음,  implements 필요없음
			public void actionPerformed(ActionEvent e) {
				counter++;
				label.setText("현재의 카운터값: " + counter);
			}
		});
		
		/*
		button.addActionListener(e -> { // 람다식!! 메소드 이름이 없음, 시험 가능!
				counter++;
				label.setText("현재의 카운터값: " + counter);
		});
		 */

		add(label); // panel 안만들고 그냥 add해도 됨
		add(button);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
	}

}
