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


class JPanel01 extends JPanel{
	
	//���
	ImageIcon i = new ImageIcon("./image/pro_1.png");
	Image im=i.getImage();
	    
	JButton btn;
	connect win;
	
	JPanel01(connect win){

		this.win = win;
		setLayout(null);
		
		 btn = new JButton("����");
		 btn.setSize(70, 20);
		 btn.setLocation(1300, 780);
		 btn.setBackground(Color.white);
		 btn.setBorder(null);
		add( btn);
		
		 btn.addActionListener(new MyActionListener());

	}
	//��� 
	 public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(im,0,0,getWidth(),getHeight(),this);
    }
		
	class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			win.change("panel02");
		}
	}	
}
class JPanel02 extends JPanel{
	
	//���
	ImageIcon i = new ImageIcon("./image/pro_2.png");
	Image im=i.getImage();
	
	connect win;
	JButton btn;
	
	public JPanel02(connect win) {

		setLayout(null);
		this.win = win;
		
		btn = new JButton("����");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());
			
	}
	//���
	public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(im,0,0,getWidth(),getHeight(),this);
		    }
		
	class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			win.change("panel03");
		}
	}
}
class JPanel03 extends JPanel{
	
	//���
	ImageIcon i = new ImageIcon("./image/pro_3.png");
	Image im=i.getImage();
	
	connect win;
	JButton btn;
	
	public JPanel03(connect win) {

		setLayout(null);
		this.win = win;
		
		btn = new JButton("����");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());
			
	}
	//���
	public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(im,0,0,getWidth(),getHeight(),this);
		    }
		
	class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			win.change("panel04");
		}
	}
}
class JPanel04 extends JPanel{
	
	//���
	ImageIcon i = new ImageIcon("./image/pro_4.png");
	Image im=i.getImage();
	
	connect win;
	JButton btn;
	
	public JPanel04(connect win) {

		setLayout(null);
		this.win = win;
		
		btn = new JButton("����");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());
			
	}
	//���
	public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(im,0,0,getWidth(),getHeight(),this);
		    }
		
	class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			win.change("panel05");
		}
	}
}
class JPanel05 extends JPanel{
	
	//���
	ImageIcon i = new ImageIcon("./image/pro_5.png");
	Image im=i.getImage();
	
	connect win;
	JButton btn;
	
	public JPanel05(connect win) {

		setLayout(null);
		this.win = win;
		
		btn = new JButton("����");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());
			
	}
	//���
	public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(im,0,0,getWidth(),getHeight(),this);
		    }
		
	class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			win.change("panel06");
		}
	}
}
class JPanel06 extends JPanel{
	
	//���
	ImageIcon i = new ImageIcon("./image/pro_6.png");
	Image im=i.getImage();
	
	connect win;
	JButton btn;
	
	public JPanel06(connect win) {

		setLayout(null);
		this.win = win;
		
		btn = new JButton("����");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());
			
	}
	//���
	public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(im,0,0,getWidth(),getHeight(),this);
		    }
		
	class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			win.change("panel07");
		}
	}
}
class JPanel07 extends JPanel{
	
	//���
	ImageIcon i = new ImageIcon("./image/pro_7.png");
	Image im=i.getImage();
	
	connect win;
	JButton btn;
	
	public JPanel07(connect win) {

		setLayout(null);
		this.win = win;
		
		btn = new JButton("����");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());
			
	}
	//���
	public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(im,0,0,getWidth(),getHeight(),this);
		    }
		
	class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			win.change("panel08");
		}
	}
}
class JPanel08 extends JPanel{
	
	//���
	ImageIcon i = new ImageIcon("./image/pro_8.png");
	Image im=i.getImage();
	
	connect win;
	JButton btn;
	
	public JPanel08(connect win) {

		setLayout(null);
		this.win = win;
		
		btn = new JButton("����");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());
			
	}
	//���
	public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(im,0,0,getWidth(),getHeight(),this);
		    }
		
	class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			win.change("panel09");
		}
	}
}class JPanel09 extends JPanel{
	
	//���
	ImageIcon i = new ImageIcon("./image/pro_9.png");
	Image im=i.getImage();
	
	connect win;
	JButton btn;
	
	public JPanel09(connect win) {

		setLayout(null);
		this.win = win;
		
		btn = new JButton("����");
		btn.setSize(70, 20);
		btn.setLocation(1300, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());
			
	}
	//���
	public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(im,0,0,getWidth(),getHeight(),this);
		    }
		
	class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			win.change("panel10");
		}
	}
}class JPanel10 extends JPanel{
	
	//���
	ImageIcon i = new ImageIcon("./image/pro_10.png");
	Image im=i.getImage();
	
	connect win;
	JButton btn;
	
	public JPanel10(connect win) {

		setLayout(null);
		this.win = win;
		
		btn = new JButton("ó������");
		btn.setSize(100, 20);
		btn.setLocation(1270, 780);
		btn.setBackground(Color.white);
		btn.setBorder(null);
		add(btn);
		btn.addActionListener(new MyActionListener());
			
	}
	//���
	public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        g.drawImage(im,0,0,getWidth(),getHeight(),this);
		    }
		
	class MyActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			win.change("panel01");
		}
	}
}