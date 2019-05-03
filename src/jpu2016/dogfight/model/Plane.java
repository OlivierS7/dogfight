package jpu2016.dogfight.model;

import java.util.ArrayList;

public class Plane extends Mobile {

	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;

	public Plane(int player, Direction direction, Position position, String image) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		this.player = player;
	}

	public boolean isPlayer(int player) {
		return this.player == player;
	}

	public boolean hit() {
		ArrayList<IMobile> list = this.getDogfightModel().getMobiles();
		for (IMobile temp : list) {
			if (temp.isWeapon()) {
				
			}
		}
	}

}
