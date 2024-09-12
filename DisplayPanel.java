import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class DisplayPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private Main main;
	
	public DisplayPanel(Main m){
		main=m;
	}
	
	public void paintComponent(Graphics g){
		
		g.setColor(Color.white);
		g.fillRect(0,0, this.getWidth(), this.getHeight());
		
		// TODO
	}
	
}
