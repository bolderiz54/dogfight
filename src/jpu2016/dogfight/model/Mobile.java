package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {

	private Direction direction;
	
	private Position position;
	
	private Dimension dimension;
	
	private Image[] images;
	
	private DogfightModel dogfightModel;
	
	/** METHODS */
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.setDirection(direction);
		this.position = position;
		this.dimension = dimension;
		images = new Image[4];
	}
	
	@Override
	public Direction getDirection() {
		return direction;
	}

	@Override
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	@Override
	public Point getPosition() {
		return new Point();
	}

	@Override
	public Dimension getDimension() {
		return dimension;
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public int getSpeed() {
		return 0;
	}

	@Override
	public Image getImage() {
		return null;
	}

	@Override
	public void move() {
		
	}

	@Override
	public void placeInArea(IArea area) {
		
	}

	@Override
	public boolean isPlayer(int player) {
		return false;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}

	@Override
	public boolean hit() {
		return false;
	}

	@Override
	public boolean isWeapon() {
		return false;
	}
	
}
