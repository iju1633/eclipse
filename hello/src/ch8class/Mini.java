package ch8class;

import javax.swing.*;
import java.awt.*;

public class Mini extends JFrame {

	String[] labels = { "Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%", "1", "2",
			"3", "-", "1/x", "0", "+/-", ".", "+", "=" };

	public Mini() {
		setTitle("");
		setSize(550, 210);
		setLocation(310, 200);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, 1));
		JPanel panelA = new JPanel();

		JTextField text = new JTextField(55);

		panelA.setLayout(new GridLayout(0, 5, 3, 3));
		JButton[] button = new JButton[25];
		for (int i = 0; i < 25; i++) {
			button[i] = new JButton(labels[i]);
			button[i].setBackground(Color.yellow);
			if (i == 3 || i == 4 || i == 8 || i == 9 || i == 13 || i == 14 || i == 18 || i == 19 || i == 23 || i == 24) {
				button[i].setForeground(Color.red);
			}
		}
		for (int i = 0; i < 25; i++) {
			panelA.add(button[i]);
		}

		panel.add(text);
		panel.add(panelA);
		add(panel);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Mini m = new Mini();
	}

}
