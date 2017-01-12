package frc.team236.testbed.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team236.testbed.RobotMap;
import frc.team236.testbed.commands.ManualTurret;
import jaci.openrio.toast.lib.registry.Registrar;
//
//
//
public class Turret extends Subsystem {
	//
	private Encoder yawEncoder, pitchEncoder;
	private SpeedController yawMotor, pitchMotor;
	
	//Pre-Condition:
	//Post-Condition:
	//Bugs:
	/**
	 * Construct a new turret subsystem
	 */
	public Turret() {
		// Instantiate motors
		yawMotor = Registrar.victor(RobotMap.Turret.PWM_YAW);
		pitchMotor = Registrar.victor(RobotMap.Turret.PWM_PITCH);
		
		// Encoders
		//yawEncoder = new Encoder(RobotMap.Turret.DIO_YAW_ENCODER_A, RobotMap.Turret.DIO_YAW_ENCODER_B);
		//pitchEncoder = new Encoder(RobotMap.Turret.DIO_PITCH_ENCODER_A, RobotMap.Turret.DIO_PITCH_ENCODER_B);
	}

	// Set speed to spin yaw motor
	// positive = clockwise
	public void setYawSpeed(double speed) {
		yawMotor.set(speed);
	}

	// Set speed to spin pitch motor
	// positive = up
	public void setPitchSpeed(double speed) {
		pitchMotor.set(speed);
	}
	
	public void stop() {
		setYawSpeed(0);
		setPitchSpeed(0);
	}

	// 
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ManualTurret());
	}
}
