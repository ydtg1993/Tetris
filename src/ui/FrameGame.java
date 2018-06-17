package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import config.ConfigFactory;
import config.GameConfig;

public class FrameGame extends JFrame{
	
	public FrameGame(PanelGame panelGame){
		GameConfig cfg = ConfigFactory.getGameConfig();
		//设置标题
		this.setTitle("俄罗斯方块");
		//关闭
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗体大小
		this.setSize(cfg.getWidth(), cfg.getHeight());
		//不允许改变大小
		this.setResizable(false);
		//窗体居中
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int w = (screen.width - this.getWidth()) >> 2;
		int y = ((screen.height - this.getHeight()) >> 2) - 32;
		this.setLocation(w, y);
		this.setContentPane(panelGame);
		
		this.setVisible(true);
	}


}
