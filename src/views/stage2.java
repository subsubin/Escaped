package views;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class stage2 extends JPanel implements MouseListener {
	// 이미지
	Image screw_front = new ImageIcon("./image/2_screw_front.png").getImage();
	Image screw_front2 = new ImageIcon("./image/2_screw_front.png").getImage();
	Image screw_front3 = new ImageIcon("./image/2_screw_front.png").getImage();

	Thread t1, t2, t3;

	int xx = 90;;
	int b1 = 100;;
	int b2 = 1200;
	int b3 = 600;
	int bSpeed1 = 10;;
	int bSpeed2 = 10;
	int bSpeed3 = 10;

	int x, y, h, w;

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
	ImageIcon i = new ImageIcon("./image/2_background.jpg");
	Image im = i.getImage();

	ImageIcon arrow = new ImageIcon("./image/arrow_up.png");
	ImageIcon me_right = new ImageIcon("./image/me_back.png");
	JLabel me_r, ar;
	JButton setting = new JButton(new ImageIcon("./image/b_setting.png"));

	MyKeyListener Klistener = new MyKeyListener();

	public stage2(JFrame jf) {

		class MyThread extends Thread {
			public void run() { // 수행하여야 하는 작업을 적어줌
				while (true) {
					b1 += bSpeed1;

					if (b1 - xx < 200) {
						bSpeed1 = -bSpeed1;
						b1 = 200 + xx;
					} else if (b1 + xx > 1400) {
						bSpeed1 = -bSpeed1;
						b1 = 1400 - xx;
					}

					if (isPlay) // isPlay 변수가 true이면
						jp.repaint(); // 그린다.

					try {
						Thread.sleep(20); // 공의 속도 조절
					} catch (InterruptedException ex) {

						System.err.println("멈춰라");
					}
					b1 += bSpeed1;
				}
			}
		}
		t1 = new MyThread(); // 스레드 객체 생성
		t1.start(); // 스레드 시작

		class MyThread2 extends Thread {
			public void run() { // 수행하여야 하는 작업을 적어줌
				while (true) {
					b2 += bSpeed2;

					if (b2 - xx < 200) {
						bSpeed2 = -bSpeed2;
						b2 = 200 + xx;
					} else if (b2 + xx > 1400) {
						bSpeed2 = -bSpeed2;
						b2 = 1400 - xx;
					}
					if (isPlay) // isPlay 변수가 true이면
						jp.repaint(); // 그린다.
					try {
						Thread.sleep(30); // 공의 속도 조절
					} catch (InterruptedException ex) {
					}
					b2 += bSpeed2;
				}
			}
		}
		t2 = new MyThread2(); // 스레드 객체 생성
		t2.start(); // 스레드 시작

		class MyThread3 extends Thread {
			public void run() { // 수행하여야 하는 작업을 적어줌
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
						Thread.sleep(20); // 공의 속도 조절
					} catch (InterruptedException ex) {
					}
					b3 += bSpeed3;
				}
			}
		}

		t3 = new MyThread3(); // 스레드 객체 생성
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
		ar.setBounds(1027, 0, 95, 148);

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
				System.out.println(index.username + "님 2스테이지 클리어하셨습니다");
				t1.stop();
				t2.stop();
				t3.stop();
				jp.setVisible(false);
				new stage3(jf);

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
			g.drawImage(screw_front2, (b2 - xx), 300, 70, 150, this);
			g.drawImage(screw_front3, (b3 - xx), 500, 70, 150, this);
		}
	}// class_MyPanel
}