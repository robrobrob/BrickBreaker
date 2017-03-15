import java.awt.*;
import java.awt.geom.Point2D;
import java.beans.Visibility;
import java.math.MathContext;

/**
 * Created by Robert on 3/10/17.
 */
public class Arrow {
	float arrowAngle;
	Point2D.Float arrowLocation;
	boolean visibility;

//TODO: make arrow have angles using 2darc
//constructor
	public Arrow() {
		float arrowAngle = 0;
		arrowLocation = null;
		boolean visibility = true;
	}
//getters
	public float getArrowAngle(){
		return arrowAngle;
	}
	public Point2D.Float getArrowLocation() {
		return arrowLocation;
	}
	public boolean getVisibility(){
		return visibility;
	}
//setsetrs
	public void setArrowAngle(float wewArrowAngle){
		arrowAngle = wewArrowAngle;
	}
	public void setArrowLocation(Point2D.Float newArrowLocation){
		arrowLocation = newArrowLocation;
	}
	public void setVisibility(boolean wewvisibility){
		visibility = wewvisibility;
	}
}
