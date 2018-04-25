package jpu2016.dogfight.model;

public class Plane extends Mobile {

	private static final int SPEED = 2;
	
	private static final int WIDTH = 100;
	
	private static final int HEIGHT = 30;
	
	private int player;
	
	/** MEHTODS */
	public Plane(int player ,Direction direction, Position position, String image) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		this.player = player;
	}

	public boolean isPlayer(int player) {
		return false;
	}
	
	public boolean hit() {
		return false;
	}
	
}
