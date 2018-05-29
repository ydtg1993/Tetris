package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayLevel extends Lay{
	
	protected static Image IMG_LV = new ImageIcon("graphics/string/level.png").getImage();

	public LayLevel(int x,int y,int w,int h) {
		super(x,y,w,h);
	}
	
	public void paint(Graphics g) {
		this.createWindow(g);
		g.drawImage(IMG_LV, this.x + this.PADDING, this.y + this.PADDING, null);
	}
}
