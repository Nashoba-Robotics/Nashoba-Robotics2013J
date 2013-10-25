/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.nr.command_based;


import edu.nr.command_based.subsystems.Track;
import edu.nr.command_based.subsystems.PneumaticsCompressor;
import edu.nr.command_based.subsystems.FixedArm;
import edu.nr.command_based.subsystems.Shooter;
import edu.nr.command_based.subsystems.Tipper;
import edu.nr.command_based.subsystems.ArticulatingArm;
import edu.nr.command_based.subsystems.Drive;
import edu.nr.command_based.commands.AutonomousCommand;
import edu.nr.command_based.commands.CommandBase;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;
    ArticulatingArm articulatingArm;
    Drive drive;
    FixedArm fixedArm;
    PneumaticsCompressor pneumaticsCompressor;
    Tipper tipper;
    Shooter shooter;
    Track track;
    OI oi;
    
    double lastExecuteTime;
    double runTime;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // instantiate the command used for the autonomous period
        autonomousCommand = new AutonomousCommand();
        articulatingArm = new ArticulatingArm();
        drive = new Drive();
        fixedArm = new FixedArm();
        pneumaticsCompressor = new PneumaticsCompressor();
        tipper = new Tipper();
        shooter = new Shooter();
        track = new Track();
        
        oi = new OI();
        
        // Initialize all subsystems
        CommandBase.init();
        SmartDashboard.putData(drive);
    }

    public void autonomousInit() {
        if(autonomousCommand != null)
            autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if(autonomousCommand != null)
            autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        //LiveWindow.run();
    }
}
