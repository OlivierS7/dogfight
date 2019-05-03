package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

public class DogfightView implements IViewSystem, Runnable {
	
	private final EventPerformer eventPerformer;
	private final GameFrame gameFrame;
	private final GraphicsBuilder graphicsBuilder;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		eventPerformer = new EventPerformer(orderPerformer);
		graphicsBuilder = new GraphicsBuilder(dogfightModel);
		gameFrame = new GameFrame("Titre", eventPerformer, graphicsBuilder, observable);
		
	}
	
	public void run() {
		
	}

	@Override
	public void displayMessage(String msg) {
		displayMessage("Que la partie commence !");
	}

	@Override
	public void closeAll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	

}
