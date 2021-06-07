package ch14class;

import javax.swing.*;

public class VenomGame extends JFrame {

	class MyThread extends Thread {
		private JLabel label;
		private int x, y;

		public MyThread(String fname, int x, int y) {
			this.x = x;
			this.y = y;
			label = new JLabel();
			label.setIcon(new ImageIcon(fname)); // 어색함
			label.setBounds(x, y, 100, 100); // 확실히 알자
			add(label);
		}

		public void run() {
			for (int i = 0; i < 200; i++) { // 200번안에 화면 밖으로 나간다는 마인드
				x += 10 * Math.random(); // 0에서 9까지 움직임
				label.setBounds(x, y, 100, 100);
				repaint(); // 빼먹으면 안됨
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public VenomGame() {
		setTitle("VenomRace");
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); // 없어도 같은 결과이긴 함. 그러나 setBounds()에서 위치를 주니까 절대위치 사용하기 위한 설정

		(new MyThread("C:\\Users\\임재욱\\Desktop\\잡동사니\\배경화면\\venom1.jpg", 100, 0)).start();
		(new MyThread("C:\\Users\\임재욱\\Desktop\\잡동사니\\배경화면\\venom2.jpg", 100, 50)).start();
		(new MyThread("C:\\Users\\임재욱\\Desktop\\잡동사니\\배경화면\\venom3.jpg", 100, 100)).start();
		
		setVisible(true);

	}

	public static void main(String[] args) {
		VenomGame v = new VenomGame();
	}

}
