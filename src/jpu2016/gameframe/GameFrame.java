package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.javafx.scene.traversal.Direction;

import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;

public class GameFrame extends JFrame implements KeyListener {

	private static final long serialVersionUID = -5668703518358074589L;
	private IEventPerformer eventPerformer;
	
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		GamePanel panel = new GamePanel(graphicBuilder);
		setContentPane(panel);
		setSize(1280, 720);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		observable.addObserver(panel);
		eventPerformer = performer;
	}
	
	public void keyPressed(KeyEvent keyEvent) {
		if(keyEvent.getKeyCode() == KeyEvent.VK_Z) {
			
		}
		else if(keyEvent.getKeyCode() == KeyEvent.VK_Q) {
			
		}
		else if(keyEvent.getKeyCode() == KeyEvent.VK_D) {
			
		}
		else if(keyEvent.getKeyCode() == KeyEvent.VK_S) {
			
		}
		else if(keyEvent.getKeyCode() == KeyEvent.VK_H) {
			
		}
		
	}
	
	public void keyReleased(KeyEvent keyEvent) {}

	public void keyTyped(KeyEvent keyEvent) {}

}
