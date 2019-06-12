package views;

import javax.swing.JFrame;

class connect_1 extends JFrame{
	JPanel11 jp01 = null;
	JPanel12 jp02 = null;
	JPanel13 jp03 = null;
	JPanel14 jp04 = null;
	JPanel15 jp05 = null;
	JPanel16 jp06 = null;
	JPanel17 jp07 = null;
	JPanel18 jp08 = null;
	JPanel19 jp09 = null;
	JPanel110 jp010 = null;
	
public void change(String panelName) {
		
		switch(panelName) {
		case "panel11":
			getContentPane().removeAll();
			getContentPane().add(jp01);
			revalidate();
			repaint();
			break;
		case "panel12":
			getContentPane().removeAll();
			getContentPane().add(jp02);
			revalidate();
			repaint();
			break;
		case "panel13":
			getContentPane().removeAll();
			getContentPane().add(jp03);
			revalidate();
			repaint();
			break;
		case "panel14":
			getContentPane().removeAll();
			getContentPane().add(jp04);
			revalidate();
			repaint();
			break;
		case "panel15":
			getContentPane().removeAll();
			getContentPane().add(jp05);
			revalidate();
			repaint();
			break;
		case "panel16":
			getContentPane().removeAll();
			getContentPane().add(jp06);
			revalidate();
			repaint();
			break;
		case "panel17":
			getContentPane().removeAll();
			getContentPane().add(jp07);
			revalidate();
			repaint();
			break;
		case "panel18":
			getContentPane().removeAll();
			getContentPane().add(jp08);
			revalidate();
			repaint();
			break;
		case "panel19":
			getContentPane().removeAll();
			getContentPane().add(jp09);
			revalidate();
			repaint();
			break;
		case "panel20":
			getContentPane().removeAll();
			getContentPane().add(jp010);
			revalidate();
			repaint();
			break;
		}
	}
}
