package ch9class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mini extends JFrame implements ActionListener { // 누른거 또 누르면 변환 없어야하고 o, x 왔다갔다 하면서 되어야함

	char turn = 'X';
	JButton[][] buttons = new JButton[3][3];
	JPanel panel;

	public Mini() {
		setSize(300, 300);
		setTitle("Tic Tac Toe");

		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3, 3, 3));
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j] = new JButton(" "); // 아래의 equals안의 " "와 new JButton("")의 내용이 서로 달랐기 때문에 이벤트 안됐었음
				panel.add(buttons[i][j]);
				buttons[i][j].addActionListener(this);
			}
		}
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ") == true) {
					if (turn == 'X') {
						buttons[i][j].setText("X");
						turn = 'O';
					} else {
						buttons[i][j].setText("O");
						turn = 'X';
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Mini m = new Mini();
	}

}
