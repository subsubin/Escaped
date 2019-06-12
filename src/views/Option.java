package views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Option extends JFrame {
	//배경
	ImageIcon i = new ImageIcon("./image/9_background.png");
    Image im = i.getImage();
	
	//프레임, 판넬
	MyPanel jp = new MyPanel();
	JFrame jf = new JFrame("Option");
	
	JLabel set;
	
	ImageIcon setting = new ImageIcon("./image/setting_word.png");

    JButton home = new JButton(new ImageIcon("./image/b_gomain.png"));
    JButton soundon = new JButton(new ImageIcon("./image/b_soundon.png"));
    JButton soundoff = new JButton(new ImageIcon("./image/b_soundoff.png"));
    JButton soundon_on = new JButton(new ImageIcon("./image/b_soundon_on.png"));
    JButton soundoff_on = new JButton(new ImageIcon("./image/b_soundoff_on.png"));

	MyMouseListener listener = new MyMouseListener();
	
	public Option(){		
		//상단 이미지
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("./image/Icon.png");

		jp.setLayout(null);
		
		//프레임
		jf.setIconImage(img);
		jf.setBounds(450, 200, 1000, 600);
		jf.setVisible(true);
		jf.setResizable(false); //크기 고정
		jf.add(jp);
		
		setTitle("Option");
		
		home.setBounds(350, 380, 300, 100);
		home.setVisible(true);
		home.setBackground(Color.BLACK);
		home.setBorderPainted(false);
		home.setContentAreaFilled(false);
		home.setFocusPainted(false);
		
		soundon.setBounds(150, 230, 300, 100);
		soundon.setVisible(true);
		soundon.setBackground(Color.BLACK);
		soundon.setBorderPainted(false);
		soundon.setContentAreaFilled(false);
		soundon.setFocusPainted(false);
		
		soundoff.setBounds(550, 230, 300, 100);
		soundoff.setVisible(true);
		soundoff.setBackground(Color.BLACK);
		soundoff.setBorderPainted(false);
		soundoff.setContentAreaFilled(false);
		soundoff.setFocusPainted(false);
		
		set = new JLabel(setting);
		set.setBounds(280, 70, 456, 103);

		jp.add(home);
		jp.add(soundon);
		jp.add(soundoff);
		jp.add(set);

		home.addMouseListener(listener);
		soundon.addMouseListener(listener);
		soundoff.addMouseListener(listener);
		
	}
	
	class MyMouseListener implements MouseListener {
		//버튼 메소드
		public void mouseEntered(MouseEvent e) {
			if(e.getSource().equals(home)) {
				home.setIcon(new ImageIcon("./image/b_gomain_on.png"));
				System.out.println("mouseEntered home");
				
			} else if(e.getSource().equals(soundon)) {
				soundon.setIcon(new ImageIcon("./image/b_soundon_on.png"));
				System.out.println("mouseEntered soundon");
				
			} else if(e.getSource().equals(soundoff)) {
				soundoff.setIcon(new ImageIcon("./image/b_soundoff_on.png"));
				System.out.println("mouseEntered soundoff");
				
			}			
		}
		public void mouseExited(MouseEvent e) {
			if(e.getSource().equals(home)) {
				home.setIcon(new ImageIcon("./image/b_gomain.png"));
				System.out.println("mouseExited home");
				
			} else if(e.getSource().equals(soundon)) {
				soundon.setIcon(new ImageIcon("./image/b_soundon.png"));
				System.out.println("mouseExited soundon");
				
			} else if(e.getSource().equals(soundoff)) {
				soundoff.setIcon(new ImageIcon("./image/b_soundoff.png"));
				System.out.println("mouseExited soundoff");
				
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
