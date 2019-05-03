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
	private DogfightModel dogfightModel;

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

	public IDogfightModel getDogfightModel() {
		return this.dogfightModel;
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return this.direction;
	}

	@Override
	public void setDIrection(Direction direction) {
		// TODO Auto-generated method stub
		this.direction = direction;
	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return this.position;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return this.dimension;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return this.dimension.getWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return this.dimension.getHeight();
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return this.speed;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return this.images[direction.ordinal()];
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		switch (this.direction) {
		case UP:
			this.moveUp();
			break;
		case DOWN:
			this.moveDown();
			break;
		case LEFT:
			this.moveLeft();
			break;
		case RIGHT:
			this.moveRight();
			break;
		default:
			break;
		}
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
		this.dogfightModel = dogfightModel;
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
