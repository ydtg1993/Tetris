package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGame extends JPanel{
	private Lay[] lays = null;

	public PanelGame() {
		lays = new Lay[] {
				new Lay(40,32,334,279),
				new Lay(40,343,334,279),
				new Lay(414,32,334,590),
				new Lay(788,32,334,124),
				new Lay(788,188,176,148),
				new Lay(964,188,158,148),
				new Lay(788,368,334,200),
				};
	}

	@Override
	public void paintComponent(Graphics g) {
		for(int i =0;i < lays.length;i++) {
			lays[i].createWindow(g);
		}
		
	}
}
