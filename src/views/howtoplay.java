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

	//���
	ImageIcon i = new ImageIcon("./image/how_play.jpg");
	Image im=i.getImage();
	 
	//������, �ǳ�
	JFrame jf = new JFrame("���� ���");
	MyPanel jp2 = new MyPanel();
		
	//������
	public howtoplay() {
		//��� �̹���
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("./image/Icon.png");
				
		//������
		jf.setBounds(450, 200, 1000, 600);
		jf.setVisible(true);
		jf.setResizable(false); //ũ�� ����
		jf.setBackground(Color.black);
		
		//��� �ǳ�
		jf.add(jp2);
				
	}
public class MyPanel extends JPanel{
	    //Panel ����
	    public void paintComponent(Graphics g){
	        super.paintComponent(g);
	        g.drawImage(im,0,0,getWidth(),getHeight(),this);
	    }
	}//myPanel
}