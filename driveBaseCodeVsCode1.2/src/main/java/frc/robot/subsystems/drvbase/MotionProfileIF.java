package frc.robot.subsystems.drvbase;

// Profiles are stored in directory robot\profiles
import frc.robot.subsystems.drvbase.profile.DriveStraightLine;

public class MotionProfileIF {
	private SRXDriveBase driveBase;
	private boolean isSRXMotionProfileActive = false;
	private DriveStraightLine profileData;
	// Constructor
	public MotionProfileIF(SRXDriveBase _driveBase){
		driveBase = _driveBase;
	} 

	public void init(){
		isSRXMotionProfileActive = false;
	}
	
	//NEED THE FOLLOWING METHOD FOR EACH PROFILE ADDED TO THIS CLASS IN robot\profiles
	public boolean DriveStraight() {
		if(!isSRXMotionProfileActive){
			// Create and instance of the DriveStraightLine class 
			DriveStraightLine profileData = new DriveStraightLine();
			isSRXMotionProfileActive = true;
		} else {
			//public boolean SRXProfileMove(double[][] _profileRight, double[][] _profileLeft, int _totalPointNum)
			if(!driveBase.SRXProfileMove(profileData.PointsRight, 
										 profileData.PointsLeft, 
										 profileData.kNumPoints)){
				isSRXMotionProfileActive = false;
			};
		}
		return isSRXMotionProfileActive;
	}
}


