// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package edu.nr.main;
import edu.nr.main.commands.ArticulatingunextendCommand;
import edu.nr.main.commands.CompressorStartCommand;
import edu.nr.main.commands.DriveBrakeCommand;
import edu.nr.main.commands.TrackDriveSpeedCommand;
import edu.nr.main.commands.AutonomousCommand;
import edu.nr.main.commands.ArticulatingIdleCommand;
import edu.nr.main.commands.CompressorAutomaticToggleCommand;
import edu.nr.main.commands.DriveDriveCommand;
import edu.nr.main.commands.TrackDeployBrakeCommand;
import edu.nr.main.commands.TrackDriveDownUntilForceCommand;
import edu.nr.main.commands.TippingDeployCommand;
import edu.nr.main.commands.TrackIdleCommand;
import edu.nr.main.commands.ShooterLoadCommand;
import edu.nr.main.commands.FixedDeployCommand;
import edu.nr.main.commands.TippingUndeployCommand;
import edu.nr.main.commands.ArticulatingDeployCommand;
import edu.nr.main.commands.ShooterIdleCommand;
import edu.nr.main.commands.FixedundeployCommand;
import edu.nr.main.commands.TrackUndeployBrakeCommand;
import edu.nr.main.commands.ShooterStopCommand;
import edu.nr.main.commands.CompressorStopCommand;
import edu.nr.main.commands.TippingIdleCommand;
import edu.nr.main.commands.ArticulatingExtendCommand;
import edu.nr.main.commands.ArticulatingUndeployCommand;
import edu.nr.main.commands.FixedIdleCommand;
import edu.nr.main.commands.CancelAllCommand;
import edu.nr.main.commands.ShootFourTimesCommand;
import edu.nr.main.commands.ShooterRunCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Gamepad pad;
    XPad xPad;
    public OI() 
    {
        pad = new Gamepad(pad.kLeftStick);
        
        xPad = new XPad(xPad.kRightStick);    
        
        JoystickButton lStickButtonX = new JoystickButton(xPad, xPad.kLeftStickButton);
	lStickButtonX.whenPressed(new TippingDeployCommand());
	
	JoystickButton rStickButtonX = new JoystickButton(xPad, xPad.kRightStickButton);
	rStickButtonX.whenPressed(new TippingUndeployCommand());
	
	JoystickButton xButtonX = new JoystickButton(xPad, xPad.kXButton);
	xButtonX.whenPressed(new ShooterLoadCommand());
	
	JoystickButton bButtonX = new JoystickButton(xPad, xPad.kBButton);
	bButtonX.whenPressed(new ShooterStopCommand());
	
	JoystickButton rBumperButtonX = new JoystickButton(xPad, xPad.kRightBumper);
	rBumperButtonX.whenPressed(new TrackDriveSpeedCommand(0.3f));
	
	JoystickButton lBumperButtonX = new JoystickButton(xPad, xPad.kLeftBumper);
	lBumperButtonX.whenPressed(new TrackDriveSpeedCommand(-0.6f));
	
	JoystickButton startButtonX = new JoystickButton(xPad, xPad.kStartButton);
	startButtonX.whenPressed(new CompressorStartCommand());
	
	JoystickButton backButtonX = new JoystickButton(xPad, xPad.kBackButton);
	backButtonX.whenPressed(new CompressorAutomaticToggleCommand());
	
	JoystickButton yButtonX = new JoystickButton(xPad, xPad.kYButton);
	yButtonX.whenPressed(new TrackIdleCommand());
	
	JoystickButton aButtonX = new JoystickButton(xPad, xPad.kAButton);
	aButtonX.whenPressed(new ShooterRunCommand(0.65f));
            
                
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Articulating Idle Command", new ArticulatingIdleCommand());
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Drive Drive Command", new DriveDriveCommand());
        SmartDashboard.putData("Drive Brake Command", new DriveBrakeCommand());
        SmartDashboard.putData("Shooter Idle Command", new ShooterIdleCommand());
        SmartDashboard.putData("Shooter Load Command", new ShooterLoadCommand());
        SmartDashboard.putData("Shooter Stop Command", new ShooterStopCommand());
        SmartDashboard.putData("Track Idle Command", new TrackIdleCommand());
        SmartDashboard.putData("Track Drive Down Until Force Command", new TrackDriveDownUntilForceCommand());
        SmartDashboard.putData("Compressor Start Command", new CompressorStartCommand());
        SmartDashboard.putData("Compressor Stop Command", new CompressorStopCommand());
        SmartDashboard.putData("Tipping Deploy Command", new TippingDeployCommand());
        SmartDashboard.putData("Tipping Undeploy Command", new TippingUndeployCommand());
        SmartDashboard.putData("Tipping Idle Command", new TippingIdleCommand());
        SmartDashboard.putData("Shoot Four Times Command", new ShootFourTimesCommand());
        SmartDashboard.putData("Compressor Automatic Toggle Command", new CompressorAutomaticToggleCommand());
        SmartDashboard.putData("Track Deploy Brake Command", new TrackDeployBrakeCommand());
        SmartDashboard.putData("Track Undeploy Brake Command", new TrackUndeployBrakeCommand());
        SmartDashboard.putData("Shooter Run Command", new ShooterRunCommand(0.65f));
        SmartDashboard.putData("Articulating Extend Command", new ArticulatingExtendCommand());
        SmartDashboard.putData("Articulating unextend Command", new ArticulatingunextendCommand());
        SmartDashboard.putData("Cancel All Command", new CancelAllCommand());
        SmartDashboard.putData("FixedDeployCommand", new FixedDeployCommand());
        SmartDashboard.putData("FixedundeployCommand", new FixedundeployCommand());
        SmartDashboard.putData("FixedIdleCommand", new FixedIdleCommand());
        SmartDashboard.putData("ArticulatingDeployCommand", new ArticulatingDeployCommand());
        SmartDashboard.putData("ArticulatingUndeployCommand", new ArticulatingUndeployCommand());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        SmartDashboard.putData("Tipping Idle Command", new TippingIdleCommand());
	
	
	SmartDashboard.putData("Tipping Deploy Command", new TippingDeployCommand());
	SmartDashboard.putData("Tipping Undeploy Command", new TippingUndeployCommand());
	SmartDashboard.putData("Shooter Load Command", new ShooterLoadCommand());
	SmartDashboard.putData("Shooter Stop Command", new ShooterStopCommand());
	SmartDashboard.putData("Track Drive Down Until Force Command", new TrackDriveDownUntilForceCommand());
	
	SmartDashboard.putData("Tipping Deploy Command", new TippingDeployCommand());
	SmartDashboard.putData("Tipping Undeploy Command", new TippingUndeployCommand());
	SmartDashboard.putData("Shoot Four Times Command", new ShootFourTimesCommand());
	SmartDashboard.putData("Shooter Load Command", new ShooterLoadCommand());
	SmartDashboard.putData("Shooter Run Command", new ShooterRunCommand(0.65f));
	
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
