package dto;

public class Player {
	
	private String name;
	
	private int paint;
	
	public Player(String name, int paint) {
		super();
		this.name = name;
		this.paint = paint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaint() {
		return paint;
	}

	public void setPaint(int paint) {
		this.paint = paint;
	}

}
