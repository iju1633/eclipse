package ch9class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotionTest extends JFrame implements MouseListener, MouseMotionListener { // 흐름 이해할 것!!

	public MouseMotionTest() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MouseMotionTest");

		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		add(panel);
		setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		display("Mouse dragged", e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		display("Mouse Moved", e);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		display("Mouse Clicked (# of Clicks: " + e.getClickCount() + ")", e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		display("Mouse Pressed (# of Clicks: " + e.getClickCount() + ")", e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		display("Mouse Released (# of Clicks: " + e.getClickCount() + ")", e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		display("Mouse Entered", e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		display("Mouse Exited", e);
	}

	
	protected void display(String s, MouseEvent e) {
		System.out.println(s + " X-" + e.getX() + " Y-" + e.getY());
	}

	public static void main(String[] args) {
		MouseMotionTest m = new MouseMotionTest();
	}
}
