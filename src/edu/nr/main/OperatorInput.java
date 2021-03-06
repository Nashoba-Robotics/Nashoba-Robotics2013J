// robotBuilder Version: 0.0.2
//
// This file was generated by robotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from robotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package edu.nr.main;
import edu.nr.main.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OperatorInput 
{
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    XPad xPad1, xPad2;
    public OperatorInput() 
    {
        xPad1 = new XPad(1);
        
        xPad2 = new XPad(2);    
        
        JoystickButton lStickButtonX = new JoystickButton(xPad1, xPad1.kLeftStickButton);
	lStickButtonX.whenPressed(new DeployTipper());
	
	JoystickButton rStickButtonX = new JoystickButton(xPad1, xPad1.kRightStickButton);
	rStickButtonX.whenPressed(new UndeployTipper());
	
	JoystickButton xButtonX = new JoystickButton(xPad1, xPad1.kXButton);
	xButtonX.whenPressed(new LoadShooter());
	
	JoystickButton bButtonX = new JoystickButton(xPad1, xPad1.kBButton);
	bButtonX.whenPressed(new StopShooter());
	
	JoystickButton rBumperButtonX = new JoystickButton(xPad1, xPad1.kRightBumper);
	rBumperButtonX.whenPressed(new BumpShooterSpeed(true));
	
	JoystickButton lBumperButtonX = new JoystickButton(xPad1, xPad1.kLeftBumper);
	lBumperButtonX.whenPressed(new BumpShooterSpeed(false));
	
	JoystickButton startButtonX = new JoystickButton(xPad1, xPad1.kStartButton);
	startButtonX.whenPressed(new ToggleCompressor());
	
	JoystickButton backButtonX = new JoystickButton(xPad1, xPad1.kBackButton);
	backButtonX.whenPressed(new AutoCompress());
	
	JoystickButton yButtonX = new JoystickButton(xPad1, xPad1.kYButton);
	yButtonX.whenPressed(new IdleTrack());

	JoystickButton aButtonX = new JoystickButton(xPad1, XPad.kAButton);
	aButtonX.whenPressed(new RunShooter());
                
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Articulating Idle Command", new IdleArticulatedJag());
        SmartDashboard.putData("Autonomous Command", new Autonomous());
        SmartDashboard.putData("Drive Drive Command", new DriveBase());
        SmartDashboard.putData("Drive Brake Command", new StopDriving());
        SmartDashboard.putData("Shooter Idle Command", new IdleShooter());
        SmartDashboard.putData("Shooter Load Command", new LoadShooter());
        SmartDashboard.putData("Shooter Stop Command", new StopShooter());
        SmartDashboard.putData("Track Idle Command", new IdleTrack());
        SmartDashboard.putData("Track Drive Down Until Force Command", new DriveTrackDown_ForceSensorInputs());
        SmartDashboard.putData("Compressor Start Command", new ToggleCompressor());
        SmartDashboard.putData("Compressor Stop Command", new DetractCompressor());
        SmartDashboard.putData("Tipping Deploy Command", new DeployTipper());
        SmartDashboard.putData("Tipping Undeploy Command", new UndeployTipper());
        SmartDashboard.putData("Tipping Idle Command", new IdleTipper());
        SmartDashboard.putData("Shoot Four Times Command", new ShootFourFrisbees());
        SmartDashboard.putData("Compressor Automatic Toggle Command", new AutoCompress());
        SmartDashboard.putData("Track Deploy Brake Command", new DeployTrackBrake());
        SmartDashboard.putData("Track Undeploy Brake Command", new UndeployTrackBrake());
        SmartDashboard.putData("Shooter Run Command", new RunShooter());
        SmartDashboard.putData("Articulating Extend Command", new DeployArticulatedJag());
        SmartDashboard.putData("Articulating unextend Command", new DetractArticulatedJag());
        SmartDashboard.putData("Cancel All Command", new CancelAll());
        SmartDashboard.putData("FixedDeployCommand", new DeployFixedArm());
        SmartDashboard.putData("FixedundeployCommand", new UndeployFixedArm());
        SmartDashboard.putData("FixedIdleCommand", new IdleFixedArm());
        SmartDashboard.putData("ArticulatingDeployCommand", new DeployArticulatedSolenoid());
        SmartDashboard.putData("ArticulatingUndeployCommand", new UndeployArticulatedSolenoid());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        SmartDashboard.putData("Tipping Idle Command", new IdleTipper());
	
	
	SmartDashboard.putData("Tipping Deploy Command", new DeployTipper());
	SmartDashboard.putData("Tipping Undeploy Command", new UndeployTipper());
	SmartDashboard.putData("Shooter Load Command", new LoadShooter());
	SmartDashboard.putData("Shooter Stop Command", new StopShooter());
	SmartDashboard.putData("Track Drive Down Until Force Command", new DriveTrackDown_ForceSensorInputs());
	
	SmartDashboard.putData("Tipping Deploy Command", new DeployTipper());
	SmartDashboard.putData("Tipping Undeploy Command", new UndeployTipper());
	SmartDashboard.putData("Shoot Four Times Command", new ShootFourFrisbees());
	SmartDashboard.putData("Shooter Load Command", new LoadShooter());
	SmartDashboard.putData("Shooter Run Command", new RunShooter());
	
	SmartDashboard.putBoolean("Compressor Automatic", false);
	SmartDashboard.putNumber("SD Times Per Second", 5);
	SmartDashboard.putNumber("Shooter Jag Speed", 0);
	SmartDashboard.putNumber("TRACK DOWN SPEED", 0);
        
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    
    public boolean getFirstXPadButton(int type)
    {
        return xPad1.getRawButton(type);
    }
    public float getFirstXPadRawAxis(int axis)
    {
        return (float)xPad1.getRawAxis(axis);
    }
    public float getSecondXPadRawAxis(int axis)
    {
        return (float)xPad1.getRawAxis(axis);
    }
    public boolean getSecondXPadButton(int button)
    {
        return xPad1.getRawButton(button);
    }
}
