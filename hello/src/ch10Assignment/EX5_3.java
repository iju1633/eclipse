package ch10Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EX5_3 extends JFrame implements ItemListener, ActionListener { // 패널들 간의 간격이나 라디오 버튼끼리의 간격도 중요한 지(사진 첨부)
	// 라디오버튼과 버튼 둘다 frame에서 이벤트 처리할 예정
	JRadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10;
	JTextField tf;
	JButton b1, b2;
	int flavor, topping, size; // 각각의 패널에서 고른 버튼의 값들이 저장될 변수

	public EX5_3() { // JPanel을 6개 만들어서 표현할 예정(하나의 패널에 종류, 추가토핑, 크기 패널을 넣을 것)
		setTitle("피자 주문");
		setSize(450, 235);
		setLayout(new FlowLayout()); // frame의 기본 배치관리자는 BorderLayout이기에 새로 설정함

		// p1 : label 넣을 패널
		JPanel p1 = new JPanel();
		JLabel label = new JLabel("자바 피자에 오신것을 환영합니다.");
		p1.add(label);
		add(p1, BorderLayout.NORTH);

		// p2 : 종류
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(3, 1)); // 라디오 버튼 3개가 세로로 정렬되어야 하기에 다음과 같이 설정
		rb1 = new JRadioButton("콤보(10,000원)");
		rb2 = new JRadioButton("포테이토(11,000원)");
		rb3 = new JRadioButton("불고기(12,000원)");

		ButtonGroup group1 = new ButtonGroup();
		group1.add(rb1);
		group1.add(rb2);
		group1.add(rb3);

		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);

		p2.add(rb1);
		p2.add(rb2);
		p2.add(rb3);
		p2.setBorder(BorderFactory.createTitledBorder("종류")); // 패널의 이름 붙이는 코드

		// p3 : 추가토핑
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(4, 1)); // 라디오 버튼 4개가 세로로 정렬되어야 하기에 다음과 같이 설정
		rb4 = new JRadioButton("피망(1,000원)");
		rb5 = new JRadioButton("치즈(2,000원)");
		rb6 = new JRadioButton("페페로니(3,000원)");
		rb7 = new JRadioButton("베이컨(4,000원)");

		ButtonGroup group2 = new ButtonGroup();
		group2.add(rb4);
		group2.add(rb5);
		group2.add(rb6);
		group2.add(rb7);

		rb4.addItemListener(this);
		rb5.addItemListener(this);
		rb6.addItemListener(this);
		rb7.addItemListener(this);

		p3.add(rb4);
		p3.add(rb5);
		p3.add(rb6);
		p3.add(rb7);
		p3.setBorder(BorderFactory.createTitledBorder("추가토핑"));

		// p4 : 크기
		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(3, 1)); // 라디오 버튼 3개가 세로로 정렬되어야 하기에 다음과 같이 설정
		rb8 = new JRadioButton("Small(5,000원)");
		rb9 = new JRadioButton("Medium(6,000원)");
		rb10 = new JRadioButton("Large(7,000원)");

		ButtonGroup group3 = new ButtonGroup();
		group3.add(rb8);
		group3.add(rb9);
		group3.add(rb10);

		rb8.addItemListener(this);
		rb9.addItemListener(this);
		rb10.addItemListener(this);

		p4.add(rb8);
		p4.add(rb9);
		p4.add(rb10);
		p4.setBorder(BorderFactory.createTitledBorder("크기"));

		// p5 = p2 + p3 + p4
		JPanel p5 = new JPanel();
		p5.setLayout(new GridLayout(1, 0, 2, 2)); // 한 줄로 나열되어야 함
		p5.add(p2);
		p5.add(p3);
		p5.add(p4);
		add(p5, BorderLayout.CENTER);

		// p6
		JPanel p6 = new JPanel();
		b1 = new JButton("주문");
		b2 = new JButton("취소");
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf = new JTextField(15);
		tf.setEditable(false); // 교수님이 보여준 예시에 텍스트필드는 수정 불가였음

		p6.add(b1);
		p6.add(b2);
		p6.add(tf);
		add(p6, BorderLayout.SOUTH);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void itemStateChanged(ItemEvent e) { // 라디오버튼 이벤트 처리
		if (rb1.isSelected()) { // 모두 else if로 연결하면 하나만 처리하고 if문이 종결되기에 종류, 추가토핑, 크기별로 if문 설정해야함 
			flavor = 10000;
		} else if (rb2.isSelected()) { // 라디오버튼은 isSelected() 메서드 사용
			flavor = 11000;
		} else if (rb3.isSelected()) {
			flavor = 12000;
		}

		if (rb4.isSelected()) {
			topping = 1000;
		} else if (rb5.isSelected()) {
			topping = 2000;
		} else if (rb6.isSelected()) {
			topping = 3000;
		} else if (rb7.isSelected()) {
			topping = 4000;
		}

		if (rb8.isSelected()) {
			size = 5000;
		} else if (rb9.isSelected()) {
			size = 6000;
		} else if (rb10.isSelected()) {
			size = 7000;
		}
	}

	public void actionPerformed(ActionEvent e) { // 버튼 이벤트 처리
		if ((JButton) e.getSource() == b1) { // 주문 버튼
			tf.setText(flavor + topping + size + "원");
		} else if ((JButton) e.getSource() == b2) { // 취소 버튼
			flavor = 0;
			topping = 0;
			size = 0;
			tf.setText(flavor + topping + size + "원");
		}
	}

	public static void main(String[] args) {
		EX5_3 f = new EX5_3();
	}

}
