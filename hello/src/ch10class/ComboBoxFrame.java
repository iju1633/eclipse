package ch10class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxFrame extends JFrame implements ActionListener { // frame에서 이벤트 처리할 거라는 것을 알 수 있음

	JLabel label; // label에다가 사진을 넣을 것이기 때문에 밖에 설정해줌

	public ComboBoxFrame() {
		setTitle("콤보 박스");
		setSize(400, 200);

		String[] venoms = { "venom1", "venom2", "venom", "venom4", "background1" }; // 사진 파일의 이름을 넣어줌
		JComboBox venomList = new JComboBox(venoms); // 배열은 인수로 넣거나, 비어있게 선언후 venomList.addItem("venom1");과 같이 선언 가능!!!
		venomList.setSelectedIndex(0); // 기본으로 선택되어있는 건 첫 번째 것
		venomList.addActionListener(this); // 콤보 박스 변경마다 이벤트 등록

		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER); // 기본적으로 JLabel이 삽입되면 왼쪽 정렬이 되기에 가운데 정렬을 위한 설정, 다만 이 레이블에는 사진이 들어감
		changePicture(venoms[venomList.getSelectedIndex()]); // name이 들어갈 곳(빈칸 풀제 가능)
		add(venomList, BorderLayout.NORTH); // 콤보박스는 위로
		add(label, BorderLayout.CENTER); // 이미지는 center로

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource(); // getSource 메서드는 Object 타입으로 반환하므로 형변환해야함!!
		String name = (String) cb.getSelectedItem(); // getSelectedItem 메서드는 Object 타입으로 반환하므로 형변환해야하고, 가져온 item을
														// String화해서 name(ex.venom2)로 저장
		changePicture(name);
	}

	protected void changePicture(String name) {
		ImageIcon icon = new ImageIcon("C:\\Users\\임재욱\\Desktop\\잡동사니\\배경화면\\" + name + ".jpg");
		label.setIcon(icon);
		int s = icon.getImageLoadStatus(); // icon은 null인 경우가 없어 추가한 부분

		if (s != MediaTracker.ERRORED) { // icon은 null인 경우가 없어 추가한 부분
			label.setText(null); // 명시적인 표현
		} else {
			label.setText("이미지가 발견되지 않았습니다.");
		}
	}

	public static void main(String[] args) {
		ComboBoxFrame cbf = new ComboBoxFrame();
	}

}
