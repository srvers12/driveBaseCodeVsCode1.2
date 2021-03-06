package frc.robot.oi;

//REVSISONS
// 190123 - drivebase rev

public class DriverIF {

	// REVISIONS
	// 181102 - edited to just support drive base
	
	XboxIF xboxIF;
	// Constructor
	public DriverIF() {
		xboxIF = new XboxIF();
	}
	// driver game controller methods
	public double getThrottleAxis() {
		return xboxIF.LEFT_JOYSTICK_Y();	
	}
	public double getTurnAxis() {
		return xboxIF.RIGHT_JOYSTICK_X();
	}
	public double getWheelAxis() {
		return xboxIF.RIGHT_JOYSTICK_Y();
	}
	public double getMecanumShiftSidewaysBtn() {
		return xboxIF.LEFT_TRIGGER();
	}
	
}
