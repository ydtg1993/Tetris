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
		int typeCode = this.dto.getGameAct().getActCode();
		
		for(int i = 0;i< points.length;i++) {
			g.drawImage(ACT, 
					this.x + points[i].x * ACT_SIZE + 7, 
					this.y + points[i].y * ACT_SIZE + 7,
					this.x + points[i].x * ACT_SIZE + ACT_SIZE + 7,
					this.y + points[i].y * ACT_SIZE + ACT_SIZE + 7,
					(typeCode + 1) * ACT_SIZE, 0, (typeCode + 1) * ACT_SIZE + ACT_SIZE, ACT_SIZE, null);
		}
		//打印地图
		boolean[][] map = this.dto.getGameMap();
		for (int x = 0; x < map.length; x++) {
			for (int y = 0; y < map[x].length; y++) {
				if(map[x][y]) {
				g.drawImage(ACT, 
						this.x + x * ACT_SIZE + 7, 
						this.y + y * ACT_SIZE + 7,
						this.x + x * ACT_SIZE + ACT_SIZE + 7,
						this.y + y * ACT_SIZE + ACT_SIZE + 7,
						0,0,32,32, null);
				}
			}
		}
	}
}
