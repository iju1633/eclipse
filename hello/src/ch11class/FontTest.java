package ch11class;

import javax.swing.*;
import java.awt.*;

class MyPanel1 extends JPanel {
	Font f1, f2, f3, f4, f5;

	public MyPanel1() {
		f1 = new Font("Serif", Font.PLAIN, 20); // 글자체,효과,글자 크기
		f2 = new Font("San Serif", Font.BOLD, 20);
		f3 = new Font("Monspaced", Font.ITALIC, 20);
		f4 = new Font("Dialog", Font.BOLD | Font.ITALIC, 20); // | "and operation"
		f5 = new Font("DialogInput", Font.BOLD, 20);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(f1);
		g.drawString("Serif 20 points PLAIN", 10, 50);
		g.setFont(f2);
		g.drawString("SanSerif 20 points BOLD", 10, 70);
		g.setFont(f3);
		g.drawString("Monospaced 20 points ITALIC", 10, 90);
		g.setFont(f4);
		g.drawString("Dialog 20 points BOLD + ITALIC", 10, 110);
		g.setFont(f5);
		g.drawString("DialogInput 20 points BOLD", 10, 130);
	}
}

public class FontTest extends JFrame {
	public FontTest() { // 교재에서는 여기서 font객체 생성함
		setSize(500, 200);
		setTitle("Font Test");
		JPanel panel = new MyPanel1(); // 교수님이 사용한 방법 add(new MyPanel1());대신
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		FontTest ft = new FontTest();
	}

}
