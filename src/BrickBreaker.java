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
	private Frame frame;
	private PlaySpace space;
	private State state;
//main
	public static void main(String[] args) {
		new BrickBreaker();
	}
//constructor
	public BrickBreaker(){
		frame = new Frame(this);
		frame.theComponent.setVisible(true);
		frame.setVisible(true);
		space = new PlaySpace();
		space.setHeight(800);
		space.setWidth(800);
	}
//getters
	public Frame getFrame(){return frame;}
	public PlaySpace getPlaySpace() {
		return space;
	}
	public State getState(){return state;}
}
