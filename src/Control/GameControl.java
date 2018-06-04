package Control;

import service.GameService;
import ui.PanelGame;

public class GameControl {
	
	private PanelGame panelGame;
	
	private GameService gameService;

	public GameControl(PanelGame panelGame,GameService gameService) {
		// TODO Auto-generated constructor stub
		this.panelGame = panelGame;
		this.gameService = gameService;
	}

	public void test() {
		// TODO Auto-generated method stub
		this.gameService.gameTest();
		this.panelGame.repaint();
	}

}
