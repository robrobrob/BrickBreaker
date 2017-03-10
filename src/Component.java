import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D.*;

/**
 * Created by Robert on 3/10/17.
 */
public class Component extends JComponent {
	private BrickBreaker brickBreaker;
	public Component(BrickBreaker brickBreaker){
		this.brickBreaker = brickBreaker;

		setFocusable(true);
		setPreferredSize();
	}
	public void paintComponent(Graphics g){

		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT);
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g.setColor(Color.GRAY);
		g.fillRect(5,0,805,800);
	}
	private void drawBall(Graphics g){

	}
}
