package ch8class;

import javax.swing.*;
import java.awt.*;

public class Pizza extends JFrame {

	public Pizza() {
		setTitle("MyFrame");
		setSize(600,150);
		setLocation(300,200);
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("자바피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		panelA.add(label1);
		
		JButton button1 = new JButton("콤보피자");
		JButton button2 = new JButton("포테이토피자");
		JButton button3 = new JButton("불고기피자");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		JLabel label2 = new JLabel("개수");
		JTextField field = new JTextField(15);
		panelB.add(label2);
		panelB.add(field);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Pizza f = new Pizza();
	}

}
