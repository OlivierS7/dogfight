package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder{
	private int player;

	public UserOrder(int player, Order order) {
		this.player = player;
	}

	public int getPlayer() {
		return player;
	}

	@Override
	public Order getOrder() {
		return null;
	}

}