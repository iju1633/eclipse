package ch11class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // 필요없음

public class FoxImageTest extends JFrame { // 이벤트는 람다식이라 implements 필요없음

	// AWT가 먼저 출시되었고 Swing이 늦게 나왔기 때문에 두 클래스 이름은 충돌이 일어납니다. 따라서 Swing은 기존의 클래스 이름 앞에
	// J를 추가하여 나타냅니다. 버튼을 예로 들면 AWT에서는 Button으로, Swing에서는 JButton으로 말이죠.
	
	Image img;
	int x = 100;
	int y = 0;

	public FoxImageTest() {
		ImageIcon icon = new ImageIcon("C:\\Users\\임재욱\\Desktop\\잡동사니\\배경화면\\Fox.png");
		img = icon.getImage(); // 중요
		// img.setBounds(x,y,100,100); 안되는 이유, VenomGame에서와 같이 label, 즉 컴포넌트가 아니기도 하고 setLayout(null)을 할 수 없는 상태(이미 BorderLayout 사용 중)

		setSize(500, 200);
		add(new MyPanel(), BorderLayout.CENTER); // frame은 기본으로 BorderLayout
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 교수는 안씀

		JPanel panel = new JPanel();
		Button b1 = new Button("왼쪽으로 이동"); // JButton하면 한글 제대로 나오고 아니면 ㅁ로 나옴
		Button b2 = new Button("오른쪽으로 이동");

		b1.addActionListener(e -> { // 람다식!
			x -= 10;
			repaint();
		});
		
		b2.addActionListener(e -> {
			x += 10;
			repaint();
		});

		panel.add(b1);
		panel.add(b2);

		add(panel, BorderLayout.SOUTH); // 버튼이 있는 패널을 남쪽으로, 사진이 있는 패널은 중앙으로)
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, x, y, this); // JPanel은 이미지가 다 로딩되면 ImageObserver로부터 로딩되는 순간을 포착하여 이미지를 도화지에 그리도록 명령하게 된다
			// 그래서 일반적으로 drawImage 메소드의 네번째 매개변수로 this를 사용하는게 일반적이다.
		}
	}

	public static void main(String[] args) {
		FoxImageTest fit = new FoxImageTest();
	}

}
