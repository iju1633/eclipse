package ch8class;

import javax.swing.*; // swing은 awt와 구별하기 위해 앞에 J 붙음
import java.awt.*; // FlowLayout, Color 해당

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {
		setSize(300, 150);
		setLocation(200, 300);
		setTitle("MyFrame");
		setLayout(new FlowLayout()); // FlowLayout(FlowLayout.LEFT, 10, 20); -> 왼쪽 정렬, 좌우간격 10, 상하간격 20
		getContentPane().setBackground(Color.yellow);
		JButton b1 = new JButton("확인");
		JButton b2 = new JButton("취소");
		add(b1);
		add(b2);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		FlowLayoutTest mf = new FlowLayoutTest();
	}

}
