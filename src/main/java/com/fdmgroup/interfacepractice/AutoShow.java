package com.fdmgroup.interfacepractice;

//Doesn't need to know how Tesla acts or Oldsmobile written
//Whoever writes Autoshow only needs to know how to interface works
public class AutoShow {

	public static void main(String[] args) {

		Car johnsCar = new TeslaX();
		johnsCar.accelerate();

		// Even if there were methods that were added to Oldsmobile442 that weren't in
		// Car, we can still access them from janicesCar.
		Oldsmobile442 janicesCar = new Oldsmobile442();
		janicesCar.turn("left");
	}

}
