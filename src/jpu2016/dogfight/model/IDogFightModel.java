package jpu2016.dogfight.model;

import java.util.ArrayList;

public interface IDogFightModel {
	public IArea getArea();

	public void buildArea();

	public void addMobile();

	public void removeMobile();

	public ArrayList<IMobile> getMobiles();

	public IMobile getMobileByPlayer(int player);

	public void setMobilesHavesMoved();
	
}