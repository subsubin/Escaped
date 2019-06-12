package views;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//jp.setLayout(null) 하기
class stage1 extends JPanel implements MouseListener, MouseMotionListener {
	JFrame jf;
	MyPanel jp = new MyPanel();

	// 배경
	ImageIcon i = new ImageIcon("./image/1_background_close.png");
	Image im = i.getImage();

	// 마우스 드래그 체크
	boolean isDragged = false;

	// 마우스 오프셋좌표
	int offX, offY;

	// 사물
	public JButton blanket, pillow, plant, drawer, friends, setting;

	public ImageIcon key_1, key_2, key_3, key_4, doorhandler;

	public JLabel dh, jk1, jk2, jk3, jk4;

	// 중복클릭 확인
	public int ck1 = 0, ck2 = 0, ck3 = 0, ck4 = 0;

	// 키 체크
	public int kck = 0;

	public stage1(JFrame jf) {
		jp.setLayout(null);
		this.jf = jf;

		blanket = new JButton(new ImageIcon("./image/1_blanket.png"));
		pillow = new JButton(new ImageIcon("./image/1_pillow.png"));
		plant = new JButton(new ImageIcon("./image/1_plant.png"));
		drawer = new JButton(new ImageIcon("./image/1_drawer.png"));
		friends = new JButton(new ImageIcon("./image/friend_sit.png"));
		setting = new JButton(new ImageIcon("./image/b_setting.png"));

		key_1 = new ImageIcon("./image/1_key1.png");
		key_2 = new ImageIcon("./image/1_key2.png");
		key_3 = new ImageIcon("./image/1_key3.png");
		key_4 = new ImageIcon("./image/1_key4.png");

		doorhandler = new ImageIcon("./image/1_doorhandler.png");

		blanket.setBounds(0, 460, 343, 338);
		blanket.setVisible(true);
		blanket.setBorderPainted(false);
		blanket.setContentAreaFilled(false);
		blanket.setFocusPainted(false);

		pillow.setBounds(125, 370, 221, 98);
		pillow.setVisible(true);
		pillow.setBorderPainted(false);
		pillow.setContentAreaFilled(false);
		pillow.setFocusPainted(false);

		plant.setBounds(1150, 550, 143, 224);
		plant.setVisible(true);
		plant.setBorderPainted(false);
		plant.setContentAreaFilled(false);
		plant.setFocusPainted(false);

		drawer.setBounds(1100, 300, 304, 379);
		drawer.setVisible(true);
		drawer.setBorderPainted(false);
		drawer.setContentAreaFilled(false);
		drawer.setFocusPainted(false);

		friends.setBounds(550, 200, 145, 250);
		friends.setVisible(true);
		friends.setBorderPainted(false);
		friends.setContentAreaFilled(false);
		friends.setFocusPainted(false);

		setting.setBounds(1350, 10, 130, 129);
		setting.setVisible(true);
		setting.setBorderPainted(false);
		setting.setContentAreaFilled(false);
		setting.setFocusPainted(false);

		dh = new JLabel(doorhandler);
		dh.setBounds(800, 200, 53, 46);

		jk1 = new JLabel(key_1);
		jk1.setBounds(270, 390, 36, 70);

		jk2 = new JLabel(key_2);
		jk2.setBounds(270, 470, 43, 70);

		jk3 = new JLabel(key_3);
		jk3.setBounds(1370, 580, 27, 70);

		jk4 = new JLabel(key_4);
		jk4.setBounds(1200, 700, 47, 70);

		jp.add(setting);
		jp.add(friends);
		jp.add(blanket);
		jp.add(pillow);
		jp.add(plant);
		jp.add(drawer);
		jp.add(dh);

		jf.add(jp);

		blanket.addMouseListener(this);
		pillow.addMouseListener(this);
		plant.addMouseListener(this);
		drawer.addMouseListener(this);
		friends.addMouseListener(this);
		setting.addMouseListener(this);

		jk1.addMouseListener(this);
		jk2.addMouseListener(this);
		jk3.addMouseListener(this);
		jk4.addMouseListener(this);
		dh.addMouseListener(this);

		jk1.addMouseMotionListener(this);
		jk2.addMouseMotionListener(this);
		jk3.addMouseMotionListener(this);
		jk4.addMouseMotionListener(this);

		// setVisible(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), null);
	}

	// 배경 클래스
	public class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
		}
	}// class_MyPanel

	@Override
	public void mouseDragged(MouseEvent e) {
		if (isDragged && e.getSource().equals(jk1)) {
			jk1.setBounds((int) e.getLocationOnScreen().getX() - 200, (int) e.getLocationOnScreen().getY() - 100, 36,
					70);
			kck = 0;

		} else if (isDragged && e.getSource().equals(jk2)) {
			jk2.setBounds((int) e.getLocationOnScreen().getX() - 200, (int) e.getLocationOnScreen().getY() - 100, 36,
					70);
			kck = 0;

		} else if (isDragged && e.getSource().equals(jk3)) {
			jk3.setBounds((int) e.getLocationOnScreen().getX() - 200, (int) e.getLocationOnScreen().getY() - 100, 36,
					70);
			kck = 1;

		} else if (isDragged && e.getSource().equals(jk4)) {
			jk4.setBounds((int) e.getLocationOnScreen().getX() - 200, (int) e.getLocationOnScreen().getY() - 100, 36,
					70);
			kck = 0;

		}

		repaint();

	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource().equals(setting)) {
			new Option();

			System.out.println("Click option");

		} else if (e.getSource().equals(friends)) {
			friends.setVisible(false);

			jp.add(jk1);
			jp.add(jk2);
			jp.add(jk3);
			jp.add(jk4);

			System.out.println("Click friends");

		} else if (e.getSource().equals(blanket) && ck1 == 0) {
			blanket.setIcon(new ImageIcon("./image/1_blanket_click.png"));
			blanket.setBounds(-60, 460, 313, 337);
			ck1 = 1;

			System.out.println("Click blanket");

		} else if (e.getSource().equals(pillow) && ck2 == 0) {
			pillow.setIcon(new ImageIcon("./image/1_pillow_click.png"));
			pillow.setBounds(125, 230, 212, 198);
			ck2 = 1;

			System.out.println("Click pillow");

		} else if (e.getSource().equals(plant) && ck3 == 0) {
			plant.setIcon(new ImageIcon("./image/1_plant_click.png"));
			plant.setBounds(1150, 350, 167, 223);
			ck3 = 1;

			System.out.println("Click plant");

		} else if (e.getSource().equals(drawer) && ck4 == 0) {
			drawer.setIcon(new ImageIcon("./image/1_drawer_click.png"));
			drawer.setBounds(1010, 300, 378, 366);
			ck4 = 1;

			System.out.println("Click drawer");

		} else if (e.getSource().equals(blanket) && ck1 == 1) {
			blanket.setIcon(new ImageIcon("./image/1_blanket.png"));
			blanket.setBounds(0, 460, 343, 338);
			ck1 = 0;

			System.out.println("Click click blanket");

		} else if (e.getSource().equals(pillow) && ck2 == 1) {
			pillow.setIcon(new ImageIcon("./image/1_pillow.png"));
			pillow.setBounds(125, 370, 221, 98);
			ck2 = 0;

			System.out.println("Click click pillow");

		} else if (e.getSource().equals(plant) && ck3 == 1) {
			plant.setIcon(new ImageIcon("./image/1_plant.png"));
			plant.setBounds(1150, 550, 143, 224);
			ck3 = 0;

			System.out.println("Click click plant");

		} else if (e.getSource().equals(drawer) && ck4 == 1) {
			drawer.setIcon(new ImageIcon("./image/1_drawer.png"));
			drawer.setBounds(1100, 300, 304, 379);
			ck4 = 0;

			System.out.println("Click click drawer");

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		offX = e.getX();
		offY = e.getY();

		isDragged = true;

		System.out.println("Pressed keys");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 마우스 버튼이 릴리즈되면 드래그 모드 종료
		isDragged = false;

		System.out.println("Released keys");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource().equals(dh)) {
			System.out.println("문 손잡이");
			if (kck == 1 && offX < dh.getX() + 53 || offX > dh.getX() && offY < dh.getY() + 46 || offY > dh.getY()) {
				// 2스테이지로 변환
				System.out.println("GOGO 2STAGE");
				jp.setVisible(false);
				new stage2(jf);
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}