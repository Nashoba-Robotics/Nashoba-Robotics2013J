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
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.Encoder.PIDSourceParameter;
import edu.wpi.first.wpilibj.can.*;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{
    public static Relay compressorRelay;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANJaguar driveCANJaguar1;
    public static CANJaguar driveCANJaguar2;
    public static CANJaguar driveCANJaguar3;
    public static CANJaguar driveCANJaguar4;
    public static RobotDrive driveRobotDrive41;
    public static Gyro driveGyro1;
    public static CANJaguar shooterCANJaguar1;
    public static DoubleSolenoid shooterLoaderSolenoid;
    public static Encoder trackQuadratureEncoder1;
    public static AnalogChannel trackAnalogForce1;
    public static AnalogChannel trackAnalogForce2;
    public static Solenoid trackBrakeSolenoid;
    public static SpeedController trackSpeedController1;
    public static SpeedController trackSpeedController2;
    public static Solenoid tippingSolenoid1;
    public static DigitalInput pneumaticsCompressorDigitalInput1;
    public static DoubleSolenoid articulatingArmDoubleSolenoid1;
    public static CANJaguar articulatingArmArticulatingCANJaguar;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() 
    {
	compressorRelay = new Relay(1, Relay.Direction.kForward);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        try { 
            driveCANJaguar1 = new CANJaguar(2);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            driveCANJaguar2 = new CANJaguar(3);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            driveCANJaguar3 = new CANJaguar(4);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            driveCANJaguar4 = new CANJaguar(5);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        driveRobotDrive41 = new RobotDrive(driveCANJaguar1, driveCANJaguar2,
              driveCANJaguar3, driveCANJaguar4);
	
        driveRobotDrive41.setSafetyEnabled(false);
        driveRobotDrive41.setExpiration(0.1);
        driveRobotDrive41.setSensitivity(0.5);
        driveRobotDrive41.setMaxOutput(1.0);
        driveRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveGyro1 = new Gyro(1, 1);
        driveGyro1.setSensitivity(0.007);
        try { 
            shooterCANJaguar1 = new CANJaguar(7);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        shooterLoaderSolenoid = new DoubleSolenoid(1, 3, 6);      
	
        
        trackQuadratureEncoder1 = new Encoder(1, 1, 1, 2, false, EncodingType.k4X);
        trackQuadratureEncoder1.setDistancePerPulse(1.0);
        trackQuadratureEncoder1.setPIDSourceParameter(PIDSourceParameter.kRate);
        trackQuadratureEncoder1.start();
        trackAnalogForce1 = new AnalogChannel(1, 3);
        
        trackAnalogForce2 = new AnalogChannel(1, 4);
        
        trackBrakeSolenoid = new Solenoid(1, 1);
        
        trackSpeedController1 = new Victor(1, 1);
        
        trackSpeedController2 = new Victor(1, 2);
        
        tippingSolenoid1 = new Solenoid(1, 2);
        
        pneumaticsCompressorDigitalInput1 = new DigitalInput(1, 3);
        
        articulatingArmDoubleSolenoid1 = new DoubleSolenoid(1, 8, 7);      
	
        
        try { 
            articulatingArmArticulatingCANJaguar = new CANJaguar(6);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
