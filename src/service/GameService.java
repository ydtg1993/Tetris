package service;

import dto.GameDto;

public class GameService {
	
	private GameDto dto;

	public GameService(GameDto dto) {
		this.dto = dto;
	}

	public void gameTest() {
		// TODO Auto-generated method stub
		int temp = dto.getNowPoint();
		dto.setNowPoint(temp + 1);
	}

}
