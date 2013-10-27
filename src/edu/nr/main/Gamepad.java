package edu.nr.main;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Gamepad
 * 
 * An extension of the Joystick class that works with the Logitech F-310 gamepad
 */
public class Gamepad extends Joystick
{
    Gamepad(int port) {
        super(port);
    }
    public final int kLeftStick = 1;
    public final int kRightStick = 2;
    
    public final int kLeftXAxis = 1;
    public final int kLeftYAxis= 2;
    public final int kRightXAxis= 3;
    public final int kRightYAxis= 4;
    public final int kDPadXAxis= 5;
    public final int kDPadYAxis= 6;

    public final int kXButton = 1;
    public final int kAButton= 2;
    public final int kBButton= 3;
    public final int kYButton= 4;
    public final int kLeftBumper= 5;
    public final int kRightBumper= 6;
    public final int kLeftTrigger= 7;
    public final int kRightTrigger=8 ;
    public final int kBackButton= 9;
    public final int kStartButton= 10;
    public final int kLeftStickButton= 11;
    public final int kRightStickButton= 12;

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
            return getRawAxis(kLeftYAxis);
        }
        else if( stick.equalsIgnoreCase("right") ) {
            return getRawAxis(kRightYAxis);
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
        else if(button.equalsIgnoreCase("left trigger") ) {
            return getRawButton(kLeftTrigger);
        }
        else if(button.equalsIgnoreCase("right trigger") ) {
            return getRawButton(kRightTrigger);
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