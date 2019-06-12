package views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class index {
	public static long time_s, time_e;
	public static int time;
	public static String username;

	// ����
	File Clap = new File("./sound/Anytime.wav");
	sound_gamestart sound1 = new sound_gamestart();

	// ������, �ǳ�
	JFrame jf = new JFrame("������! Ż����.ver");
	MyPanel jp = new MyPanel();

	// ���
	ImageIcon i = new ImageIcon("./image/0_background.png");
	Image im = i.getImage();

	// ��ư
	JButton b1, b2, b3;

	MyMouseListener listener = new MyMouseListener();

	public index() {
		time_s = System.currentTimeMillis();

		// ��� �̹���
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("./image/Icon.png");

		// ������
		jf.setIconImage(img);
		jf.setBounds(200, 50, 1500, 900);
		jf.setVisible(true);
		jf.setResizable(false); // ũ�� ����
		jf.add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��ư
		b1 = new JButton(new ImageIcon("./image/b_lanking.png"));
		b2 = new JButton(new ImageIcon("./image/b_start.png"));
		b3 = new JButton(new ImageIcon("./image/b_howto.png"));

		jp.add(b1);
		jp.add(b2);
		jp.add(b3);

		b1.setSize(300, 100);
		b1.setLocation(150, 650);
		b1.setBackground(Color.BLACK);

		b2.setSize(300, 100);
		b2.setLocation(600, 650);
		b2.setBackground(Color.BLACK);

		b3.setSize(300, 100);
		b3.setLocation(1050, 650);
		b3.setBackground(Color.BLACK);

		b1.addMouseListener(listener);
		b2.addMouseListener(listener);
		b3.addMouseListener(listener);

		sound1.start(Clap);

	}// index ������

	// ��� Ŭ����
	public class MyPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
		}
	}// class_MyPanel

	// ��ư Ŭ����
	class MyMouseListener extends connect implements MouseListener {

		// ��ư �޼ҵ�
		public void mouseEntered(MouseEvent e) {
			if (e.getSource().equals(b1)) {
				b1.setIcon(new ImageIcon("./image/b_lanking_on.png"));
				System.out.println("mouseEntered_b1");

			} else if (e.getSource().equals(b2)) {
				b2.setIcon(new ImageIcon("./image/b_start_on.png"));
				System.out.println("mouseEntered_b2");

			} else if (e.getSource().equals(b3)) {
				b3.setIcon(new ImageIcon("./image/b_howto_on.png"));
				System.out.println("mouseEntered_b3");
			}
		}

		public void mouseExited(MouseEvent e) {
			if (e.getSource().equals(b1)) {
				b1.setIcon(new ImageIcon("./image/b_lanking.png"));
				System.out.println("mouseExited_b1");

			} else if (e.getSource().equals(b2)) {
				b2.setIcon(new ImageIcon("./image/b_start.png"));
				System.out.println("mouseExited_b2");

			} else if (e.getSource().equals(b3)) {
				b3.setIcon(new ImageIcon("./image/b_howto.png"));
				System.out.println("mouseExited_b3");

			}
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseClicked(MouseEvent e) {

			if (e.getSource().equals(b1)) {

				System.out.println("�ҷ����� ��ư");
			} else if (e.getSource().equals(b2)) {

				System.out.println("�����ϱ� ��ư");

				sound1.stop(Clap);

				jp.setVisible(false);
				new username(jf);

				connect win = new connect();
				win.setTitle("���ѷα�");
				win.jp1 = new JPanel01(win);
				win.jp2 = new JPanel02(win);
				win.jp3 = new JPanel03(win);
				win.jp4 = new JPanel04(win);
				win.jp5 = new JPanel05(win);
				win.jp6 = new JPanel06(win);
				win.jp7 = new JPanel07(win);
				win.jp8 = new JPanel08(win);
				win.jp9 = new JPanel09(win);
				win.jp10 = new JPanel10(win);

				win.setResizable(false); // ũ�� ����
				win.add(win.jp1);
				win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				win.setBounds(200, 50, 1500, 900);
				win.setVisible(true);

			} else if (e.getSource().equals(b3)) {

				System.out.println("���ӹ�� ��ư");
				new howtoplay();
			}
		}
	}// class_MyMouseListener
}// class_index

public class Main {

	public static void main(String[] args) {
		while (true)
			new index();

	}// main

}// class_main