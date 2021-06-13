package ch10class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldFrame extends JFrame { // 차근차근 뭐가 필요한 지 생각하며 다시 구헌해 볼 것
	private JButton button;
	private JTextField text, result;
	
	public TextFieldFrame() {
		setSize(280,150);
		setTitle("제곱 계산하기");
		ButtonListener listener = new ButtonListener(); // class만들어서 이벤트 처리할 것임을 알 수 있음
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력: "));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);
		
		panel.add(new JLabel("제곱한 값: "));
		result = new JTextField(15);
		result.setEditable(false); // 빈칸 가능!!
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class ButtonListener implements ActionListener { // 이런 거 손코딩 무조건이다
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button || e.getSource() == text) { // 버튼 누르거나 엔터 누를 경우
				String input = text.getText();
				int output = Integer.parseInt(input); // 숫자로 바꿔야 제곱을 할 수 있다.
				result.setText("" + output * output); // String으로 만들어주기 위해 일부러 "" 더함!!
				text.requestFocus(); // 생각 못했던 부분, 바로 다음 숫자 입력할 수 있도록 하기 위함
			}
		}
	}

	public static void main(String[] args) {
		new TextFieldFrame();
	}

}
