package ui;

import java.awt.Graphics;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import Control.PlayerControl;
import config.ConfigFactory;
import config.GameConfig;
import config.LayerConfig;
import dto.GameDto;

public class PanelGame extends JPanel{
	private ArrayList<Layer> layers = null;
	
	private GameDto dto;

	public PanelGame(GameDto dto){
		this.dto = dto;
		initComponent();
		initLayer();
	}
	
	/**
	 * 安装玩家控制器
	 * @param control
	 */
	public void setGameControl(PlayerControl control) {
		this.addKeyListener(control);
	}
	
	private void initComponent() {

	}
	
	private void initLayer(){
		GameConfig cfg = ConfigFactory.getGameConfig();
		List<LayerConfig> layersCfg = cfg.getLayersConfig();
		layers = new ArrayList<Layer>(layersCfg.size());
		
		try {
		for (LayerConfig layerConfig : layersCfg) {
			Class cls = Class.forName(layerConfig.getClassName());
			Constructor ctr = cls.getConstructor(int.class,int.class,int.class,int.class);
			Layer l = (Layer)ctr.newInstance(
						layerConfig.getX(),
						layerConfig.getY(),
						layerConfig.getW(),
						layerConfig.getH()
					);
			l.setDto(dto);
			layers.add(l);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < layers.size(); i++) {
			layers.get(i).paint(g);
		}
		this.requestFocus();
	}
}
