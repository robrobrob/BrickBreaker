import java.awt.geom.Point2D;
import java.lang.Math;

/**
 * Created by Robert on 3/13/17.
 */
public class Engine {
//Constructor
	public Engine(BrickBreaker brickbreaker){
		tick();
	}
	public void tick(){

	}
	public float ballCollide(Ball ball){
		Point2D.Float ballLoc= ball.getBallLoc();
		double abscissa = ballLoc.getY();
		double ordinate = ballLoc.getX();
		double ballAngle = Math.atan2(abscissa,ordinate);
		Double degrees = Math.toDegrees(ballAngle);
		float ballAngleFloat = degrees.floatValue();
		if (ballAngleFloat>0 && ballAngle<90){
			float reflectionAngle1 = ballAngleFloat+90;
			return reflectionAngle1;
		}
		if (ballAngleFloat>90 && ballAngleFloat<180){
			float reflectionAngle2 = (180-ballAngleFloat)-90;
			return reflectionAngle2;
		}
		if (ballAngleFloat>180 && ballAngleFloat<270){
			float interStep = 270-ballAngleFloat;
			float reflectionAngle3 = 360-(90-interStep);
			return reflectionAngle3;
		}
		if (ballAngleFloat>270 && ballAngleFloat<360){
			float interStep = ((90-(360-ballAngleFloat))+90)+
			float 2(360-ballAngleFloat);
		}
	}
}
