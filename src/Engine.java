import java.awt.geom.Point2D;
import java.lang.Math;

/**
 * Created by Robert on 3/13/17.
 */
public class Engine {
	public BallData newBallData;
//Constructor
	public Engine(BrickBreaker brickbreaker){
		Ball ball = brickbreaker.getBall();

	}
	public void tick(){

	}

	public BallData ballCollide(BallData ballData){
		Point2D.Float ballLoc= ballData.ballLoc;
		double abcissa = ballLoc.getY();
		double ordinate = ballLoc.getX();
		double ballAngle = Math.atan2(abcissa,ordinate);
		Double ballAngleD = new Double(ballAngle);
		float ballAngleFloat = ballAngleD.floatValue();
		newBallData.ballAngle = ballAngleFloat;

		return newBallData;
	}
}
