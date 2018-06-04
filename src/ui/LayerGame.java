package ui;

import java.awt.Graphics;

public class LayerGame extends Layer {

	public LayerGame(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) {
		this.createWindow(g);
		String temp = Integer.toString(this.dto.getNowPoint());
		g.drawString(temp, this.x, this.y);
	}
}
