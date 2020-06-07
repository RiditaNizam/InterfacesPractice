package com.fdmgroup.interfacepractice;

public interface Car {

	public static final int numOfWheels = 4;

	public abstract void accelerate();

	public abstract void decelerate();

	public abstract void turn(String direction);

}
