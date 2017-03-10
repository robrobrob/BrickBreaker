import javax.swing.*;
import java.awt.*;
import java.text.Format;
import java.text.NumberFormat;

/**
 * Created by p2_2 on 3/10/17.
 */
public class BrickBreaker {
	public static void main(String[] args) {
/*		double x = Math.atan2(y,x);
*		double y = x*(180/Math.PI);
*		float c = new Float(y);
*		System.out.println(y);
*		float z = 90-c;
*		System.out.println(z);
*/
//setup
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
		frame.setSize(810,800);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}
