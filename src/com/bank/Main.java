package com.bank;

public class Main {

    public static void main(String[] args) {



        AdjustableSwitch a1 = new AdjustableSwitch(2);
        System.out.println(a1.isOn());

        AdjustableSwitch a2 = new AdjustableSwitch(0);
        System.out.println(a2.isOn());
        a2.setLevel(0);
        System.out.println(a2.getLevel());

    }
}
