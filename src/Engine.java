import java.awt.geom.Point2D;
import java.lang.Math;

/**
 * Created by Robert on 3/13/17.r
 */
public class Engine {
//Constructor
	public Engine(BrickBreaker brickbreaker){
		tick();
	}
	public void tick(){

	}
	public float ballCollideSide(Ball ball){
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
			float interStep1 = 270-ballAngleFloat;
			float reflectionAngle3 = 360-(90-interStep1);
			return reflectionAngle3;
		}
		if (ballAngleFloat>270 && ballAngleFloat<360){
			float interStep2 = ((90-(360-ballAngleFloat))+90);
			float reflectionAngle4 = interStep2+2*(360-ballAngleFloat);
			return reflectionAngle4;
		}
		if (ballAngleFloat == 360 || ballAngleFloat == 0){
			float fix1 = 225;
			return fix1;
		}
		if (ballAngleFloat == 180){
			float fix2 = 315;
			return fix2;
		}
		return 0;
	}
	public float ballCollideFlats(Ball ball){
		Point2D.Float ballLoc1= ball.getBallLoc();
		double abscissa1 = ballLoc1.getY();
		double ordinate1 = ballLoc1.getX();
		double ballAngle1 = Math.atan2(abscissa1,ordinate1);
		Double degrees1 = Math.toDegrees(ballAngle1);
		float ballAngleFloat1 = degrees1.floatValue();
		if (ballAngleFloat1>180&&ballAngleFloat1<270){
			float reflectionAngle5 = (180-(2*ballAngleFloat1))+(180-ballAngleFloat1);
			return reflectionAngle5;
		}
		if (ballAngleFloat1>0&&ballAngleFloat1<90){
			float reflectionAngle6 = 2*(180-(ballAngleFloat1+90))+ballAngleFloat1+180;
			return reflectionAngle6;
		}
		if (ballAngleFloat1>90&&ballAngleFloat1<180){
			float reflectionAngle7 = (180-ballAngleFloat1)+180;
			return reflectionAngle7;
		}
		if (ballAngleFloat1>270&&ballAngleFloat1<360){
			float reflectionAngle8 = (360-ballAngleFloat1);
			return reflectionAngle8;
		}
		if (ballAngleFloat1 == 270){
			float fix3 = 45;
			return fix3;
		}
		if (ballAngleFloat1 == 90){
			float fix4 = 180+45;
			return fix4;
		}
		return 0;
	}
}
