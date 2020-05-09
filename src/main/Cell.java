package main;

public class Cell {
	private int x;
	private int y;
	
	public Cell (int coord_x, int coord_y) {
		x = coord_x;
		y = coord_y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
