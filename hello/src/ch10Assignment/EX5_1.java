package ch10Assignment;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class EX5_1 extends JFrame implements ActionListener { // 누른거 또 누르면 변환 없어야하고 o, x 왔다갔다 하면서 되어야함, 교수님이 빙고 처리는 할 필요없다 하심

	char turn = 'X'; // 시작은 X로 설정
	JButton[][] buttons = new JButton[3][3];
	JPanel panel;

	public EX5_1() {
		setSize(300, 300);
		setTitle("Tic Tac Toe");

		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3, 3, 3)); // Panel의 기본 배치 관리자 : FlowLayout
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j] = new JButton(" "); // 아래의 equals안의 " "와 new JButton("")의 내용물 동일해야 이벤트 처리됨
				panel.add(buttons[i][j]);
				buttons[i][j].addActionListener(this); // 버튼마다 이벤트 등록
			}
		}
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) { // frame에서 이벤트 처리
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((JButton) e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ") == true) {
					if (turn == 'X') {
						buttons[i][j].setText("X");
						turn = 'O';
					} else {
						buttons[i][j].setText("O");
						turn = 'X'; // 서로 왔다갔다 하게끔
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		EX5_1 f = new EX5_1();
	}

}
