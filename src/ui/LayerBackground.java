package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerBackground extends Layer {

	protected static Image IMG_GB = new ImageIcon("graphics/background/vintage-concrete.png").getImage();
	
	public LayerBackground(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(IMG_GB, 0, 0, 1168,680, null);
	}

}
