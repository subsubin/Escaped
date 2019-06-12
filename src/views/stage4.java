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

class stage4 extends JPanel implements MouseListener{
	JFrame jf;
	MyPanel jp = new MyPanel();
	
	boolean keyUp = false;
	boolean keyDown = false;
	boolean keyLeft = false;
	boolean keyRight = false;

	int x, y, h, w;

	// 배경
	ImageIcon i = new ImageIcon("./image/4_background.png");
	Image im = i.getImage();

	// 개와 장애물, me
	public ImageIcon dog, dog_wakeup, dog_house, bird, bug, chicken, pinggu, me_front, me_left, me_right, me_back, arrow;

	JButton setting = new JButton( new ImageIcon("./image/b_setting.png"));

	// JLabel
	public JLabel d, dw, dh, ob1, ob2, ob3, ob4, me_r, ar;

	public stage4(JFrame jf) {
		jp.setLayout(null);
		this.jf = jf;

		dog = new ImageIcon("./image/4_dogandhouse.png");
		dog_wakeup = new ImageIcon("./image/4_dog_angry.png");
		dog_house = new ImageIcon("./image/4_doghouse.png");

		bird = new ImageIcon("./image/4_bird.png");
		bug = new ImageIcon("./image/4_bug.png");
		chicken = new ImageIcon("./image/4_chicken.png");
		pinggu = new ImageIcon("./image/4_pinggu.png");

		me_front = new ImageIcon("./image/me_front.png");
		me_left = new ImageIcon("./image/me_left.png");
		me_right = new ImageIcon("./image/me_right.png");
		me_back = new ImageIcon("./image/me_back.png");
		
		arrow = new ImageIcon("./image/arrow_right.png");

		d = new JLabel(dog);
		d.setBounds(50, -30, 528, 533);

		dw = new JLabel(dog_wakeup);
		dw.setBounds(0, 50, 743, 451);

		dh = new JLabel(dog_house);
		dh.setBounds(50, -33, 525, 401);

		ob1 = new JLabel(bird);
		ob1.setBounds(500, 450, 67, 83);

		ob2 = new JLabel(bug);
		ob2.setBounds(700, 700, 140, 55);

		ob3 = new JLabel(chicken);
		ob3.setBounds(1200, 500, 91, 154);

		ob4 = new JLabel(pinggu);
		ob4.setBounds(900, 300, 102, 106);

		me_r = new JLabel(me_right);
		me_r.setBounds(0, 600, 70, 208);

		ar = new JLabel(arrow);
		ar.setBounds(1300, 300, 148, 95);
		
		setting.setBounds(1350, 10, 130, 129);
		setting.setVisible(true);
		setting.setBorderPainted(false);
		setting.setContentAreaFilled(false);
		setting.setFocusPainted(false);

		jp.add(setting);
		jp.add(me_r);
		jp.add(ob1);
		jp.add(ob2);
		jp.add(ob3);
		jp.add(ob4);
		jp.add(ar);
		jp.add(d);
		
		jf.add(jp);

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
			
			if(((ob1.getX()<x && x<ob1.getX()+ob1.getWidth()) || (ob1.getX()<x+w && x+w<ob1.getX()+ob1.getWidth()) || (ob1.getX()<x+w/2 && x+w/2<ob1.getX()+ob1.getWidth()))
					&&
				((ob1.getY()<y && y<ob1.getY()+ob1.getHeight()) || (ob1.getY()<y+h && y+h<ob1.getY()+ob1.getHeight()) || (ob1.getY()<y+h/2 && y+h/2<ob1.getY()+ob1.getHeight()))) {
					System.out.println("GAME OVER_ob1");
					
					jp.setVisible(false);
					new GameOver(jf);
			}
			else if(((ob2.getX()<x && x<ob2.getX()+ob2.getWidth()) || (ob2.getX()<x+w && x+w<ob2.getX()+ob2.getWidth()) || (ob2.getX()<x+w/2 && x+w/2<ob2.getX()+ob2.getWidth()))
					&&
					((ob2.getY()<y && y<ob2.getY()+ob2.getHeight()) || (ob2.getY()<y+h && y+h<ob2.getY()+ob2.getHeight()) || (ob2.getY()<y+h/2 && y+h/2<ob2.getY()+ob2.getHeight()))) {
				System.out.println("GAME OVER_ob2");
				
				jp.setVisible(false);
				new GameOver(jf);
			}
			else if(((ob3.getX()<x && x<ob3.getX()+ob3.getWidth()) || (ob3.getX()<x+w && x+w<ob3.getX()+ob3.getWidth()) || (ob3.getX()<x+w/2 && x+w/2<ob3.getX()+ob3.getWidth()))
					&&
					((ob3.getY()<y && y<ob3.getY()+ob3.getHeight()) || (ob3.getY()<y+h && y+h<ob3.getY()+ob3.getHeight()) || (ob3.getY()<y+h/2 && y+h/2<ob3.getY()+ob3.getHeight()))) {
				System.out.println("GAME OVER_ob3");
				
				jp.setVisible(false);
				new GameOver(jf);
			}
			else if(((ob4.getX()<x && x<ob4.getX()+ob4.getWidth()) || (ob4.getX()<x+w && x+w<ob4.getX()+ob4.getWidth()) || (ob4.getX()<x+w/2 && x+w/2<ob4.getX()+ob4.getWidth()))
					&&
					((ob4.getY()<y && y<ob4.getY()+ob4.getHeight()) || (ob4.getY()<y+h && y+h<ob4.getY()+ob4.getHeight()) || (ob4.getY()<y+h/2 && y+h/2<ob4.getY()+ob4.getHeight()))) {
				System.out.println("GAME OVER_ob4");
				
				jp.setVisible(false);
				new GameOver(jf);
			}
			else if(((ar.getX()<x && x<ar.getX()+ar.getWidth()) || (ar.getX()<x+w && x+w<ar.getX()+ar.getWidth()) || (ar.getX()<x+w/2 && x+w/2<ar.getX()+ar.getWidth()))
					&&
					((ar.getY()<y && y<ar.getY()+ar.getHeight()) || (ar.getY()<y+h && y+h<ar.getY()+ar.getHeight()) || (ar.getY()<y+h/2 && y+h/2<ar.getY()+ar.getHeight()))) {
				System.out.println(index.username + "님, 4단계 클리어");
				
				jp.setVisible(false);
				new stage5(jf);
			}
			
			switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					keyUp = true;
					me_r.setIcon(new ImageIcon("./image/me_back.png"));
					me_r.setLocation(me_r.getX(), me_r.getY() - 10);
					
					System.out.println("Go up");
					break;
	
				case KeyEvent.VK_DOWN:
					keyDown = true;
					me_r.setIcon(new ImageIcon("./image/me_front.png"));
					me_r.setLocation(me_r.getX(), me_r.getY() + 10);
					
					System.out.println("Go down");
					break;
	
				case KeyEvent.VK_LEFT:
					keyLeft = true;
					me_r.setIcon(new ImageIcon("./image/me_left.png"));
					me_r.setLocation(me_r.getX() - 10, me_r.getY());
					
					System.out.println("Go left");
					break;
	
				case KeyEvent.VK_RIGHT:
					keyRight = true;
					me_r.setIcon(new ImageIcon("./image/me_right.png"));
					me_r.setLocation(me_r.getX() + 10, me_r.getY());
					
					System.out.println("Go right");
					break;			
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				keyLeft = false;
				break;
			case KeyEvent.VK_RIGHT:
				keyRight = false;
				break;
			case KeyEvent.VK_UP:
				keyUp = false;
				break;
			case KeyEvent.VK_DOWN:
				keyDown = false;
				break;
			}
		}

		@Override
		public void keyTyped(KeyEvent e) { }

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource().equals(setting)) {
			new Option();
			
			System.out.println("Click option");

		}
	}

	@Override
	public void mousePressed(MouseEvent e) { }
	@Override
	public void mouseReleased(MouseEvent e) { }
	@Override
	public void mouseEntered(MouseEvent e) { }
	@Override
	public void mouseExited(MouseEvent e) { }
	
	//배경 클래스
	public class MyPanel extends JPanel{
	    public void paintComponent(Graphics g){
	        super.paintComponent(g);
	        g.drawImage(im,0,0,getWidth(),getHeight(),this);
	    }
	}//class_MyPanel
}
