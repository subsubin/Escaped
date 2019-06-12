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

import views.stage4.MyKeyListener;

public class stage5 extends JPanel implements MouseListener{
	boolean keyUp = false;
	boolean keyDown = false;
	boolean keyLeft = false;
	boolean keyRight = false;

	//프레임, 판넬
	JFrame jf;
	MyPanel jp = new MyPanel();
	
	int x, y, h, w;
	
	//배경
	ImageIcon i = new ImageIcon("./image/5_background.jpg");
    Image im = i.getImage();
    
    ImageIcon me_front, me_left, me_right, me_back, wire1, wire2, wire3, wire4, wire5, wire6, wire7, arrow;
    JButton setting = new JButton( new ImageIcon("./image/b_setting.png"));
    
    JLabel w1, w2, w3, w4, w5, w6, w7, me, ar;
	
	public stage5(JFrame jf) {
		this.jf = jf;
		jp.setLayout(null);

		me_front = new ImageIcon("./image/me_front.png");
		me_left = new ImageIcon("./image/me_left.png");
		me_right = new ImageIcon("./image/me_right.png");
		me_back = new ImageIcon("./image/me_back.png");

		wire1 = new ImageIcon("./image/5_wire_1.png");
		wire2 = new ImageIcon("./image/5_wire_2.png");
		wire3 = new ImageIcon("./image/5_wire_3.png");
		wire4 = new ImageIcon("./image/5_wire_4.png");
		wire5 = new ImageIcon("./image/5_wire_5.png");
		wire6 = new ImageIcon("./image/5_wire_6.png");
		wire7 = new ImageIcon("./image/5_wire_7.png");
		
		arrow = new ImageIcon("./image/arrow_up.png");

		w1 = new JLabel(wire1);
		w1.setBounds(880, 20, 582, 124);

		w2 = new JLabel(wire2);
		w2.setBounds(0, 50, 613, 102);

		w3 = new JLabel(wire3);
		w3.setBounds(0, 350, 282, 125);

		w4 = new JLabel(wire4);
		w4.setBounds(400, 370, 543, 123);

		w5 = new JLabel(wire5);
		w5.setBounds(1050, 350, 461, 86);

		w6 = new JLabel(wire6);
		w6.setBounds(0, 730, 570, 124);

		w7 = new JLabel(wire7);
		w7.setBounds(850, 730, 606, 125);

		me = new JLabel(me_back);
		me.setBounds(700, 600, 79, 208);

		ar = new JLabel(arrow);
		ar.setBounds(700, 20, 95, 148);
		
		setting.setBounds(1350, 10, 130, 129);
		setting.setVisible(true);
		setting.setBorderPainted(false);
		setting.setContentAreaFilled(false);
		setting.setFocusPainted(false);

		jp.add(setting);
		jp.add(w1);
		jp.add(w2);
		jp.add(w3);
		jp.add(w4);
		jp.add(w5);
		jp.add(w6);
		jp.add(w7);
		jp.add(me);
		jp.add(ar);

		setting.addMouseListener(this);
		
		jf.add(jp);
		jf.requestFocus();
		jf.addKeyListener(new MyKeyListener());

		setVisible(true);
		requestFocus();
	}
	
	class MyKeyListener implements KeyListener {
		public void keyPressed(KeyEvent e) {
			x = me.getX();
			y = me.getY();
			w = me.getWidth();
			h = me.getHeight();
			
			if(((w1.getX()<x && x<w1.getX()+w1.getWidth()) || (w1.getX()<x+w && x+w<w1.getX()+w1.getWidth()) || (w1.getX()<x+w/2 && x+w/2<w1.getX()+w1.getWidth()))
					&&
				((w1.getY()<y && y<w1.getY()+w1.getHeight()) || (w1.getY()<y+h && y+h<w1.getY()+w1.getHeight()) || (w1.getY()<y+h/2 && y+h/2<w1.getY()+w1.getHeight()))) {
				System.out.println("GAME OVER_w1");
				
				jp.setVisible(false);
				new GameOver(jf);
			}
			else if(((w2.getX()<x && x<w2.getX()+w2.getWidth()) || (w2.getX()<x+w && x+w<w2.getX()+w2.getWidth()) || (w2.getX()<x+w/2 && x+w/2<w2.getX()+w2.getWidth()))
					&&
				((w2.getY()<y && y<w2.getY()+w2.getHeight()) || (w2.getY()<y+h && y+h<w2.getY()+w2.getHeight()) || (w2.getY()<y+h/2 && y+h/2<w2.getY()+w2.getHeight()))) {
				System.out.println("GAME OVER_w2");
				
				jp.setVisible(false);
				new GameOver(jf);
			}
			else if(((w3.getX()<x && x<w3.getX()+w3.getWidth()) || (w3.getX()<x+w && x+w<w3.getX()+w3.getWidth()) || (w3.getX()<x+w/2 && x+w/2<w3.getX()+w3.getWidth()))
					&&
				((w3.getY()<y && y<w3.getY()+w3.getHeight()) || (w3.getY()<y+h && y+h<w3.getY()+w3.getHeight()) || (w3.getY()<y+h/2 && y+h/2<w3.getY()+w3.getHeight()))) {
				System.out.println("GAME OVER_w3");
				
				jp.setVisible(false);
				new GameOver(jf);
			}
			else if(((w4.getX()<x && x<w4.getX()+w4.getWidth()) || (w4.getX()<x+w && x+w<w4.getX()+w4.getWidth()) || (w4.getX()<x+w/2 && x+w/2<w4.getX()+w4.getWidth()))
					&&
				((w4.getY()<y && y<w4.getY()+w4.getHeight()) || (w4.getY()<y+h && y+h<w4.getY()+w4.getHeight()) || (w4.getY()<y+h/2 && y+h/2<w4.getY()+w4.getHeight()))) {
				System.out.println("GAME OVER_w4");
				
				jp.setVisible(false);
				new GameOver(jf);
			}
			else if(((w5.getX()<x && x<w5.getX()+w5.getWidth()) || (w5.getX()<x+w && x+w<w5.getX()+w5.getWidth()) || (w5.getX()<x+w/2 && x+w/2<w5.getX()+w5.getWidth()))
					&&
				((w5.getY()<y && y<w5.getY()+w5.getHeight()) || (w5.getY()<y+h && y+h<w5.getY()+w5.getHeight()) || (w5.getY()<y+h/2 && y+h/2<w5.getY()+w5.getHeight()))) {
				System.out.println("GAME OVER_w5");
				
				jp.setVisible(false);
				new GameOver(jf);
			}
			else if(((w6.getX()<x && x<w6.getX()+w6.getWidth()) || (w6.getX()<x+w && x+w<w6.getX()+w6.getWidth()) || (w6.getX()<x+w/2 && x+w/2<w6.getX()+w6.getWidth()))
					&&
				((w6.getY()<y && y<w6.getY()+w6.getHeight()) || (w6.getY()<y+h && y+h<w6.getY()+w6.getHeight()) || (w6.getY()<y+h/2 && y+h/2<w6.getY()+w6.getHeight()))) {
				System.out.println("GAME OVER_w6");
				
				jp.setVisible(false);
				new GameOver(jf);
			}
			else if(((w7.getX()<x && x<w7.getX()+w7.getWidth()) || (w7.getX()<x+w && x+w<w7.getX()+w7.getWidth()) || (w7.getX()<x+w/2 && x+w/2<w7.getX()+w7.getWidth()))
					&&
				((w7.getY()<y && y<w7.getY()+w7.getHeight()) || (w7.getY()<y+h && y+h<w7.getY()+w7.getHeight()) || (w7.getY()<y+h/2 && y+h/2<w7.getY()+w7.getHeight()))) {
				System.out.println("GAME OVER_w7");
				
				jp.setVisible(false);
				new GameOver(jf);
			}
			else if(((ar.getX()<x && x<ar.getX()+ar.getWidth()) || (ar.getX()<x+w && x+w<ar.getX()+ar.getWidth()) || (ar.getX()<x+w/2 && x+w/2<ar.getX()+ar.getWidth()))
					&&
				((ar.getY()<y && y<ar.getY()+ar.getHeight()) || (ar.getY()<y+h && y+h<ar.getY()+ar.getHeight()) || (ar.getY()<y+h/2 && y+h/2<ar.getY()+ar.getHeight()))) {
				System.out.println(index.username + "님, 모든 단계 클리어");
				
				connect_1 win = new connect_1();
				win.setTitle("엔딩");
				win.jp01 = new JPanel11(win);
				win.jp02 = new JPanel12(win);
				win.jp03 = new JPanel13(win);
				win.jp04 = new JPanel14(win);
				win.jp05 = new JPanel15(win);
				win.jp06 = new JPanel16(win);
				win.jp07 = new JPanel17(win);
				win.jp08 = new JPanel18(win);
				win.jp09 = new JPanel19(win);
				win.jp010 = new JPanel110(win);
				
				win.setResizable(false); //크기 고정
				win.add(win.jp01);
				win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				win.setBounds(200, 50, 1500, 900);
				win.setVisible(true);
			}
			
			switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					keyUp = true;
					me.setIcon(new ImageIcon("./image/me_back.png"));
					me.setLocation(me.getX(), me.getY() - 10);
					
					System.out.println("Go up");
					break;
	
				case KeyEvent.VK_DOWN:
					keyDown = true;
					me.setIcon(new ImageIcon("./image/me_front.png"));
					me.setLocation(me.getX(), me.getY() + 10);
					
					System.out.println("Go down");
					break;
	
				case KeyEvent.VK_LEFT:
					keyLeft = true;
					me.setIcon(new ImageIcon("./image/me_left.png"));
					me.setLocation(me.getX() - 10, me.getY());
					
					System.out.println("Go left");
					break;
	
				case KeyEvent.VK_RIGHT:
					keyRight = true;
					me.setIcon(new ImageIcon("./image/me_right.png"));
					me.setLocation(me.getX() + 10, me.getY());
					
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
		public void keyTyped(KeyEvent e) {
		}

	}
	class MyPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(im,0,0,getWidth(),getHeight(),this);
    }
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource().equals(setting)) {
			new Option();
			
			System.out.println("Click option");

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}