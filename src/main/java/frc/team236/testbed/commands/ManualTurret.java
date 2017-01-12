package frc.team236.testbed.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team236.testbed.RobotModule;
import frc.team236.testbed.lib.LogitechF310;

public class ManualTurret extends Command {

	@Override
	protected void initialize() {
		requires(RobotModule.turret);
		RobotModule.turret.stop();
	}

	@Override
	protected void execute() {
		RobotModule.turret.setPitchSpeed(RobotModule.oi.controller.getRawAxis(LogitechF310.Axes.LEFT_Y));
		RobotModule.turret.setYawSpeed(RobotModule.oi.controller.getRawAxis(LogitechF310.Axes.LEFT_X));
		
	}

	// Run until the command is interrupted
	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		// Stop turret to avoid post-conditions
		RobotModule.turret.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}


}
