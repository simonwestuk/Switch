package com.bank;

public class AdjustableSwitch extends Switch {

    private float level;

    public AdjustableSwitch(float level) {
        super(level != 0);
        this.level = level;
    }

    public void setLevel(float level) {
        this.level = level;
        this.setOn(level != 0);
    }

    public float getLevel() {
        return this.isOn() ? level : 0;

    }
}
