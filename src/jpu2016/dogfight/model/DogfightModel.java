package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class DogfightModel extends Observable implements IDogfightModel {

	private Sky sky;
	
	private ArrayList<IMobile> mobiles;
	
	/** METHODS */
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
	public void addMobile(IMobile mobile) {
		
	}

	@Override
	public void removeMobile(IMobile mobile) {
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return mobiles;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
	}
	
}
