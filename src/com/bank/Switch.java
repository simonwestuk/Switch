package com.bank;
/**
 * An electronic switch that can be on/off.
 */
public class Switch {

    private boolean isOn;

    public Switch(boolean isOn){
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean state) {
        isOn = state;
    }
}

