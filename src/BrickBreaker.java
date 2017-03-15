import sun.applet.Main;
import sun.jvm.hotspot.memory.Space;

import javax.swing.*;
import java.awt.*;
import java.text.Format;
import java.text.NumberFormat;

/**
 * Created by p2_2 on 3/10/17.
 */
public class BrickBreaker {
	public Frame frame;
	public PlaySpace space;
	public State state;
	public Ball ball;
	public Board board;
	public Engine engine;
	public Arrow arrow;
	public TheComponent theComponent;
//main
	public static void main(String[] args) {
		new BrickBreaker();
	}
//constructor
	public BrickBreaker(){
		frame = new Frame(this);
		frame.theComponent.setVisible(true);
		space = new PlaySpace();
		space.setHeight(700);
		space.setWidth(700);
	}
//getters
	public Frame getFrame(){return frame;}
	public PlaySpace getPlaySpace() {
		return space;
	}
	public State getState(){return state;}
	public Ball getBall(){return ball;}
	public Board getBoard(){return board;}
	public Engine getEngine(){return engine;}
	public Arrow getArrow(){return arrow;}
	public TheComponent getTheComponent(){return theComponent;}
}
