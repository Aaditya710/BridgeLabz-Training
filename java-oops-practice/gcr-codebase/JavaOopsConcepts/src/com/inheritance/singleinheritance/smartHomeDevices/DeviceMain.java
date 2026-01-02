package com.inhertance.singleinheritance.smartHomeDevices;

public class DeviceMain {
	    public static void main(String[] args) {

	        Thermostat t1 = new Thermostat(101, "ON", 24.5);
	        t1.displayStatus();
	    }
}