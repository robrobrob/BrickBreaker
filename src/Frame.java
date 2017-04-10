import javax.swing.*;
import java.awt.*;
import java.awt.Component;

/**
 * Created by Robert on 3/10/17.
 */
public class Frame extends JFrame{
	public static final int height = 720;
	public static final int width = 720;
	JFrame frame;
	TheComponent theComponent;
//constructors
	public Frame(final BrickBreaker brickBreaker) throws HeadlessException{
		frame = new JFrame();
		//Setup JFrame
		frame.setVisible(true);
		frame.setOpacity(1);
		frame.setSize(height, width);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		/*
		Ball ball = new Ball();
		Board board = new Board();
		float ballStartHeight = 25;
		float boardStartPos = 300;
		float boardX = board.xPos;
		board.setXPos(boardStartPos);
		ball.setBallLoc(boardX, ballStartHeight);
		*/
		theComponent = new TheComponent();
		frame.getContentPane().add(BorderLayout.CENTER,theComponent);
		JButton repaint = new JButton("Repaint");
		repaint.setVisible(true);
		frame.getContentPane().add(BorderLayout.SOUTH,repaint);
		frame.add(BorderLayout.SOUTH, repaint);
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
