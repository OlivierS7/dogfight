package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {

	private int speed;
	private Direction direction;
	private Image images[];
	private Dimension dimension;
	private Position position;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.speed = speed;
		this.dimension = dimension;
		this.position = position;
		this.direction = direction;
	}

	private void moveUp() {

	}

	private void moveDown() {

	}

	private void moveLeft() {

	}

	private void moveRight() {

	}

	public Color getColor() {
		return null;
	}

	public IDogfightModel getDogfightModel() {
		return null;
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDIrection(Direction direction) {
		// TODO Auto-generated method stub

	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

}
