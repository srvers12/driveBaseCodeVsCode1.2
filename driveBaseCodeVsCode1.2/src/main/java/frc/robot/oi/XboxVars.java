package frc.robot.oi;

// REVISIONS
//100123 - drivebase rev

import edu.wpi.first.wpilibj.XboxController;

public class XboxVars {
	public static XboxController xbox;
	
	public XboxVars() {
		xbox = new XboxController(1);
	}
}
