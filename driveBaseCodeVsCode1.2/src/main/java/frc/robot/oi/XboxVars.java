package frc.robot.oi;

import edu.wpi.first.wpilibj.XboxController;

public class XboxVars {
	public static XboxController xbox;
	
	public XboxVars() {
		xbox = new XboxController(1);
	}
}
