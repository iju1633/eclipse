package ch10Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EX5_2 extends JFrame implements ActionListener { // 조건과 같이 3개의 패널(above, middle, bottom)을 통해 구현할 예정

	JButton[] buttons;
	JTextField text;
	JButton clear;
	int oldNum, temp; // 연산의 첫 번째 인수와 두 번째 인수를 저장할 변수
	double result = 0.0; // 나눗셈은 결과가 실수가 될 수도 있기에 double형으로 설정
	String func = ""; // 연산자가 저장될 변수

	public EX5_2() {
		setSize(285, 205);
		setTitle("계산기");

		JPanel above = new JPanel(); // 텍스트 필드를 담을 panel
		text = new JTextField(30);
		above.add(text);
		add(above, BorderLayout.NORTH);

		JPanel middle = new JPanel(); // C 버튼을 담을 panel
		middle.setLayout(new BorderLayout()); // C 버튼을 왼쪽으로 하기 위한 설정
		clear = new JButton("C       ");
		clear.addActionListener(this);
		middle.add(clear);
		add(middle, BorderLayout.WEST); // C 버튼을 왼쪽으로 하기 위한 설정

		JPanel bottom = new JPanel(); // 숫자와 C를 제외한 연산기호 버튼을 담을 panel
		bottom.setLayout(new GridLayout(0, 4, 2, 2));
		buttons = new JButton[16];

		// 버튼의 내용물(그림과 같이 버튼의 왼쪽 정렬을 위해 일부러 공간을 만듦
		String[] b = { "7       ", "8       ", "9       ", "/       ", "4       ", "5       ", "6       ", "*       ",
				"1       ", "2       ", "3       ", "-       ", "0       ", "+/-     ", "=       ", "+       " };

		for (int i = 0; i < 16; i++) {
			buttons[i] = new JButton(b[i]); // 버튼 생성
			buttons[i].addActionListener(this); // 이벤트 등록
			bottom.add(buttons[i]); // panel에 추가
		}
		add(bottom, BorderLayout.SOUTH);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == clear) {
			text.setText("");
			text.setFocusable(true); // 다음 연산을 편하게 하기 위한 설정
			text.requestFocus();
		} else if (e.getSource() == buttons[0]) { // 숫자
			oldNum = 7;
			text.setText(text.getText() + oldNum); // 텍스트필드에 수식들이 차례차례 보여져야하기 때문에 다음과 같이 설정
		} else if (e.getSource() == buttons[1]) {
			oldNum = 8;
			text.setText(text.getText() + oldNum);
		} else if (e.getSource() == buttons[2]) {
			oldNum = 9;
			text.setText(text.getText() + oldNum);
		} else if (e.getSource() == buttons[4]) {
			oldNum = 4;
			text.setText(text.getText() + oldNum);
		} else if (e.getSource() == buttons[5]) {
			oldNum = 5;
			text.setText(text.getText() + oldNum);
		} else if (e.getSource() == buttons[6]) {
			oldNum = 6;
			text.setText(text.getText() + oldNum);
		} else if (e.getSource() == buttons[8]) {
			oldNum = 1;
			text.setText(text.getText() + oldNum);
		} else if (e.getSource() == buttons[9]) {
			oldNum = 2;
			text.setText(text.getText() + oldNum);
		} else if (e.getSource() == buttons[10]) {
			oldNum = 3;
			text.setText(text.getText() + oldNum);
		} else if (e.getSource() == buttons[12]) {
			oldNum = 0;
			text.setText(text.getText() + oldNum);
		} else if (e.getSource() == buttons[3]) { // 연산자
			func = "/";
			temp = oldNum; // 첫 번째 인수와 두 번째 인수가 다를 수 있기에 다음과 같이 설정
			text.setText(text.getText() + func);
		} else if (e.getSource() == buttons[7]) {
			func = "*";
			temp = oldNum;
			text.setText(text.getText() + func);
		} else if (e.getSource() == buttons[11]) {
			func = "-";
			temp = oldNum;
			text.setText(text.getText() + func);
		} else if (e.getSource() == buttons[15]) {
			func = "+";
			temp = oldNum;
			text.setText(text.getText() + func);
		} else if (e.getSource() == buttons[13]) { // +/- 버튼은 사용 않음
		} else if (e.getSource() == buttons[14]) { // = 버튼을 눌렀을 때의 경우
			if (func.equals("/")) { // 연산자에 따라 결과값이 바뀜
				result = temp * 1.0 / oldNum; // double값으로 결과를 보이기 위해 1.0을 곱함, temp는 첫 번째 숫자, oldNum은 두 번째로 선택된 숫자!
				text.setText(temp + func + oldNum + "=" + result);
			} else if (func.equals("*")) {
				result = temp * oldNum;
				text.setText(temp + func + oldNum + "=" + (int) result); // 나머지 연산자들은 값이 다 int이므로 double로 설정했던 result만 int로 형변환
			} else if (func.equals("-")) {
				result = temp - oldNum;
				text.setText(temp + func + oldNum + "=" + (int) result);
			} else if (func.equals("+")) {
				result = temp + oldNum;
				text.setText(temp + func + oldNum + "=" + (int) result);
			}
		}
	}

	public static void main(String[] args) {
		EX5_2 f = new EX5_2();
	}

}