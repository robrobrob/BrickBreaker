import java.awt.geom.Point2D;

/**
 * Created by Robert on 4/5/17.
 */
public class BallData {
	Point2D.Float ballLoc;
	float ballAngle;
	int speed;
	public BallData(Point2D.Float ballLoc, float ballAngle, int speed){
		this.speed = speed;
		this.ballAngle = ballAngle;
		this.ballLoc = ballLoc;

	}
}
