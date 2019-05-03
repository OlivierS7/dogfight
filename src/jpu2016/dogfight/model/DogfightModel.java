package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel{
	
	private Sky sky;
	private ArrayList<IMobile> mobiles;
	
	public DogfightModel() {
		mobiles = new ArrayList<IMobile>();
	}
	@Override
	public IArea getArea() {
		return this.sky;
	}
	@Override
	public void buildArea(Dimension dimension) {
		this.sky = new Sky(dimension);
	}
	@Override
	public void addMobile(IMobile Mobile) { 
		Mobile.setDogfightModel(this);
		this.mobiles.add(Mobile);
	}
	@Override
	public ArrayList<IMobile> getMobiles() {
		return mobiles;
	}
	@Override
	public IMobile getMobileByPlayer(int player) {
		for (IMobile temp : mobiles) {
			if (temp.isPlayer(player)) {
				return temp;
			}
		}
		return null;
	}
	@Override
	public void setMobilesHavesMoved() {
		notifyObservers();
	}
}
