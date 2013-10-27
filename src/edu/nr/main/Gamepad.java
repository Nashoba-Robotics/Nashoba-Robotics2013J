package edu.nr.main;

import edu.wpi.first.wpilibj.Joystick;
import com.sun.squawk.util.SquawkHashtable;

public class Gamepad extends Joystick
{
    Gamepad(int port) {
        super(port);
        makeMaps();
    }
    public SquawkHashtable stickType = new SquawkHashtable();
    public SquawkHashtable axisType = new SquawkHashtable();
    public SquawkHashtable buttonType = new SquawkHashtable();
    
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
        
    void makeMaps() {
        // Stick types
        stickType.put("kLeftStick", new Integer(kLeftStick));
        stickType.put("kRightStick", new Integer(kRightStick));
        
        // Axis types
        axisType.put("kLeftXAxis", new Integer(kLeftXAxis));
        axisType.put("kLeftYAxis", new Integer(kLeftYAxis));
        axisType.put("kRightXAxis", new Integer(kRightXAxis));
        axisType.put("kRightYAxis", new Integer(kRightYAxis));
        axisType.put("kDPadXAxis", new Integer(kDPadXAxis));
        axisType.put("kDPadYAxis", new Integer(kDPadYAxis));
        
        // Button types
        buttonType.put("kXButton", new Integer(kXButton));
        buttonType.put("kAButton", new Integer(kYButton));
        buttonType.put("kBButton", new Integer(kBButton));
        buttonType.put("kYButton", new Integer(kYButton));
        buttonType.put("kLeftBumper", new Integer(kLeftBumper));
        buttonType.put("kRightBumper", new Integer(kRightBumper));
        buttonType.put("kLeftTrigger", new Integer(kLeftTrigger));
        buttonType.put("kRightTrigger", new Integer(kRightTrigger));
        buttonType.put("kBackButton", new Integer(kBackButton));
        buttonType.put("kStartButton", new Integer(kStartButton));
        buttonType.put("kLeftStickButton", new Integer(kLeftStickButton));
        buttonType.put("kRightStickButton", new Integer(kRightStickButton));
    }
    
    double getX(String stick) {
        Object value = axisType.get(stick);
        if(value.equals(new Integer(kLeftStick))) {
            return getRawAxis(kLeftXAxis);
        }
        else if(value.equals(new Integer(kRightStick))) {
            return getRawAxis(kRightXAxis);
        }
        else
            return 0.0;
    }
    
    double getY(String stick) {
        Object value = axisType.get(stick);
        if(value.equals(new Integer(kLeftStick))) {
            return getRawAxis(kLeftYAxis);
        }
        else if(value.equals(new Integer(kRightStick))) {
            return getRawAxis(kRightYAxis);
        }
        else
            return 0.0;
    }
    
    double getAxis(String axis){
        return 0.0;
    }
}
