package frc.team236.testbed;

import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team236.testbed.subsystems.Turret;
import frc.team236.ticktank.ControllerType;
import frc.team236.ticktank.Settings;
import frc.team236.ticktank.TickTank;
import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;

public class RobotModule extends IterativeModule {

    public static Logger logger;
    
    public static OI oi;
    
    // Subsystems
    public static TickTank tank;
    public static Turret turret;

    @Override
    public String getModuleName() {
        return "Testbed";
    }

    @Override
    public String getModuleVersion() {
        return "1.1.0";
    }

    @Override
    public void robotInit() {
    	oi = new OI();
        logger = new Logger("Testbed", Logger.ATTR_DEFAULT);
        
        // Define drive settings
        Settings config = new Settings();
        config.controllerType = ControllerType.VICTOR;
        config.hasGyro = false;
        config.hasEncoders = false;
        config.motorCount = 2;
        config.leftStick = oi.leftStick;
        config.rightStick = oi.rightStick;
        
        // Create drive
        tank = new TickTank(config);
        turret = new Turret();
    }
}
