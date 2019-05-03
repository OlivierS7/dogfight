package jpu2016.dogfight.controller;

public class userOrder implements IUserOrder{
	private int player;

	public int getPlayer() {
		return player;
	}

	@Override
	public Order getOrder() {
		return null;
	}

}
