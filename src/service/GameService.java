package service;

import java.awt.Point;
import java.util.Random;

import dto.GameDto;
import entity.GameAct;

public class GameService {
	
	private GameDto dto;
	
	private Random random = new Random();
	
	private static final int MAX_TYPE = 6;

	public GameService(GameDto dto) {
		this.dto = dto;
		GameAct act = new GameAct(random.nextInt(MAX_TYPE));
		dto.setGameAct(act);
	}
	
	public void keyUp() {
		this.dto.getGameAct().round(this.dto.getGameMap());
	}

	public void keyDown() {
		if(this.dto.getGameAct().move(0, 1,this.dto.getGameMap())) {
			return;
		}
		
		boolean[][] map = this.dto.getGameMap();
		Point[] act = this.dto.getGameAct().getActPoint();
		//堆积到地图
		for (int i = 0; i < act.length; i++) {
			map[act[i].x][act[i].y] = true;
		}
		//判断是否能消行
		
		//刷新一个方块
		this.dto.getGameAct().init(this.dto.getNext());
		
		this.dto.setNext(random.nextInt(MAX_TYPE));
	}

	public void keyRight() {
		this.dto.getGameAct().move(1, 0,this.dto.getGameMap());
	}

	public void keyLeft() {
		this.dto.getGameAct().move(-1, 0,this.dto.getGameMap());
	}
	

}
