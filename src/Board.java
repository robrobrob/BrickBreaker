/**
 * Created by Robert on 3/10/17.
 */
public class Board {
	float xPos;
	boolean canMove;
	public Board(){
		float xPos = 0;
		boolean canMove = false;
	}
//getters
	public float getXPos(){
		return xPos;
	}
	public boolean getCanMove(){
		return canMove;
	}
//setters
	public void setXPos(float newXPos){
		xPos = newXPos;
	}
	public void setCanMove(boolean newBoolean){
		canMove = newBoolean;
	}
}
