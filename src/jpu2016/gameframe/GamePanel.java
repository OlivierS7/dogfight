package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {

	private static final long serialVersionUID = 2729922620999903444L;
	private IGraphicsBuilder graphicsBuilder;
	
	public GamePanel(IGraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
	}
	
	public void paintComponent (Graphics graphic) {
		graphicsBuilder.applyModelToGraphic(graphic, this);
	}
	
}
