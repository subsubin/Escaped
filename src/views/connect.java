package views;

import java.io.File;

import javax.swing.JFrame;

class connect extends JFrame{
	
	JPanel01 jp1 = null;
	JPanel02 jp2 = null;
	JPanel03 jp3 = null;
	JPanel04 jp4 = null;
	JPanel05 jp5 = null;
	JPanel06 jp6 = null;
	JPanel07 jp7 = null;
	JPanel08 jp8 = null;
	JPanel09 jp9 = null;
	JPanel10 jp10 = null;
	
	public void change(String panelName) {
		
		switch(panelName) {
		case "panel01":
			getContentPane().removeAll();
			getContentPane().add(jp1);
			revalidate();
			repaint();
			break;
		case "panel02":
			getContentPane().removeAll();
			getContentPane().add(jp2);
			revalidate();
			repaint();
			break;
		case "panel03":
			getContentPane().removeAll();
			getContentPane().add(jp3);
			revalidate();
			repaint();
			break;
		case "panel04":
			getContentPane().removeAll();
			getContentPane().add(jp4);
			revalidate();
			repaint();
			break;
		case "panel05":
			getContentPane().removeAll();
			getContentPane().add(jp5);
			revalidate();
			repaint();
			break;
		case "panel06":
			getContentPane().removeAll();
			getContentPane().add(jp6);
			revalidate();
			repaint();
			break;
		case "panel07":
			getContentPane().removeAll();
			getContentPane().add(jp7);
			revalidate();
			repaint();
			break;
		case "panel08":
			getContentPane().removeAll();
			getContentPane().add(jp8);
			revalidate();
			repaint();
			break;
		case "panel09":
			getContentPane().removeAll();
			getContentPane().add(jp9);
			revalidate();
			repaint();
			break;
		case "panel10":
			getContentPane().removeAll();
			getContentPane().add(jp10);
			revalidate();
			repaint();
			break;
		}
		
	}
	
}