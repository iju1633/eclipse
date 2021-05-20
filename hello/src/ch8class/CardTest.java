package ch8class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
	// 기본 배치관리자 -> Frame, Dialog : Border | Panel, Applet : Flow
	JPanel panel;
	Cards cards;

	public MyFrame() {
		setTitle("CardLayoutTest");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5, 0, 0)); // 5열
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("종료", panel);
		add(panel, "North");
		cards = new Cards();
		add(cards, "Center"); // add(cards, BorderLayout.CENTER
		setVisible(true);
	}

	void addButton(String str, Container target) { // 손코딩 or 빈칸 확률 높음
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}

	public void actionPerformed(ActionEvent e) { // 손코딩 or 빈칸 가능
		if (e.getActionCommand().equals("종료")) {
			System.exit(0);
		} else if (e.getActionCommand().equals("<<")) { // getActionCommand()는 Component의 텍스트 값을 가져오고, getSource()는 변수명을 구분한다
			cards.layout.first(cards); // 아래에서 setLayout(new CardLayout()); 이렇게 하면 layout이 만들어지지 않기에 이벤트 없음
		} else if (e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
		} else if (e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
		} else if (e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}
	}

	private class Cards extends JPanel {
		CardLayout layout;

		public Cards() {
			layout = new CardLayout(); // 카드 레이아웃 설정, 빈칸 가능!!
			setLayout(layout);
			for (int i = 0; i <= 10; i++) {
				add(new JButton("현재 카드 번호는 " + i + "입니다"), "Center");
			}
		}
	}

}

public class CardTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
