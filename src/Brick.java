import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Robert on 3/10/17.
 */
public class Brick {
	Point2D.Float brickLoc;
	String type;
	float brickAngle;
	int health;
	Rectangle2D.Float brickArea;
//constructors
	public Brick(){
		brickLoc = null;
		type = null;
		brickAngle = 0;
		health = 100;
		brickArea = null;
	}
//getters
	public Point2D.Float getBrickLoc(){
		return brickLoc;
	}
	public String getType(){
		return type;
	}
	public float getBrickAngle(){
		return brickAngle;
	}
	public int getHealth(){
		return health;
	}
	public Rectangle2D.Float getBrickArea(){
		return brickArea;
	}
//setters
	public void setBrickLoc(Point2D.Float newLoc){
		brickLoc = newLoc;
	}
	public void setLoc(float xPos, float yPos) {
		brickLoc = new Point2D.Float(xPos, yPos);
	}
	public void setType(String newType){
		type = newType;
	}
	public void setBrickAngle(float newAngle){
		brickAngle = newAngle;
	}
	public void setHealth(int newHealth){
		health = newHealth;
	}
	public void setArea(Rectangle2D.Float newArea){
		brickArea = newArea;
	}
	public void setArea(Point2D.Float newLoc, float newXSize, float newYSize){
		float x = newLoc.x;
		float y = newLoc.y;
		brickArea = new Rectangle2D.Float(x,y,newXSize,newYSize);
	}
}


