import javax.swing.*;
import java.awt.*;
import java.awt.Component;

/**
 * Created by Robert on 3/10/17.
 */
public class Frame extends JFrame{
	final TheComponent theComponent;
	State state = null;
	public static final int height = 810;
	public static final int width = 810;
//constructors
	public Frame(final BrickBreaker brickBreaker) throws HeadlessException{
		theComponent = new TheComponent(brickBreaker);
		state = new State();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		Ball ball = new Ball();
		Board board = new Board();
		float ballStartHeight = 5;
		float boardStartPos = 500;
		float boardX = board.xPos;
		board.setXPos(boardStartPos);
		ball.setBallLoc(boardX, ballStartHeight);
		frame.add(panel);
		frame.setSize(height,width);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
//getters
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
}
