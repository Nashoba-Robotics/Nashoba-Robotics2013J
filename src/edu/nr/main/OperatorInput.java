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
import edu.nr.main.commands.DetractArticulatedJag;
import edu.nr.main.commands.DeployCompressor;
import edu.nr.main.commands.StopDriving;
import edu.nr.main.commands.DriveTrack;
import edu.nr.main.commands.Autonomous;
import edu.nr.main.commands.IdleArticulatedJag;
import edu.nr.main.commands.AutoCompress;
import edu.nr.main.commands.DriveBase;
import edu.nr.main.commands.DeployTrackBrake;
import edu.nr.main.commands.DriveTrackDown_ForceSensorInputs;
import edu.nr.main.commands.DeployTipper;
import edu.nr.main.commands.IdleTrack;
import edu.nr.main.commands.LoadShooter;
import edu.nr.main.commands.DeployFixedArm;
import edu.nr.main.commands.UndeployTipper;
import edu.nr.main.commands.DeployArticulatedSolenoid;
import edu.nr.main.commands.IdleShooter;
import edu.nr.main.commands.UndeployFixedArm;
import edu.nr.main.commands.UndeployTrackBrake;
import edu.nr.main.commands.StopShooter;
import edu.nr.main.commands.DetractCompressor;
import edu.nr.main.commands.IdleTipper;
import edu.nr.main.commands.DeployArticulatedJag;
import edu.nr.main.commands.UndeployArticulatedSolenoid;
import edu.nr.main.commands.IdleFixedArm;
import edu.nr.main.commands.CancelAll;
import edu.nr.main.commands.ShootFourFrisbees;
import edu.nr.main.commands.RunShooter;
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
    Gamepad pad;
    XPad xPad;
    public OperatorInput() 
    {
        pad = new Gamepad(pad.kLeftStick);
        
        xPad = new XPad(xPad.kRightStick);    
        
        JoystickButton lStickButtonX = new JoystickButton(xPad, xPad.kLeftStickButton);
	lStickButtonX.whenPressed(new DeployTipper());
	
	JoystickButton rStickButtonX = new JoystickButton(xPad, xPad.kRightStickButton);
	rStickButtonX.whenPressed(new UndeployTipper());
	
	JoystickButton xButtonX = new JoystickButton(xPad, xPad.kXButton);
	xButtonX.whenPressed(new LoadShooter());
	
	JoystickButton bButtonX = new JoystickButton(xPad, xPad.kBButton);
	bButtonX.whenPressed(new StopShooter());
	
	JoystickButton rBumperButtonX = new JoystickButton(xPad, xPad.kRightBumper);
	rBumperButtonX.whenPressed(new DriveTrack(0.3f));
	
	JoystickButton lBumperButtonX = new JoystickButton(xPad, xPad.kLeftBumper);
	lBumperButtonX.whenPressed(new DriveTrack(-0.6f));
	
	JoystickButton startButtonX = new JoystickButton(xPad, xPad.kStartButton);
	startButtonX.whenPressed(new DeployCompressor());
	
	JoystickButton backButtonX = new JoystickButton(xPad, xPad.kBackButton);
	backButtonX.whenPressed(new AutoCompress());
	
	JoystickButton yButtonX = new JoystickButton(xPad, xPad.kYButton);
	yButtonX.whenPressed(new IdleTrack());

	JoystickButton aButtonX = new JoystickButton(xPad, XPad.kAButton);
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
        SmartDashboard.putData("Compressor Start Command", new DeployCompressor());
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
    
    public boolean getPadButton(int type)
    {
        return pad.getRawButton(type);
    }
    public float getPadRawAxis(int axis)
    {
        return (float)pad.getRawAxis(axis);
    }
    public float getXPadRawAxis(int axis)
    {
        return (float)xPad.getRawAxis(axis);
    }
    public boolean getXPadButton(int button)
    {
        return xPad.getRawButton(button);
    }
}
