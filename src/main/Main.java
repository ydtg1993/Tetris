package main;

import Control.GameControl;
import Control.PlayerControl;
import dto.GameDto;
import service.GameService;
import ui.FrameGame;
import ui.PanelGame;

public class Main {

	public static void main(String[] args){
		//创建游戏数据源
		GameDto dto = new GameDto();
		//创建游戏逻辑块
		GameService service = new GameService(dto);
		//创建游戏面板
		PanelGame panel = new PanelGame(dto);
		//游戏控制器
		GameControl game = new GameControl(panel, service);
		//创建玩家控制器
		PlayerControl control = new PlayerControl(game);
		
		panel.setGameControl(control);
		
		new FrameGame(panel);
	}

}
