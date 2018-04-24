package model;

import java.awt.Image;
import java.awt.Point;

public interface IMobile {

	public Direction getDirection();
	
	public void setDirection();
	
	public Point getPosition();
	
	public Dimension getDimension();
	
	public int getWidth();
	
	public int getHeight();
	
	public int getSpeed();
	
	public Image getImage();
	
	public void move();
	
	public void placeInArea(IArea area);
	
	public boolean isPlayer(int player);
	
	public void setDogfightModel(IDogfightModel dogflightModel);
	
	public boolean hit();
	
	public boolean isWeapon();
	
}
