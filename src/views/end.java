package views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class JPanel11 extends JPanel {

	// 배경
	ImageIcon i = new ImageIcon("./image/end_1.png");
	Image im = i.getImage();

	JButton btn;
	connect_1 win;

	JPanel11(connect_1 win) {

		this.win = win;
		setLayout(null);

		btn = new JButton("다음");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);

		btn.addActionListener(new MyActionListener());

	}

	// 배경
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("panel12");
		}
	}
}

class JPanel12 extends JPanel {

	// 배경
	ImageIcon i = new ImageIcon("./image/pro_2.png");
	Image im = i.getImage();

	connect_1 win;
	JButton btn;

	public JPanel12(connect_1 win) {

		setLayout(null);
		this.win = win;

		btn = new JButton("다음");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());

	}

	// 배경
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("panel13");
		}
	}
}

class JPanel13 extends JPanel {

	// 배경
	ImageIcon i = new ImageIcon("./image/pro_3.png");
	Image im = i.getImage();

	connect_1 win;
	JButton btn;

	public JPanel13(connect_1 win) {

		setLayout(null);
		this.win = win;

		btn = new JButton("다음");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());

	}

	// 배경
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("panel14");
		}
	}
}

class JPanel14 extends JPanel {

	// 배경
	ImageIcon i = new ImageIcon("./image/pro_4.png");
	Image im = i.getImage();

	connect_1 win;
	JButton btn;

	public JPanel14(connect_1 win) {

		setLayout(null);
		this.win = win;

		btn = new JButton("다음");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());

	}

	// 배경
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("panel15");
		}
	}
}

class JPanel15 extends JPanel {

	// 배경
	ImageIcon i = new ImageIcon("./image/pro_5.png");
	Image im = i.getImage();

	connect_1 win;
	JButton btn;

	public JPanel15(connect_1 win) {

		setLayout(null);
		this.win = win;

		btn = new JButton("다음");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());

	}

	// 배경
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("panel16");
		}
	}
}

class JPanel16 extends JPanel {

	// 배경
	ImageIcon i = new ImageIcon("./image/pro_6.png");
	Image im = i.getImage();

	connect_1 win;
	JButton btn;

	public JPanel16(connect_1 win) {

		setLayout(null);
		this.win = win;

		btn = new JButton("다음");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());

	}

	// 배경
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("panel17");
		}
	}
}

class JPanel17 extends JPanel {

	// 배경
	ImageIcon i = new ImageIcon("./image/pro_7.png");
	Image im = i.getImage();

	connect_1 win;
	JButton btn;

	public JPanel17(connect_1 win) {

		setLayout(null);
		this.win = win;

		btn = new JButton("다음");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());

	}

	// 배경
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("panel18");
		}
	}
}

class JPanel18 extends JPanel {

	// 배경
	ImageIcon i = new ImageIcon("./image/pro_8.png");
	Image im = i.getImage();

	connect_1 win;
	JButton btn;

	public JPanel18(connect_1 win) {

		setLayout(null);
		this.win = win;

		btn = new JButton("다음");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());

	}

	// 배경
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("panel19");
		}
	}
}

class JPanel19 extends JPanel {

	// 배경
	ImageIcon i = new ImageIcon("./image/pro_9.png");
	Image im = i.getImage();

	connect_1 win;
	JButton btn;

	public JPanel19(connect_1 win) {

		setLayout(null);
		this.win = win;

		btn = new JButton("다음");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());

	}

	// 배경
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("panel110");
		}
	}
}

class JPanel110 extends JPanel {

	// 배경
	ImageIcon i = new ImageIcon("./image/pro_10.png");
	Image im = i.getImage();

	connect_1 win;
	JButton btn;

	public JPanel110(connect_1 win) {

		setLayout(null);
		this.win = win;

		btn = new JButton("처음으로");
		btn.setSize(100, 20);
		btn.setLocation(1270, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());

	}

	// 배경
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("panel11");
		}
	}
}