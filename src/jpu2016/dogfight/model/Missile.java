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

	public static int getWidth(Direction direction) {
		switch (direction) {
		case UP:
			return WIDTH;
		case DOWN:
			return WIDTH;
		case LEFT:
			return HEIGHT;
		case RIGHT:
			return HEIGHT;
		default:
			return 0;
		}
	}

	public static int getHeight(Direction direction) {
		switch (direction) {
		case UP:
			return HEIGHT;
		case DOWN:
			return HEIGHT;
		case LEFT:
			return WIDTH;
		case RIGHT:
			return WIDTH;
		default:
			return 0;
		}
	}

	public void move() {
		super.move();
		this.distanceTraveled += SPEED;
	}

	public boolean isWeapon() {
		return true;
	}

}
