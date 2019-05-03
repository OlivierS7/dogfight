package jpu2016.dogfight.model;

public class Cloud extends Mobile {

	private static final int SPEED = 1;
	private static final int WIDTH = 300;
	private static final int HEIGHT = 150;
	private static final String IMAGE = "cloud";

	public Cloud(Direction direction, Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
	}

}
