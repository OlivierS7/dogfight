package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {

	private BufferedImage emptySky;
	private final IDogfightModel dogfightModel;
	
	public GraphicsBuilder(IDogfightModel dogfightModel) {
		try {
			emptySky = ImageIO.read(new File("jdqj.png"));
		} 
		catch (IOException e) {
			e.printStackTrace();
			emptySky = null;
		}
		this.dogfightModel = dogfightModel;
		
	}
	
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		
	}
	
	private void buildEmptySky() {
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	
	public int getGlobalWidth() {
		return 1;
	}
	
	public int getGlobalHeight() {
		return 1;
	}

	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}


	
}
