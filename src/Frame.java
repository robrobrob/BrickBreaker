import javax.swing.*;
import java.awt.*;
import java.awt.Component;

/**
 * Created by Robert on 3/10/17.
 */
public class Frame extends JFrame{
	final TheComponent theComponent;
	State state = null;
	public static final int height = 720;
	public static final int width = 720;
	JFrame frame = new JFrame();
//constructors
	public Frame(final BrickBreaker brickBreaker) throws HeadlessException{
		theComponent = new TheComponent(brickBreaker);
		Dimension compPrefSize = new Dimension(720,720);
		theComponent.setPreferredSize(compPrefSize);
		state = new State();
		frame.setOpacity(1);
		frame.setSize(height, width);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Ball ball = new Ball();
		Board board = new Board();
		float ballStartHeight = 25;
		float boardStartPos = 300;
		float boardX = board.xPos;
		board.setXPos(boardStartPos);
		ball.setBallLoc(boardX, ballStartHeight);
		frame.setVisible(true);
		frame.add(BorderLayout.CENTER,theComponent);
	}
//getters
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public TheComponent getComponent(){
		return theComponent;
	}
}
