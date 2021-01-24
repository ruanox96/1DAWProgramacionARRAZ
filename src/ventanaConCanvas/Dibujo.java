package ventanaConCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Dibujo extends Canvas {
	
	public Dibujo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(20, 20, 30, 50);
		
		g.setColor(Color.black);
		g.drawRect(20, 20, 30, 50);
		
		g.setColor(Color.cyan);
		g.fillOval(50, 50, 60, 60);
		
		g.setColor(Color.DARK_GRAY);
		g.drawOval(50, 50, 60, 60);
		
		g.setColor(Color.pink);
		int [] vx2 = {400, 450, 310};
        int [] vy2 = {170, 220, 220};
        g.fillPolygon (vx2, vy2, 3);
        
        g.setColor(Color.black);
        g.drawPolygon(vx2, vy2, 3);
	}

}
