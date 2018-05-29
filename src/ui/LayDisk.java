package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayDisk extends Lay {

	protected static Image IMG_DISK = new ImageIcon("graphics/string/disk.png").getImage();
	
	public LayDisk(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) {
		this.createWindow(g);
		g.drawImage(IMG_DISK, this.x + this.PADDING, this.y + this.PADDING, null);
	}
}
