// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package com.nashobarobotics;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import com.nashobarobotics.commands.*;
import com.nashobarobotics.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot 
{
    private int dashboardCounter = 0;
    Command autonomousCommand;
    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Drive drive;
    public static Shooter shooter;
    public static Track track;
    public static Tipping tipping;
    public static PneumaticsCompressor pneumaticsCompressor;
    public static ArticulatingArm articulatingArm;
    public static FixedArm fixedArm;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() 
    {
	RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drive = new Drive();
        shooter = new Shooter();
        track = new Track();
        tipping = new Tipping();
        pneumaticsCompressor = new PneumaticsCompressor();
        articulatingArm = new ArticulatingArm();
        fixedArm = new FixedArm();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
	
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        autonomousCommand = new AutonomousCommand();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
    }
    public void autonomousInit() 
    {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() 
    {
        Scheduler.getInstance().run();
    }
    public void teleopInit() 
    {
        
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() 
    {
        dashboardCounter++;
	double timesPerSecond = 5.0;

	timesPerSecond = SmartDashboard.getNumber("SD Times Per Second");

	if(timesPerSecond < 0)
	{
		timesPerSecond = 1;
	}
	int updateRate = (int)((50/timesPerSecond) + 0.5);
	if((dashboardCounter % updateRate) == 0)
	{
		//High Pressure Limit Sensor
		SmartDashboard.putBoolean("Pressure Limit Sensor", RobotMap.pneumaticsCompressorDigitalInput1.get());
		
		SmartDashboard.putNumber("Gyro Sensor", Robot.drive.getGyroAngle());
		SmartDashboard.putNumber("Track Analog Force 1", RobotMap.trackAnalogForce1.getVoltage());
		SmartDashboard.putNumber("Track Analog Force 2", RobotMap.trackAnalogForce2.getVoltage());
		
		//Subsystems
		SmartDashboard.putData(Robot.drive);
		SmartDashboard.putData(Robot.track);
		SmartDashboard.putData(Robot.shooter);
		SmartDashboard.putData(Robot.tipping);
		SmartDashboard.putData(Robot.articulatingArm);
		SmartDashboard.putData(Robot.pneumaticsCompressor);
	}
        Scheduler.getInstance().run();
    }
    /**
     * This function called periodically during test mode
     */
    public void testPeriodic() 
    {
        
    }
}
