package com.index.pack;

abstract class Appliance {
    
    abstract void turnOn();
    abstract void turnOff();
}

class Fan1 extends Appliance {

    void turnOn() {
        System.out.println("Fan1 is turned ON");
    }

    void turnOff() {
        System.out.println("Fan1 is turned OFF");
    }
}

class WashingMachine extends Appliance {

    void turnOn() {
        System.out.println("Washing Machine is started");
    }
    void turnOff() {
        System.out.println("Washing Machine is stopped");
    }
}

public class AbstractM1 {
    public static void main(String[] args) {
        Appliance fan = new Fan1();
        fan.turnOn();
        fan.turnOff();
        System.out.println();
        Appliance wm = new WashingMachine();
        wm.turnOn();
        wm.turnOff();
    }
}



