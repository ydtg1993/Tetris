package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerNext extends Layer{

	public LayerNext(int x,int y,int w,int h) {
		super(x,y,w,h);
	}
	
	public void paint(Graphics g) {
		this.createWindow(g);
		int typeCode = this.dto.getNext();
		
		Image image = new ImageIcon("graphics/game/"+typeCode+".png").getImage();
		g.drawImage(image, this.x,this.y,null);
	}
}
