package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayBackground extends Lay {

	protected static Image IMG_GB = new ImageIcon("graphics/background/light.jpg").getImage();
	
	public LayBackground(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(IMG_GB, 0, 0, 1200,670, null);
	}

}
