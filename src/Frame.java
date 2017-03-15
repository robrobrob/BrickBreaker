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
	JPanel panel = new JPanel();
//constructors
	public Frame(final BrickBreaker brickBreaker) throws HeadlessException{
		frame.add(panel);
		theComponent = new TheComponent(brickBreaker);
		Dimension compPrefSize = new Dimension(720,720);
		theComponent.setPreferredSize(compPrefSize);
		Dimension panelPrefSize = new Dimension(720,720);
		panel.setPreferredSize(panelPrefSize);
		state = new State();
		frame.setOpacity(1);
		panel.setOpaque(true);
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
		panel.setVisible(true);
	}
//getters
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public JPanel getJPanel(){return panel;}
}
