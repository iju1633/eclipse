package ch10class;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaFrame extends JFrame implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;

	public TextAreaFrame() {
		setTitle("Text Area Test");

		textField = new JTextField(30);
		textField.addActionListener(this);

		textArea = new JTextArea(10, 30);
		textArea.setEditable(false);
		
		add(textField, BorderLayout.NORTH);
		
		// add(textArea, BorderLayout.CENTER); 스크롤바 만들면 textArea를 더 이상 add할 필요 없음
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane, BorderLayout.CENTER);

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		textArea.append(text + "\n"); // text 입력과 줄 바꿈 동시에
		textField.selectAll(); // 바로 이어쓸 수 있게 편리하게 바꾼 것
		textArea.setCaretPosition(textArea.getDocument().getLength()); // 이 코드를 append 밑에 추가해주면 항상 아래로 스크롤 된다(스크롤바 있는 경우)
	}

	public static void main(String[] args) {
		new TextAreaFrame();
	}

}
