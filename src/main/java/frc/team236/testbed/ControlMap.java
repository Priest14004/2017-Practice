package frc.team236.testbed;

import frc.team236.testbed.lib.LogitechF310;

public class ControlMap {
	public static final int LEFT_PORT = 0;
	public static final int RIGHT_PORT = 1;
	public static final int CONTROLLER_PORT = 2;
	
	public class Controller {
		public static final int MANUAL_TURRET = LogitechF310.LEFT_PRESS;
		public static final int AXIS_HORIZ = LogitechF310.Axes.LEFT_X;
		public static final int AXIS_VERT = LogitechF310.Axes.LEFT_Y;
	}
}
