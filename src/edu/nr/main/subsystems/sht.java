// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package edu.nr.main.subsystems;
import edu.nr.main.commands.ShooterIdleCommand;
import edu.nr.main.robot_map;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class sht extends Subsystem 
{
    private double m_speed = 0.0;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANJaguar jag = robot_map.shooterJag;
    DoubleSolenoid loaderSolenoid = robot_map.shooterLoaderSolenoid;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() 
    {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new ShooterIdleCommand());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //(new MySpecialCommand());
    }
    
    public void deployLoader()
    {
	loaderSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    public void undeployLoader()
    {
	loaderSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void setSpeed(double speed)
    {
	m_speed = speed;
	try
	{
	    jag.setX(m_speed);
	}
	catch(CANTimeoutException e)
	{
	    System.out.println("Exception caught while setting shooter jag: " 
                                                            + e.getMessage());
	}
    }
    
    public void maintainSpeed() {
        setSpeed(m_speed);
    }
}