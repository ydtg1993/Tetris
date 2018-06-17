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

	public void keyUp() {
		this.gameService.keyUp();
		this.panelGame.repaint();
	}

	public void keyDown() {
		this.gameService.keyDown();
		this.panelGame.repaint();
	}

	public void keyRight() {
		this.gameService.keyRight();
		this.panelGame.repaint();
	}

	public void keyLeft() {
		this.gameService.keyLeft();
		this.panelGame.repaint();
	}

}
