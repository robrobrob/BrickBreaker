import com.sun.prism.paint.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics2D.*;
import java.awt.Paint;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Robert on 3/10/17.
 */
public class TheComponent extends JPanel{
	@Override
	public void paintComponent(Graphics g) {
		//paint component setup
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		//Set Render Hints
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT);
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	/*
	g.setColor(Color.BLACK);
	GradientPaint gradient = new GradientPaint(0,0,Color.ORANGE,720,720,Color.BLUE);
	g2.setPaint(gradient);
	g2.fillRect(100,100,500,500);
	*/
		g2.setColor(Color.BLACK);
		g2.drawRect(10, 10, 700, 700);

	}

	//TODO: Finish draw ball, board, others.
	private void drawBall(Graphics g) {

	}
}
