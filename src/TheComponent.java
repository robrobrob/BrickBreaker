import com.sun.prism.paint.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics2D.*;
import java.awt.geom.Point2D;

/**
 * Created by Robert on 3/10/17.
 */
public class TheComponent extends JPanel {
//TODO: make paintComponent actually get called.
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		//super.paintComponent(g2);
		/*
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT);
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g.setColor(Color.BLACK);
		*/
		GradientPaint gradient = new GradientPaint(0,0,Color.BLACK,720,720,Color.WHITE);
		g2.setPaint(gradient);
		g2.fillRect(100,100,100,100);
	}
//TODO: Finish draw ball, board, others.
	private void drawBall(Graphics g){

	}
}
