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

public class GameOver extends JPanel {
	JFrame jf;
	MyPanel jp = new MyPanel();
	
	//음악
		File Clap4 =new File("./sound/Gameover.wav");
		sound_gamestart sound4 = new sound_gamestart();
		
	//배경
	ImageIcon i = new ImageIcon("./image/gameover.png");
    Image im = i.getImage();
    
    JButton home = new JButton(new ImageIcon("./image/b_gomain.png"));
	
	MyMouseListener listener = new MyMouseListener();
	
	public GameOver(JFrame jf) {
		System.out.println(index.username+"님 게임오버 되셨습니다");
		System.out.println("총 "+index.time+"초 걸렸습니다");
		index.time_e = System.currentTimeMillis();

		index.time = (int) (( index.time_e - index.time_s )/1000.0);
		
		jp.setLayout(null);
		this.jf = jf;
		
		home.setBounds(600, 600, 300, 100);
		home.setVisible(true);
		home.setBackground(Color.BLACK);
		home.setBorderPainted(false);
		home.setContentAreaFilled(false);
		home.setFocusPainted(false);
		
		jp.add(home);
		
		jf.add(jp);
		
		home.addMouseListener(listener);

		setVisible(true);
		sound4.start(Clap4);
	}
	
	class MyMouseListener implements MouseListener {
		//버튼 메소드
		public void mouseEntered(MouseEvent e) {
			if(e.getSource().equals(home)) {
				home.setIcon(new ImageIcon("./image/b_gomain_on.png"));
				System.out.println("mouseEntered home");
				
			}
		}
		public void mouseExited(MouseEvent e) {
			if(e.getSource().equals(home)) {
				home.setIcon(new ImageIcon("./image/b_gomain.png"));
				System.out.println("mouseExited home");
				
			}			
		}
		public void mousePressed(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) { }
		public void mouseClicked(MouseEvent e) {
			if(e.getSource().equals(home)) {
				System.out.println("GO MAIN");
			}
		}
	}//	class_MyMouseListener
	
	//배경 클래스
	public class MyPanel extends JPanel{
	    public void paintComponent(Graphics g){
	        super.paintComponent(g);
	        g.drawImage(im,0,0,getWidth(),getHeight(),this);
	    }
	}//class_MyPanel
}