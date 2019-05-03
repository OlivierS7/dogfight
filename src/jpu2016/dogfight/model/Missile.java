package jpu2016.dogfight.model;

public class Missile extends Mobile {

	private static final int SPEED = 4;
	private static final int WIDTH = 30;
	private static final int HEIGHT = 10;
	private static final int MAX_DISTANCE_TRAVELED = 1400;
	private static final String IMAGE = "missile";
	private int distanceTraveled = 0;

	public Missile(Direction direction, Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
	}

	public final int getWidthWithADirection(Direction direction) {
		return 0;
	}

	public final int getHeightWithADirection(Direction direction) {
		return 0;
	}

	public void move() {
		super.move();
		this.distanceTraveled+=SPEED;
	}

	public boolean isWeapon() {
		return true;
	}

}
