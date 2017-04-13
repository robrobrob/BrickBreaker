import javax.swing.*;
import java.awt.*;
import java.awt.Component;

/**
 * Created by Robert on 3/10/17.
 */
public class Frame extends JFrame{
	public static final int height = 720;
	public static final int width = 720;
	JPanel panel;
	TheComponent theComponent;
//constructors
	public Frame(final BrickBreaker brickBreaker) throws HeadlessException{
		//Setup JFrame
		setVisible(true);
		setOpacity(1);
		setSize(width, height);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
		getContentPane().add(BorderLayout.CENTER, theComponent);
		JButton repaint = new JButton("Repaint");
		repaint.setVisible(true);
		getContentPane().add(BorderLayout.SOUTH,repaint);
		add(BorderLayout.SOUTH, repaint);
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
