package frc.robot.sensors;

import edu.wpi.first.wpilibj.AnalogInput;
// todo - needs to be completed
// REVISION LEVEL:
// 190123 - drivebase rev
// 181218 - cleaning up code

public class AnalogUltrasonic {
	AnalogInput sensor = new AnalogInput(1);
	double voltage;
	double distance;

	public AnalogUltrasonic(AnalogInput sensor) {
		voltage = sensor.getVoltage();
		
	}
	public double getDistance(){
		voltage = sensor.getVoltage();
		
		return voltage;
	}
}
