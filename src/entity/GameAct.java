package entity;

import java.awt.Point;

public class GameAct {

	private Point[] actPoint;
	
	private static int MIN_X = 0;
	private static int MAX_X = 9;
	private static int MIN_Y = 0;
	private static int MAX_Y = 17;
	
	public GameAct() {
		actPoint = new Point[] {
				new Point(4,0),
				new Point(3,0),
				new Point(5,0),
				new Point(5,1),
		};
	}

	public Point[] getActPoint() {
		return actPoint;
	}
	
	public boolean move(int moveX,int moveY) {
		for(int i = 0;i< actPoint.length;i++) {
			int newX = actPoint[i].x + moveX;
			int newY = actPoint[i].y + moveY;
			if(this.isOverMap(newX,newY)) {
				return false;
			}
		}
		for(int i = 0;i< actPoint.length;i++) {
			actPoint[i].x += moveX;
			actPoint[i].y += moveY;
		}
		return true;
	}
	
	/**
	 * 顺时针A.x = O.y + O.x -B.y
	 * 
	 * 逆时针A.y = O.y - O.x + B.x
	 */
	public boolean round() {
		for(int i = 1;i < actPoint.length;i++) {
			int newX = actPoint[0].y + actPoint[0].x - actPoint[i].y;
			int newY = actPoint[0].y - actPoint[0].x + actPoint[i].x;
			
			if(this.isOverMap(newX,newY)) {
				return false;
			}
		}
		for(int i = 1;i < actPoint.length;i++) {
			int newX = actPoint[0].y + actPoint[0].x - actPoint[i].y;
			int newY = actPoint[0].y - actPoint[0].x + actPoint[i].x;
			actPoint[i].x = newX;
			actPoint[i].y = newY;
		}
		return true;
	}

	private boolean isOverMap(int x,int y) {
		return x < MIN_X || x > MAX_X || y < MIN_Y || y > MAX_Y;
	}
}
