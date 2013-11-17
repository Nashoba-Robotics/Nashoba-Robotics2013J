package edu.nr.main.subsystems;

import edu.wpi.first.wpilibj.SensorBase;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.DigitalModule;

public class arduino extends SensorBase{
    protected static final int kAddr = 0x02;
    protected static final int kReg = 0x32;
    protected I2C m_i2c;
    
    public arduino(int modNo) {
        m_i2c = null;
        DigitalModule m_mod = DigitalModule.getInstance(modNo);
        if(m_mod != null) {
            m_i2c = m_mod.getI2C(kAddr);
        }
    }
    
    double getForce(int sensor) {
        Integer raw_force = new Integer(0);
        final int count = 7;
        if(m_i2c != null) {
            m_i2c.read(kReg, count, raw_force.toString().getBytes());
            raw_force = Integer.valueOf(( (raw_force.intValue() >> 8) & 0xFF) | (raw_force.intValue() << 8));
        }
        System.out.println("Force: " + raw_force);
        return raw_force.doubleValue();
    }
}
