package service;

import java.awt.Point;

import dto.GameDto;
import entity.GameAct;

public class GameService {
	
	private GameDto dto;

	public GameService(GameDto dto) {
		this.dto = dto;
		GameAct act = new GameAct();
		dto.setGameAct(act);
	}
	
	public void keyUp() {
		this.dto.getGameAct().round();
	}

	public void keyDown() {
		if(!this.dto.getGameAct().move(0, 1)) {
			boolean[][] map = this.dto.getGameMap();
			Point[] act = this.dto.getGameAct().getActPoint();
			for (int i = 0; i < act.length; i++) {
			
			}
		}
	}

	public void keyRight() {
		this.dto.getGameAct().move(1, 0);
	}

	public void keyLeft() {
		this.dto.getGameAct().move(-1, 0);
	}
	

}
