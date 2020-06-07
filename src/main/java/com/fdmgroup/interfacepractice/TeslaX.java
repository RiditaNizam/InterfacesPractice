package com.fdmgroup.interfacepractice;

public class TeslaX implements Car {

	public void accelerate() {
		System.out.println("Electric motor engages");
	}

	public void decelerate() {
		System.out.println("Regenerative brakes engage");
	}

	public void turn(String direction) {
		System.out.println("Wheels turn " + direction);
	}

}