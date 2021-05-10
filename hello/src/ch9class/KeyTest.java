package ch9class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KeyFrame extends JFrame implements KeyListener {

	public KeyFrame() {
		setTitle("Event Test");
		setSize(300, 200);

		JTextField tf = new JTextField(20);
		tf.addKeyListener(this);
		add(tf);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		display(e, "KeyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		display(e, "KeyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		display(e, "KeyReleased");
	}

	protected void display(KeyEvent e, String s) { // e.getKeyChar() : 눌린 키의 문자를 리턴
												   // e.getKeyCode() : 눌린 키의 아스키코드를 리턴
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();

		String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();

		System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
	}
}

public class KeyTest {

	public static void main(String[] args) {
		KeyFrame f = new KeyFrame();
	}

}
