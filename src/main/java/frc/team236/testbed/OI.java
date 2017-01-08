package frc.team236.testbed;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	public Joystick leftStick;
	public Joystick rightStick;
	
	public OI() {
		leftStick = new Joystick(ControlMap.LEFT_PORT);
		rightStick = new Joystick(ControlMap.RIGHT_PORT);
	}
}