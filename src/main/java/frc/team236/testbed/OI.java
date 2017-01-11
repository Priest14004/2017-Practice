package frc.team236.testbed;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team236.testbed.commands.ManualTurret;

public class OI {
	public Joystick leftStick;
	public Joystick rightStick;
	public Joystick controller;
	
	public JoystickButton manualTurret;
	
	public OI() {
		leftStick = new Joystick(ControlMap.LEFT_PORT);
		rightStick = new Joystick(ControlMap.RIGHT_PORT);
		controller = new Joystick(ControlMap.CONTROLLER_PORT);
		
		manualTurret = new JoystickButton(controller, ControlMap.Controller.MANUAL_TURRET);
		manualTurret.whileHeld(new ManualTurret());
	}
}