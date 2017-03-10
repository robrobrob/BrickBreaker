import sun.plugin2.message.GetAppletMessage;

import java.awt.geom.Point2D;

/**
 * Created by Robert on 3/10/17.
 */
public class Ball {
	Point2D.Float ballLoc;
	float ballAngle;
	int speed;
//consstructors
	public Ball(){
		ballLoc = null;
		ballAngle = 0;
		speed = 0;
	}
//getters
	public Point2D.Float getBallLoc(){
		return ballLoc;
	}
	public float getBallAngle(){
		return ballAngle;
	}
	public int getSpeed(){
		return speed;
	}
//setters
	public void setBallLoc(Point2D.Float newLoc){
		ballLoc = newLoc;
	}
	public void setBallLoc(float xPos, float yPos){
		ballLoc = new Point2D.Float(xPos,yPos);
	}
	public void setBallAngle(float newAngle){
		ballAngle = newAngle;
	}
	public void setSpeed(int newSpeed){
		speed = newSpeed;
	}
}
