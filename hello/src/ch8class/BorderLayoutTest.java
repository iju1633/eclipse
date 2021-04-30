package ch8class;

import javax.swing.*; // set이랑 J 붙은 것
import java.awt.*; // BorderLayout 포함됨

public class BorderLayoutTest extends JFrame {

	public BorderLayoutTest() {
		setTitle("BorderLayoutTest");
		setSize(300, 200);
		setLayout(new BorderLayout());

		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("SOUTH");
		JButton b3 = new JButton("EAST");
		JButton b4 = new JButton("WEST");
		JButton b5 = new JButton("CENTER");

		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		BorderLayoutTest f = new BorderLayoutTest();
	}

}
