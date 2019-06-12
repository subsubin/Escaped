package views;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class stage3 extends JPanel implements MouseListener {
	// 이미지
	Image screw_front = new ImageIcon("./image/3_friends_front.png").getImage();
	Image screw_front2 = new ImageIcon("./image/3_friends_front.png").getImage();
	Image screw_front3 = new ImageIcon("./image/3_friends_front.png").getImage();

	Thread t1, t2, t3;

	int xx = 90; // 이미지 가로
	int yy = 70; // 이미지 가로
	int b1 = 100; // 초기 X위치
	int b2_1 = 1200;
	int b2_2 = 600;
	int b3 = 600;
	int bSpeed = 10; // 속도
	int bSpeed2_1 = 10;
	int bSpeed2_2 = 10;
	int bSpeed3 = 10;

	int x, y, h, w; // 캐릭터의 현재 좌표를 받을 변수

	boolean isPlay = true; // 플레이할것인지
	// ======================================
	JFrame jf;
	MyPanel jp = new MyPanel();

	// 캐릭터의 움직임
	boolean keyUp = false;
	boolean keyDown = false;
	boolean keyLeft = false;
	boolean keyRight = false;

	// 배경
	ImageIcon i = new ImageIcon("./image/3_background.png");
	Image im = i.getImage();

	ImageIcon arrow = new ImageIcon("./image/arrow_up.png");
	ImageIcon me_right = new ImageIcon("./image/me_back.png");
	JLabel me_r, ar;
	JButton setting = new JButton(new ImageIcon("./image/b_setting.png"));

	MyKeyListener Klistener = new MyKeyListener();

	class MyThread extends Thread {
		// 음악
		File Clap3 = new File("./sound/Siren.wav");
		game_over sound3 = new game_over();

		public void run() {
			sound3.start(Clap3);
		}
	}

	Thread t = new MyThread(); // 스레드 객체 생성

	public stage3(JFrame jf) {

		t.start(); // 스레드 시작
		class MyThread4 extends Thread {
			public void run() {
				while (true) {
					b1 += bSpeed;

					if (b1 - xx < 200) {
						bSpeed = -bSpeed;
						b1 = 200 + xx;
					} else if (b1 + xx > 1400) {
						bSpeed = -bSpeed;
						b1 = 1400 - xx;
					}
					if (isPlay) // isPlay 변수가 true이면
						jp.repaint(); // 그린다.
					try {
						Thread.sleep(30); // 속도 조절
					} catch (InterruptedException ex) {
					}
					b1 += bSpeed;
				}
			}
		}
		t1 = new MyThread4(); // 스레드 객체 생성
		t1.start(); // 스레드 시작

		class MyThread5 extends Thread {
			public void run() {
				while (true) {
					b2_1 += bSpeed2_1;
					b2_2 += bSpeed2_2;
					if (b2_1 - 50 < 0) {
						bSpeed2_1 = -bSpeed2_1;
						b2_1 = 50;
					} else if (b2_1 + 50 > xx) {
						bSpeed2_1 = -bSpeed2_1;
						b2_1 = xx - 50;
					}
					if (b2_2 - 50 < 0) {
						bSpeed2_2 = -bSpeed2_2;
						b2_2 = 50;
					} else if (b2_2 + 50 > yy) {
						bSpeed2_2 = -bSpeed2_2;
						b2_2 = yy - 50;
					}
					if (isPlay) // isPlay 변수가 true이면
						repaint(); // 그린다.
					try {
						Thread.sleep(30); // 속도 조절
					} catch (InterruptedException ex) {
					}
				}
			}
		}
		t2 = new MyThread5(); // 스레드 객체 생성
		t2.start(); // 스레드 시작

		class MyThread6 extends Thread {
			public void run() {
				while (true) {
					b3 += bSpeed3;

					if (b3 - xx < 200) {
						bSpeed3 = -bSpeed3;
						b3 = 200 + xx;
					} else if (b3 + xx > 1400) {
						bSpeed3 = -bSpeed3;
						b3 = 1400 - xx;
					}
					if (isPlay) // isPlay 변수가 true이면
						jp.repaint(); // 그린다.
					try {
						Thread.sleep(30); // 속도 조절
					} catch (InterruptedException ex) {
					}
					b3 += bSpeed3;
				}
			}
		}

		t3 = new MyThread6(); // 스레드 객체 생성
		t3.start(); // 스레드 시작
		// =================================

		jp.setLayout(null);
		this.jf = jf;

		me_r = new JLabel(me_right);
		me_r.setBounds(700, 700, 70, 208);

		setting.setBounds(1350, 10, 130, 129);
		setting.setVisible(true);
		setting.setBorderPainted(false);
		setting.setContentAreaFilled(false);
		setting.setFocusPainted(false);

		ar = new JLabel(arrow);
		ar.setBounds(1070, 30, 95, 148);

		jf.add(jp);
		jp.add(me_r);
		jp.add(setting);
		jp.add(ar);

		setting.addMouseListener(this);

		jf.requestFocus();
		jf.addKeyListener(new MyKeyListener());

		setVisible(true);

		requestFocus();
	}

	class MyKeyListener implements KeyListener {
		public void keyPressed(KeyEvent e) {
			x = me_r.getX();
			y = me_r.getY();
			w = me_r.getWidth();
			h = me_r.getHeight();

			if (((ar.getX() < x && x < ar.getX() + ar.getWidth())
					|| (ar.getX() < x + w && x + w < ar.getX() + ar.getWidth())
					|| (ar.getX() < x + w / 2 && x + w / 2 < ar.getX() + ar.getWidth()))
					&& ((ar.getY() < y && y < ar.getY() + ar.getHeight())
							|| (ar.getY() < y + h && y + h < ar.getY() + ar.getHeight())
							|| (ar.getY() < y + h / 2 && y + h / 2 < ar.getY() + ar.getHeight()))) {
				System.out.println("GOGO 3STAGE");
				System.out.println(index.username + "님 3스테이지 클리어 하셨습니다");
				t1.interrupt();
				t2.interrupt();
				t3.interrupt();

				jp.setVisible(false);
				new stage4(jf);
			}

			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				keyUp = true;
				me_r.setIcon(new ImageIcon("./image/me_back.png"));
				me_r.setLocation(me_r.getX(), me_r.getY() - 30);

				System.out.println("Go up");
				break;

			case KeyEvent.VK_DOWN:
				keyDown = true;
				me_r.setIcon(new ImageIcon("./image/me_front.png"));
				me_r.setLocation(me_r.getX(), me_r.getY() + 30);

				System.out.println("Go down");
				break;

			case KeyEvent.VK_LEFT:
				keyLeft = true;
				me_r.setIcon(new ImageIcon("./image/me_left.png"));
				me_r.setLocation(me_r.getX() - 30, me_r.getY());

				System.out.println("Go left");
				break;

			case KeyEvent.VK_RIGHT:
				keyRight = true;
				me_r.setIcon(new ImageIcon("./image/me_right.png"));
				me_r.setLocation(me_r.getX() + 30, me_r.getY());

				System.out.println("Go right");
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource().equals(setting)) {
			new Option();

			System.out.println("Click option");

		}
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

	// 배경 클래스
	public class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);

			g.drawImage(screw_front, (b1 - xx), 100, 70, 150, this);
			g.drawImage(screw_front2, (b2_1 - 50), (b2_2 - 50), 70, 150, this);
			g.drawImage(screw_front3, (b3 - xx), 500, 70, 150, this);
		}
	}// class_MyPanel
}