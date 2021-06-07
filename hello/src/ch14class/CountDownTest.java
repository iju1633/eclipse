package ch14class;

import javax.swing.*;
import java.awt.*;

public class CountDownTest extends JFrame { // extends JFrame 놓치지 말자!
	private JLabel label;

	class MyThread extends Thread{ // T 대문자
		public void run() {
			for (int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000); // Thread부분 어색했음
				} catch (InterruptedException e) { // sleep()과 짝꿍인 예외
					e.printStackTrace(); // 이부분 알아보기, 예외가 발생했을 때 어떻게 파생되었는지 실행경로를 알 수 있다.
				}
				label.setText(i + ""); // 문자가 들어가야하므로 + ""
			}
		}
	}

	public CountDownTest() {
		setTitle("카운트다운");
		setSize(400, 150);

		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100)); // 확실히 알 것
		add(label);

		setVisible(true);
		(new MyThread()).start(); // 살짝 어색했음
		// implements Runnable의 경우, (new Thread(new MyThread())).start();
	}

	public static void main(String[] args) {
		CountDownTest t = new CountDownTest();
	}

}
