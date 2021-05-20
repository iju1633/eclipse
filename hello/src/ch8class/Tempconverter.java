package ch8class;

import javax.swing.*;
import java.awt.*;

public class Tempconverter extends JFrame {

	public Tempconverter() {
		JPanel panel = new JPanel();
		add(panel);

		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환");

		panel.add(label1); // 순서 중요!
		panel.add(field1);

		panel.add(label2);
		panel.add(field2);

		panel.add(button);

		setSize(270, 150);
		setTitle("온도변환기");
		setLocation(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Tempconverter tc = new Tempconverter();
	}

}
