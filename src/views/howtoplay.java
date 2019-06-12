package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class howtoplay{

	//배경
	ImageIcon i = new ImageIcon("./image/how_play.jpg");
	Image im=i.getImage();
	 
	//프레임, 판넬
	JFrame jf = new JFrame("게임 방법");
	MyPanel jp2 = new MyPanel();
		
	//생성자
	public howtoplay() {
		//상단 이미지
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("./image/Icon.png");
				
		//프레임
		jf.setBounds(450, 200, 1000, 600);
		jf.setVisible(true);
		jf.setResizable(false); //크기 고정
		jf.setBackground(Color.black);
		
		//배경 판넬
		jf.add(jp2);
				
	}
public class MyPanel extends JPanel{
	    //Panel 설정
	    public void paintComponent(Graphics g){
	        super.paintComponent(g);
	        g.drawImage(im,0,0,getWidth(),getHeight(),this);
	    }
	}//myPanel
}