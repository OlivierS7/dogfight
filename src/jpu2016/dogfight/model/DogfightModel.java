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
		return null;
	}
	@Override
	public void buildArea(Dimension dimension) {
		
	}
	@Override
	public void addMobile(IMobile Mobile) {
		
	}
	@Override
	public ArrayList<IMobile> getMobiles() {
		return null;
	}
	@Override
	public IMobile getMobileByPlayer(int player) {
		return null;
	}
	@Override
	public void setMobilesHavesMoved() {
		
	}
}
