package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGame extends JPanel{

	public PanelGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon("graphics/window/Window.png").getImage();
		int size = 10;
		g.drawImage(img, 64, 64, 64 + size, 64 + size, 0, 0, size, size, null);
		 
	}
}
