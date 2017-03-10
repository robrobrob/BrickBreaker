/**
 * Created by Robert on 3/10/17.
 */
public class Brick {
	Location brickLoc;
	String type;
	float brickAngle;
	int health;
	Area brickArea;
//constructors
	public Brick(){
		brickLoc = null;
		type = null;
		brickAngle = 0;
		health = 100;
		brickArea = null;
	}
//getters
	public Location getBrickLoc(){
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
	public Area getBrickArea(){
		return brickArea;
	}
//setters
	public void setBrickLoc(Location newLoc){
		brickLoc = newLoc;
	}
	public void setLoc(float xPos, float yPos){
		brickLoc = new Location(xPos,yPos);
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
	public void setArea(Area newArea){
		brickArea = newArea;
	}
	public void setArea(Location newLoc, float newXSize, float newYSize){
		brickArea = new Area(newLoc,newXSize,newYSize);
	}
}


