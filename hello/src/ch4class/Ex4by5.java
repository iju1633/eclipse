package ch4class;

import javax.swing.*;
public class Ex4by5 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			JFrame f = new JFrame("Frame Test");
			
			f.setSize(300,200);
			f.setLocation(i*30, 20);
			f.setVisible(true);
		}
	}

}
