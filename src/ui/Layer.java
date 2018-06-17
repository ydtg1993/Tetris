package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import config.ConfigFactory;
import config.GameConfig;
import dto.GameDto;

/**
 * 绘制
 * 
 * @author ydtg1
 *
 */
abstract public class Layer {
	protected static final int SIZE;
	
	protected static final int PADDING;
	
	static {
		GameConfig cfg = ConfigFactory.getGameConfig();
		SIZE = cfg.getWindowSize();
		PADDING = cfg.getPadding();
	}
	
	protected static Image WINDOW_IMG = new ImageIcon("graphics/window/Window.png").getImage();
	
	protected static int WINDOW_W = WINDOW_IMG.getWidth(null);
	
	protected static int WINDOW_H = WINDOW_IMG.getHeight(null);
	
	protected int x;
	
	protected int y;
	
	protected int w;
	
	protected int h;
	
	protected GameDto dto = null;
	
	public Layer() {
		
	}
	
	public void setDto(GameDto dto) {
		this.dto = dto;
	}

	public Layer(int x,int y,int w,int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	protected void createWindow(Graphics g) {
		g.drawImage(WINDOW_IMG, x, y, x + SIZE,y + SIZE, 0, 0, SIZE, SIZE, null);
		g.drawImage(WINDOW_IMG, x + SIZE, y, x + w -SIZE, y + SIZE, SIZE, 0, WINDOW_W - SIZE, SIZE, null); 
		g.drawImage(WINDOW_IMG, x + w - SIZE, y, x + w , y + SIZE, WINDOW_W - SIZE, 0, WINDOW_W , SIZE, null);
		
		g.drawImage(WINDOW_IMG, x, y + SIZE, x + SIZE , y + h - SIZE, 0, SIZE, SIZE , WINDOW_H - SIZE, null);
		g.drawImage(WINDOW_IMG, x + SIZE, y + SIZE, x + w - SIZE, y + h - SIZE, SIZE, SIZE, WINDOW_W - SIZE , WINDOW_H - SIZE, null);
		g.drawImage(WINDOW_IMG, x + w - SIZE, y + SIZE, x + w , y + h, WINDOW_W - SIZE, SIZE, WINDOW_W , WINDOW_H - SIZE, null);
		
		g.drawImage(WINDOW_IMG, x , y + h -SIZE, x + SIZE , y + h, 0, WINDOW_H - SIZE, SIZE , WINDOW_H, null);
		g.drawImage(WINDOW_IMG, x + SIZE, y + h - SIZE, x + w - SIZE , y + h, SIZE, WINDOW_H - SIZE, WINDOW_W - SIZE , WINDOW_H, null);
		g.drawImage(WINDOW_IMG, x + w - SIZE, y + h -SIZE, x + w , y + h, WINDOW_W - SIZE, WINDOW_H, WINDOW_W , WINDOW_H, null);
	}
	
	abstract public void paint(Graphics g);
}
