import sun.plugin2.message.GetAppletMessage;

/**
 * Created by Robert on 3/10/17.
 */
public class Ball {
	Location ballLoc;
	float ballAngle;
	int speed;
//consstructors
	public Ball(){
		ballLoc = null;
		ballAngle = 0;
		speed = 0;
	}
//getters
	public Location getBallLoc(){
		return ballLoc;
	}
	public float getBallAngle(){
		return ballAngle;
	}
	public int getSpeed(){
		return speed;
	}
//setters
	public void setBallLoc(Location newLoc){
		ballLoc = newLoc;
	}
	public void setBallLoc(float xPos, float yPos){
		ballLoc = new Location(xPos,yPos);
	}
	public void setBallAngle(float newAngle){
		ballAngle = newAngle;
	}
	public void setSpeed(int newSpeed){
		speed = newSpeed;
	}
}
