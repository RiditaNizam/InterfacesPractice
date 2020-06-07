package com.fdmgroup.interfacepractice;

public class Oldsmobile442 implements Car {

	public void accelerate() {
		System.out.println("Gas engine engages");
	}

	public void decelerate() {
		System.out.println("Drum brakes engage");
	}

	public void turn(String direction) {
		System.out.println("Wheels rotate " + direction);
	}

}
