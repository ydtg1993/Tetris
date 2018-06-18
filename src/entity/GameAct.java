package entity;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class GameAct {

	private Point[] actPoint;
	
	/**
	 * 编号
	 */
	private int typeCode;
	
	private static int MIN_X = 0;
	private static int MAX_X = 9;
	private static int MIN_Y = 0;
	private static int MAX_Y = 17;
	
	private static List<Point[]> TYPE_CONFIG;
	
	static {
		TYPE_CONFIG = new ArrayList<Point[]>(7);
		TYPE_CONFIG.add(new Point[] {new Point(4,0),new Point(3,0),new Point(5,0),new Point(6,0)});
		TYPE_CONFIG.add(new Point[] {new Point(4,0),new Point(3,0),new Point(5,0),new Point(4,1)});
		TYPE_CONFIG.add(new Point[] {new Point(4,0),new Point(3,0),new Point(5,0),new Point(3,1)});
		TYPE_CONFIG.add(new Point[] {new Point(4,0),new Point(3,0),new Point(5,0),new Point(4,1)});
		TYPE_CONFIG.add(new Point[] {new Point(4,0),new Point(5,1),new Point(5,0),new Point(4,1)});
		TYPE_CONFIG.add(new Point[] {new Point(4,0),new Point(3,0),new Point(5,0),new Point(5,1)});
		TYPE_CONFIG.add(new Point[] {new Point(4,0),new Point(3,0),new Point(5,1),new Point(4,1)});
	}
	
	public GameAct(int typeCode) {
		this.init(typeCode);
	}
	
	public void init(int typeCode) {
		this.typeCode = typeCode;
		Point[] point = TYPE_CONFIG.get(typeCode);
		actPoint = new Point[point.length];
		for (int i = 0; i < point.length; i++) {
			actPoint[i] = new Point(point[i].x,point[i].y);
		}
	}

	public int getActCode() {
		return typeCode;
	}

	public Point[] getActPoint() {
		return actPoint;
	}
	
	public boolean move(int moveX,int moveY,boolean[][] gameMap) {
		for(int i = 0;i< actPoint.length;i++) {
			int newX = actPoint[i].x + moveX;
			int newY = actPoint[i].y + moveY;
			if(this.isOverMap(newX,newY,gameMap)) {
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
	 * 顺时针A.x = O.y + O.x - B.y
	 * 
	 * 逆时针A.y = O.y - O.x + B.x
	 */
	public boolean round(boolean[][] gameMap) {
		if(this.typeCode == 4) {
			return true;
		}
		for(int i = 1;i < actPoint.length;i++) {
			int newX = actPoint[0].y + actPoint[0].x - actPoint[i].y;
			int newY = actPoint[0].y - actPoint[0].x + actPoint[i].x;
			
			if(this.isOverMap(newX,newY,gameMap)) {
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

	private boolean isOverMap(int x,int y,boolean[][] gameMap) {
		return x < MIN_X || x > MAX_X || y < MIN_Y || y > MAX_Y || gameMap[x][y];
	}
}
