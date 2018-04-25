package jpu2016.dogfight.model;

import java.awt.Image;

public class Sky implements IArea {

	private Image image;
	
	private Dimension dimension;
	
	public Sky(Dimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public Dimension getDimension() {
		return dimension;
	}

	@Override
	public Image getImage() {
		return image;
	}
	
}
