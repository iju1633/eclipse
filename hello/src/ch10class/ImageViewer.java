package ch10class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageViewer extends JFrame implements ActionListener { // 메뉴 생성 절차 확인해서 빈칸이나 손코딩 출제 가능성 높다!

	private JLabel label;
	private JMenuItem open, exit;

	public ImageViewer() {
		setTitle("ImageViewer");
		setSize(600, 300);

		JMenuBar mbar = new JMenuBar(); // 메뉴바 만들고
		JMenu m = new JMenu("File"); // 메뉴바에 들어갈 메뉴 만들고
		open = new JMenuItem("Open"); // 메뉴 눌렀을 때 메뉴항목을 만들고
		exit = new JMenuItem("Exit");
		open.addActionListener(this); // 메뉴 항목마다 이벤트 등록하고
		exit.addActionListener(this);
		m.add(open); // 메뉴에 메뉴항목 추가
		m.add(exit);
		mbar.add(m); // 메뉴바에 메뉴 추가
		setJMenuBar(mbar); // frame에 메뉴바 추가

		JPanel panel = new JPanel(); // label에 사진을 넣을거여서 panel과 label 선언 필요
		label = new JLabel();
		panel.add(label);
		add(panel);
		setVisible(true);
	}

	/*
	 * JFileChooser(파일선택기) 컴포넌트
	 * 
	 * 파일 시스템을 탐색하여 파일이나 폴더를 선택하는 대화상자를 제공하는 컴포넌트를 말합니다. 파일 선택기라 하여서 선택한 파일을 직접 열거나
	 * 저장하는 기능은 제공하지 않고 선택한 File인스턴스를 반환하여 사용자가 선택된 File을 처리할 수 있도록만 해줍니다. 알아야 할 주요
	 * 메소드는 showOpenDialog(), showSaveDialog() 메소드 입니다. 이 메소드는 파일선택기의 열기모드, 저장모드의
	 * 대화상자를 윈도우상에 띄어주고 반환값으로 파일이 잘 선택되었는지 안되었는지에 관한 int형 값이 반환됩니다. 반환값이
	 * JFileChooser.APPROVE_OPTION의 값과 같다면 올바른 파일을 선택한거고 그외의 반환값이면 취소버튼을 눌렀거나 그밖의
	 * 상황이 발생한 것입니다.
	 * 
	 */

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == open) { // 형변환 안함
			JFileChooser c = new JFileChooser();
			int r = c.showOpenDialog(this); // 파일오픈 다이얼로그를 띄움, 여기서 this는 frame의미
			if (r == JFileChooser.APPROVE_OPTION) { // if the user selects a file
				String name = c.getSelectedFile().getAbsolutePath(); // file에서 고른 값이 절대 경로를 통해 넘어 온다라는 것 알길 바람(빈칸 가능)
				System.out.println(name); // 이 부분과 윗줄 언급하심
				label.setIcon(new ImageIcon(name));
			} else if (source == exit) {
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		ImageViewer f = new ImageViewer();
	}

}
