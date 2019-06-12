package views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class username extends JPanel {

	JFrame jf;
	MyPanel jp = new MyPanel();
	JButton jb = new JButton("확인");
	MyMouseListener listener = new MyMouseListener();
	JTextField userText = new JTextField("이름을 입력하세요", 10);

	// 배경
	ImageIcon i = new ImageIcon("./image/put_name.png");
	Image im = i.getImage();

	username(JFrame jf) {
		this.jf = jf;
		jp.setLayout(null);
		userText.setBackground(Color.gray);
		userText.setForeground(Color.WHITE);
		userText.setBounds(820, 275, 400, 50);

		jb.addMouseListener(listener);
		jb.setBounds(1250, 275, 80, 50);
		jb.setBackground(Color.white);
		jb.setBorder(null);

		jp.add(userText);
		jp.add(jb);
		jf.add(jp);

		// 음악
		File Clap2 = new File("./sound/Play.wav");
		sound_ingame sound2 = new sound_ingame();
		class MyThread extends Thread {
			public void run() { // 수행하여야 하는 작업을 적어줌
				sound2.start(Clap2);
			}
		}
		Thread t = new MyThread(); // 스레드 객체 생성
		t.start(); // 스레드 시작
	}

	class MyPanel extends JPanel {
		// 배경
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
		}
	}

	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("버튼 눌림");

			index.username = (String) userText.getText();
			System.out.println(index.username);

			jp.setVisible(false);
			new stage1(jf);
		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

	}
}