package edu.nr.main;

import edu.wpi.first.wpilibj.Joystick;

/**
 * XPad
 
 An extension of the Joystick class that works with the Microsoft X-Box
 controller
 */
public class XPad extends Joystick {
    XPad(int port) {
        super(port);
    }
    
    public static final int kLeftStick = 1;
    public static final int kRightStick = 2;
    
    public static final int kLeftXAxis = 1;
    public static final int kLeftYAxis = 2;
    public static final int kTriggerAxis = 3;
    public static final int kRightXAxis = 4;
    public static final int kRightYAxis = 5;
    public static final int kDPadXAxis = 6;
    
    public static final int kDPadYAxis = 7;
           
    public static final int kAButton = 1;
    public static final int kBButton = 2;
    public static final int kXButton = 3;
    public static final int kYButton = 4;
    public static final int kLeftBumper = 5;
    public static final int kRightBumper = 6;
    public static final int kBackButton = 7;
    public static final int kStartButton = 8;
    public static final int kLeftStickButton = 9;
    public static final int kRightStickButton = 10;
    
    /**
     * Get the x axis value from the desired joystick on the gamepad
     * 
     * @param stick The joystick that the x axis value is being read from
     * @return The x axis value on the specified joystick
     */
    double getX(String stick) {
        if( stick.equalsIgnoreCase("left") ) {
            return getRawAxis(kLeftXAxis);
        }
        else if( stick.equalsIgnoreCase("right") ) {
            return getRawAxis(kRightXAxis);
        }
        else {
            return 0.0;
        }
    }
    
    /**
     * Get the y axis value from the desired joystick on the gamepad
     * 
     * @param stick The joystick that the y axis value is being read from
     * @return The y axis value on the specified joystick
     */    
    double getY(String stick) {
        if( stick.equalsIgnoreCase("left") ) {
            return -getRawAxis(kLeftYAxis);
        }
        else if( stick.equalsIgnoreCase("right") ) {
            return -getRawAxis(kRightYAxis);
        }
        else {
            return 0.0;
        }
    }
    
    /**
     * Gets the value of the specified axis
     * 
     * @param axis The name of the axis you want to get the value of
     * @return The value reading of the desired axis
     */
    double getAxis(String axis) {
        if( axis.equalsIgnoreCase("left x") ) {
            return getRawAxis(kLeftXAxis);
        }
        else if( axis.equalsIgnoreCase("right x") ) {
            return getRawAxis(kRightXAxis);
        }
        else if( axis.equalsIgnoreCase("left y") ) {
            return getRawAxis(kLeftYAxis);
        }
        else if( axis.equalsIgnoreCase("right y") ) {
            return getRawAxis(kRightYAxis);
        }
        else if( axis.equalsIgnoreCase("dpad x") ) {
            return getRawAxis(kDPadXAxis);
        }
        else if( axis.equalsIgnoreCase("dpad y") ) {
            return getRawAxis(kDPadYAxis);
        }
        else if( axis.equalsIgnoreCase("trigger") ) {
            return getRawAxis(kTriggerAxis);
        }
        else {
            return 0.0;
        }
    }
    
    /**
     * Checks the state of the desired button
     * 
     * @param button The button name that you want to check
     * @return Whether the specified button is being pressed
     */
    boolean getButton(String button) {
        if( button.equalsIgnoreCase("x") ) {
            return getRawButton(kXButton);
        }
        else if(button.equalsIgnoreCase("y") ) {
            return getRawButton(kYButton);
        }
        else if(button.equalsIgnoreCase("a") ) {
            return getRawButton(kAButton);
        }
        else if(button.equalsIgnoreCase("b") ) {
            return getRawButton(kBButton);
        }
        else if(button.equalsIgnoreCase("left bumper") ) {
            return getRawButton(kLeftBumper);
        }
        else if(button.equalsIgnoreCase("right bumper") ) {
            return getRawButton(kRightBumper);
        }
        else if(button.equalsIgnoreCase("back") ) {
            return getRawButton(kBackButton);
        }
        else if(button.equalsIgnoreCase("start") ) {
            return getRawButton(kStartButton);
        }
        else if(button.equalsIgnoreCase("left stick") ) {
            return getRawButton(kLeftStickButton);
        }
        else if(button.equalsIgnoreCase("right stick") ) {
            return getRawButton(kRightStickButton);
        }
        else {
            return false;
        }
    }
}