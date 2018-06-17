package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

public class LayerGame extends Layer {
	
	protected static Image ACT = new ImageIcon("graphics/game/rect.png").getImage();
	
	protected static int ACT_SIZE = 32;

	public LayerGame(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) {
		this.createWindow(g);
		
		Point[] points = this.dto.getGameAct().getActPoint();
		for(int i = 0;i< points.length;i++) {
			g.drawImage(ACT, 
					this.x + points[i].x * ACT_SIZE + 7, 
					this.y + points[i].y * ACT_SIZE + 7,
					this.x + points[i].x * ACT_SIZE + ACT_SIZE + 7,
					this.y + points[i].y * ACT_SIZE + ACT_SIZE + 7,
					32, 0, 0, 32, null);
		}
		
	}
}
