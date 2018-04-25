package jpu2016.dogfight.model;

public class Missile extends Mobile {

	private static final int SPEED = 4;
	
	private static final int WIDTH = 30;
	
	private static final int HEIGHT = 10;
	
	private static final int MAX_DISTANCE_TRAVELED = 1400;
	
	private static final String IMAGE = "missile";
	
	private int distanceTraveled = 0;
	
	/** METHODS */
	public Missile(Direction direction, Dimension dimension) {
		super(direction, new Position(0, 0, 0, 0), new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
	}
	
	public static int getWidthWithADirection(Direction direction) {
		return 0;
	}
	
	public static int getHeightWithADirection(Direction direction) {
		return 0;
	}
	
	public void move() {
		
	}
	
	public boolean isWeapon() {
		return false;
	}
	
}
