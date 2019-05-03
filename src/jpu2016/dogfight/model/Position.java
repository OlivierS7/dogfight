package jpu2016.dogfight.model;

public class Position {

	private double x;
	private double y;
	private double maxX;
	private double maxY;

	public Position(double x, double y, double maxX, double maxY) {
		this.maxX = maxX;
		this.maxY = maxY;
		this.x = x;
		this.y = y;
	}

	public Position(Position position) {
		this.x = position.x;
		this.y = position.y;
		this.maxX = position.maxX;
		this.maxY = position.maxY;
	}

	public double getX() { 
		return x;
	}

	public void setX(double x) {
		this.x = x % maxX;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = (y+maxY) % maxY;
	}

	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}

}
