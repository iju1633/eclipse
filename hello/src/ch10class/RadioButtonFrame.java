package ch10class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonFrame extends JFrame implements ActionListener {

	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel top, size, result;

	public RadioButtonFrame() {
		setTitle("라디오 버튼 테스트");
		setSize(300, 150);

		top = new JPanel();
		top.add(new JLabel("어떤 크기의 커피를 주문하시겠습니까?")); // 빈칸 출제 가능(위에 따로 JLabel 선언 필요없음)
		add(top, BorderLayout.NORTH); // frame은 기본적으로 BorderLayout

		size = new JPanel();
		small = new JRadioButton("small size");
		medium = new JRadioButton("medium size");
		large = new JRadioButton("large size");

		ButtonGroup size1 = new ButtonGroup(); // 버튼 그룹이름이라 패널이름이랑 같았었음 (빈칸 출제 가능성 높음)
		size1.add(small);
		size1.add(medium);
		size1.add(large);

		small.addActionListener(this); // Frame에서 이벤트 처리하므로
		medium.addActionListener(this);
		large.addActionListener(this);

		size.add(small);
		size.add(medium);
		size.add(large);
		add(size, BorderLayout.CENTER);

		result = new JPanel();
		text = new JLabel("크기가 선택되지 않았습니다.");
		text.setForeground(Color.red);
		result.add(text);
		add(result, BorderLayout.SOUTH);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) { // 이벤트 어떠한 형식으로 선언하는지 아직 헷갈림
		if (e.getSource() == small) {
			text.setText("small 크기가 선택되었습니다");
		}
		if (e.getSource() == medium) {
			text.setText("medium 크기가 선택되었습니다");
		}
		if (e.getSource() == large) {
			text.setText("large 크기가 선택되었습니다");
		}
	}

	public static void main(String[] args) {
		new RadioButtonFrame();
	}

}
