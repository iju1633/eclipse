package ch10class;

import javax.swing.*;
import java.awt.*;

public class ImageLabelTest extends JFrame {

	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ImageLabelTest() {
		setTitle("레이블 테스트");
		setSize(400,150);
		
		panel = new JPanel();
		label = new JLabel();
		label.setText("Fox");
		label.setFont(new Font("Arial", Font.ITALIC, 30));
		label.setForeground(Color.orange);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\임재욱\\Desktop\\잡동사니\\배경화면\\Fox.png");
		label.setIcon(icon); // 레이블에 이미지랑 텍스트 둘 다 넣었으니 자연스레 이미지는 왼쪽, 텍스트는 오른쪽에 배열됨.
		
		button = new JButton("자세한 정보를 보려면 클릭하세요");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ImageLabelTest i = new ImageLabelTest();
	}

}
