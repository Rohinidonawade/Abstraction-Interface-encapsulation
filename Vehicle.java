package com.vstl.oopsInterfaceMultipleInheritance;

public class Vehicle implements BMWCar,ToyotaCar{

	@Override
	public void getStart() {

		System.out.println("The BMW car Start");
		
		System.out.println("The Toyota car Start");
	}

	@Override
	public void getStop() {
		System.out.println("The Toyota car stop");
	}

	@Override
	public void getRefuel() {
		System.out.println("The BMW car Refuel");
	}	
}
