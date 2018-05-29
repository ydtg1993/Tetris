package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayDataBase extends Lay {
	
	protected static Image IMG_DB = new ImageIcon("graphics/string/db.png").getImage();
	
	public LayDataBase(int x,int y,int w,int h) {
		super(x,y,w,h);
	}
	
	public void paint(Graphics g) {
		this.createWindow(g);
		g.drawImage(IMG_DB,this.x + this.PADDING, this.x + this.PADDING,null);
	}
}
